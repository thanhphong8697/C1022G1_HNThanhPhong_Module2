package Map.Exercise.ModelTotal.Service;

import Map.Exercise.ModelTotal.Model.Product;

public interface IProductMana {

    void extra(Product product);

    void change(int index, Product product);

    void display();

    void search(String name);

    void sort();
}
