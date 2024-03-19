package Repaso.Anonimas;

import Repaso.Generics.IDatabaseService;

import java.util.List;

public class App {

    public static void main(String[] args) {

        //Definimos la clase anonima
        IDatabaseService<String> db = new IDatabaseService<String>() {
            @Override
            public String getById(Long id) {
                return null;
            }

            @Override
            public List<String> getAll() {
                return null;
            }
        };

        System.out.println(db.getClass().getName());
    }
}
