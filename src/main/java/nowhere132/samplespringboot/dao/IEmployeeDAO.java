package nowhere132.samplespringboot.dao;

import java.util.List;

import nowhere132.samplespringboot.model.Employee;

public interface IEmployeeDAO {
    List<Employee> getList();

    // void insertEmployee(Employee emp);

    // void updateEmployee(Employee emp);

    // void executeUpdateEmployee(Employee emp);

    // public void deleteEmployee(Employee emp);
}