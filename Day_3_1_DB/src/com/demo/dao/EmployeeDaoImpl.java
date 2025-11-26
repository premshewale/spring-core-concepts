package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.demo.bean.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jt1) {
		this.jdbcTemplate = jt1;
	}
	
	@Override
	public int addEmployee(Employee e) {
		String query="insert into emp29july23 values(?,?,?)";
		int i = jdbcTemplate.update
				(query,new Object[]{e.getEmpno(),e.getName(),e.getSalary()});
		return i;
	}

	@Override
	public int deleteEmployee(Employee e) {
		String query="delete from emp29july23 where empno=?";
		int i = jdbcTemplate.update
				(query,new Object[]{e.getEmpno()});
		return i;
	}

	@Override
	public int updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		String query="update emp29july23 set salary=? where empno=?";
		int i = jdbcTemplate.update
				(query,new Object[]{e.getSalary(),e.getEmpno()});
		return i;
	}

	
	public String getEmployee(int id) {
		String sql="select name from emp29july23 where empno=?";
		String name=jdbcTemplate.queryForObject(sql, new Object[]{id},String.class);
		return name;
	}

	@Override
	public List<Employee> getAllEmployee() {
		String query="select * from emp29july23";
		List<Employee> emplist=jdbcTemplate.query(query,new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rownum) throws SQLException {
				Employee eobj= new Employee();
				eobj.setEmpno(rs.getInt(1));
				eobj.setName(rs.getString(2));
				eobj.setSalary(rs.getDouble(3));
				return eobj;
			}
			
		});
		return emplist;
		
		
		
	}

}
