package exercise;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		//************** OTHER NEEDED THINGS **************
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		LocalDate date1 = LocalDate.parse("01/02/2021 12:05:00", formatter);
		LocalDate date2 = LocalDate.parse("01/04/2021 12:05:00", formatter);
		LocalDate orderTwoOrderDate = LocalDate.parse("15/03/2021 12:05:00", formatter);
		
		//************** CREAZIONE CLIENTI **************
		
		List<Customer> costumers = new ArrayList<Customer>();
		
		Customer marianna = new Customer("Marianna", 5);
		Customer elisa = new Customer("Elisa", 2);
		Customer alice = new Customer("Alice", 3);
		Customer nicola = new Customer("Nicola", 2);
		Customer virginia = new Customer("Virginia", 5);
		Customer andrea = new Customer("Andrea", 4);
		Customer matteo = new Customer("Matteo", 1);
		Customer emauele = new Customer("Emanuele", 1);
		Customer greta = new Customer("Greta", 2);
		
		
		//************** CREAZIONE PRODOTTI **************
		
		List<Product> products = new ArrayList<Product>();
		
		Product productOne = new Product("Ruspa", "Boys", 19.90 );
		Product productTwo = new Product("Il genio non esiste", "Books", 120.80 );
		Product productThree = new Product("Nappies", "Baby", 24.50 );
		Product productFour = new Product("Hot Wheels", "Boys", 3.90 );
		Product productFive = new Product("Il metedo mea", "Books", 12.90 );
		Product productSix = new Product("Binky", "Baby", 3.40 );
		Product productSeven = new Product("Pallone", "Boys", 0.90 );
		Product productEight = new Product("Toy", "Baby", 19.90 );
		Product productNine = new Product("Orgoglio e Pregiudizio", "Books", 19.90 );
		
		products.add(productOne);
		products.add(productTwo);
		products.add(productThree);
		products.add(productFour);
		products.add(productFive);
		products.add(productSix);
		products.add(productSeven);
		products.add(productEight);
		products.add(productNine);
		
		//************** CREAZIONE ORDINI **************
		
		List<Order> orders = new ArrayList<Order>();
		
		LocalDate today = LocalDate.now();	
		LocalDate delivery = today.plusDays(5);	
		
		
		
		Order orderOne = new Order(1l, "sent", today, delivery, products, elisa);
		Order orderTwo = new Order(2l, "received", orderTwoOrderDate, delivery.minusDays(2), products, elisa);
		
		//************** EXERCISE 1 **************
		
		List<String> costsMoreThan100 = products.stream()
				.filter(book -> book.getProductCategory().equals("Books"))
				.filter(book -> book.getProductPrice() > 100).map(Product::getProductName)
				.toList();	
		
		logger.info("Books that cost more than $100 are: " + costsMoreThan100);
		
		
		//************** EXERCISE 2 **************
		
		List<Order> containsBabyProducts = orders.stream()
                .filter(order -> order.getOrderProducts()
                		.stream()
                        .anyMatch(product -> product.getProductCategory().equals("Baby")))
                .toList();
		
		 logger.info("Orders with baby products are: " + containsBabyProducts.toString());
		 
		
		//************** EXERCISE 3 **************
		 
	    List<String> discountedProducts = products.stream()
                .filter(product -> product.getProductCategory().equals("Boys"))
                .map(product -> {
                    product.setProductPrice(product.getProductPrice() * 0.9);
                    return product.getProductInfo();
                }).toList();
	    
	    logger.info("Discounted products: " + discountedProducts);
		
		
		//************** EXERCISE 4 **************
	    
//	    List<String> tierTwoOrders = orders.stream()
//                .filter(order -> order.getCustomer().getCustomerTier() == 2)
//                .filter(order -> order.getOrderDate().isAfter(date1) && order.getOrderDate().isBefore(date2))
//                .flatMap(Order::getOrderProducts)
//                .collect(Collectors.toList());

//	    logger.info("The products ordered by tier 2 clients are: " + tierTwoOrders);
	}

}
