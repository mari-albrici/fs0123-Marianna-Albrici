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
public class Section implements IBook {

    List<IBook> sections = new ArrayList<>();
    List<String> authors = new ArrayList<>();
    int pages;

    public void addPageToSection(Page page){
        sections.add(page);
    }

    public void removePageFromSection(Page page){
        sections.remove(page);
    }
    @Override
    public void printBook() {
        for(IBook section : sections){
            section.printBook();
        }
    }

    @Override
    public int getPages() {
        for(IBook section : sections){
            pages += section.getPages();
        }
        return pages;
    }

    @Override
    public List<String> getAuthors() {
        for(IBook section : sections){
            authors.add(section.getAuthors().toString());
        }
        return authors;
    }

    @Override
    public Double getPrice() {
        double sectionPrice = 0;
        for(IBook section : sections){
            sectionPrice += section.getPrice();
        }
        return sectionPrice;
    }
}
