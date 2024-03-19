package Repaso.Generics;

public class Prueba {

    public static void main(String[] args) {
        EmployeeDB e = new EmployeeDB();
        System.out.println(e.getById(1L).getName());
    }
}
