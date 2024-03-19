package Repaso.Generics;

import java.util.List;

public class EmployeeDB implements IDatabaseService<Employee>{
    @Override
    public Employee getById(Long id) {
        return new Employee(1L, "Shaman" , 234324.8);
    }

    @Override
    public List<Employee> getAll() {
        return List.of(new Employee(1L, "Shaman" , 234324.8));
    }
}
