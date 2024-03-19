package Repaso.Interface;

import java.util.List;

public interface IConsultable {

    String getById(Long id);
    List<String> getAllRecords();
}
