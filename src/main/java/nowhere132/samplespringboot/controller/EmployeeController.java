package nowhere132.samplespringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nowhere132.samplespringboot.dao.EmployeeDAO;
import nowhere132.samplespringboot.model.Employee;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    EmployeeDAO employeeDAO;

    @GetMapping(value = "/list")
    public List<Employee> getList() {
        return employeeDAO.getList();
    }
}