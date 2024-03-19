package Repaso.Generics;

import lombok.ToString;

@ToString
public class Product {

    Long id;
    String name;
    Double Salary;

    public Product(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}
