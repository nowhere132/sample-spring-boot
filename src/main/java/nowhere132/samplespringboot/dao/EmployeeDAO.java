package nowhere132.samplespringboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import nowhere132.samplespringboot.model.Employee;

@Repository
public class EmployeeDAO implements IEmployeeDAO {
    @Autowired
    JdbcTemplate myJdbc;

    @Override
    public List<Employee> getList() {
        String sql = "SELECT * FROM employee";
        List<Employee> result = myJdbc.query(sql, new BeanPropertyRowMapper<>(Employee.class));
        return result;
    }
}