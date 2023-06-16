package designPatterns.es2.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Page implements IBook {

    double price;
    String author;
    String text;

    @Override
    public void printBook() {
    System.out.println(text);
    }

    @Override
    public int getPages() {
    return 1;
    }

    @Override
    public List<String> getAuthors() {
        List<String> authorList = new ArrayList<>();
        authorList.add(author);
        return authorList;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
