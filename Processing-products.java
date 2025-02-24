import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    String category;
    double price;
    
    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    
    public String toString() {
        return name + " " + category + " " + price;
    }
}

public class ProductStream {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Xiomi M11", "Electronics", 800));
        list.add(new Product("Macbook", "Electronics", 600));
        list.add(new Product("Samsung Tablet", "Electronics", 300));
        list.add(new Product("Blue Shirt", "Clothing", 50));
        list.add(new Product("Bean Jeans", "Clothing", 80));
        list.add(new Product("LG Microwave", "Appliances", 150));
        list.add(new Product("Whirlpool Refrigerator", "Appliances", 1000));
        
        Map<String, List<Product>> groups = list.stream()
            .collect(Collectors.groupingBy(p -> p.category));
        for(String key : groups.keySet()) {
            System.out.println(key + " " + groups.get(key));
        }
        
        Map<String, Product> expensive = list.stream()
            .collect(Collectors.groupingBy(p -> p.category,
                Collectors.collectingAndThen(Collectors.maxBy((a, b) -> Double.compare(a.price, b.price)), 
                opt -> opt.get())));
        for(String key : expensive.keySet()) {
            System.out.println(key + " " + expensive.get(key));
        }
        
        double avg = list.stream()
            .mapToDouble(p -> p.price)
            .average().orElse(0);
        System.out.println("Average Price: " + avg);
        
        System.out.println("Name: Pratik Mishra Uid: 22bcs15965");
    }
}
