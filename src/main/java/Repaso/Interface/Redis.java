package Repaso.Interface;

import java.util.List;

public class Redis implements IConsultable{
    @Override
    public String getById(Long id) {
        return "Data de mongo para id" + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello from Redis");
    }
}
