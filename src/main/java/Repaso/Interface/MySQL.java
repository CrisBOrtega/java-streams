package Repaso.Interface;

import java.util.List;

public class MySQL  implements  IConsultable{
    @Override
    public String getById(Long id) {
        return "Data de mysql para id" + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello from Mysqwl");
    }
}
