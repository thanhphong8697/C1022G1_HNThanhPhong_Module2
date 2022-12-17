package Map.Exercise.Product.ModelTotal.Repository;

import Map.Exercise.Product.ModelTotal.Model.Product;

import java.util.*;

public class ProductRepo implements IProductRepo {
    List<Product> productList = new ArrayList<>();
    Product product1 = new Product(1, "Pen", 10000);
    Product product2 = new Product(2, "Book", 20000);
    Product product3 = new Product(3, "Notebook", 15000);

    {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

    }

    @Override
    public void extra(Product product) {
        productList.add(product);
    }

    @Override
    public void change(int index, Product product) {
        productList.set(index, product);
    }

    @Override
    public void display() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
    }

    @Override
    public void search(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(name)) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        });
    }
}
