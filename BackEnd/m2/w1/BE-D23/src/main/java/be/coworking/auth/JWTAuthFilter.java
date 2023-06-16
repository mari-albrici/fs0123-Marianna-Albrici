package be.coworking.auth;

import be.coworking.entities.User;
import be.coworking.exceptions.NotFound;
import be.coworking.exceptions.Unauthorized;
import be.coworking.services.UserService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTAuthFilter extends OncePerRequestFilter {
    @Autowired
    private UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        if (!request.getMethod().equals("OPTIONS"))

        {
            String authHeader = request.getHeader("Authorization");

            if (authHeader == null || !authHeader.startsWith("Bearer "))
                throw new Unauthorized("Per favore aggiungi il token all'authorization header");

            String accessToken = authHeader.substring(7);

            JWTTools.isTokenValid(accessToken);

            String email = JWTTools.extractSubject(accessToken);
            System.out.println("******************************** " + email);

            try {
                User user = userService.findByEmail(email);


                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(user, null,
                        user.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(authToken);

                filterChain.doFilter(request, response);

            } catch (NotFound e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            filterChain.doFilter(request, response);
        }
    }


    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) {
        return new AntPathMatcher().match("/auth/**", request.getServletPath());
    }

}
