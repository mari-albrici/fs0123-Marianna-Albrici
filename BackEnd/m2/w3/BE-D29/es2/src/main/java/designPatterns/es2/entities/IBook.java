package designPatterns.es2.entities;

import java.util.List;

public interface IBook {
    void printBook();
    int getPages();
    List<String> getAuthors();
    Double getPrice();

}
