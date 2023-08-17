package com.example.employeemanagmentsystem.repo.impl;
import com.example.employeemanagmentsystem.model.Employee;
import com.example.employeemanagmentsystem.query.EmployeeQuery;
import com.example.employeemanagmentsystem.repo.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class EmployeeRepoImpl implements EmployeeRepository {
    private  final NamedParameterJdbcTemplate jdbcTemplate;
    @Override
    public List<Employee> findAll() {
        return jdbcTemplate.query(EmployeeQuery.FIND_EMPLOYEES,
                (rs, row) -> Employee.builder()
                        .name(rs.getString("name"))
                        .department(rs.getString("department"))
                        .salary(rs.getDouble("salary"))
                        .id(rs.getLong("id"))
                        .build());
    }
    @Override
    public Optional <Employee> findById(Long id) {
        MapSqlParameterSource mapSqlParameterSource=new MapSqlParameterSource();
        mapSqlParameterSource.addValue("id",id);
        return jdbcTemplate.query(EmployeeQuery.FIND_BY_ID,
                mapSqlParameterSource,
                (rs, row) -> Employee.builder()
                        .name(rs.getString("name"))
                        .department(rs.getString("department"))
                        .salary(rs.getDouble("salary"))
                        .id(rs.getLong("id"))
                        .build())
                .stream()
                .findFirst();
    }
    @Override
    public int insert(Employee employee) {
        return jdbcTemplate.update(EmployeeQuery.INSERT_EMPLOYEES,
                new BeanPropertySqlParameterSource(employee));
    }
    @Override
    public int update(Employee employee) {
        return jdbcTemplate.update(EmployeeQuery.UPDATE_EMPLOYEES,
                new BeanPropertySqlParameterSource(employee));
    }@Override
    public int delete(Long id) {
        return jdbcTemplate.update(EmployeeQuery.DELETE_EMPLOYEES,new MapSqlParameterSource("id",id));
    }
}
