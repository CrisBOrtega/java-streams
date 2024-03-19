package Repaso.Generics;

import java.util.List;

public class ProductDB implements IDatabaseService<Product>{
    @Override
    public Product getById(Long id) {
        Product p = new Product(1L , "Bici", 2344.9);
        return p;
    }

    @Override
    public List<Product> getAll() {
        return List.of(new Product(1L, "Car", 6546.7));
    }
}
