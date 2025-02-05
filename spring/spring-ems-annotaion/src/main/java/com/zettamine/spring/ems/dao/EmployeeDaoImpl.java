package com.zettamine.spring.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zettamine.spring.ems.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
private JdbcTemplate jt;
   @Autowired
	public EmployeeDaoImpl(JdbcTemplate jt) {
	super();
	this.jt = jt;
}

	@Override
	public Integer insertEmployee(Employee emp) {
		String query = "insert into employee values("+emp.getEmpId()+",'"
                +emp.getEmpName()+"','"+emp.getDepName()+"',"
			       +emp.getEmpSal()+");";
		Integer n = jt.update(query);
		return n;
	}

	@Override
	public Integer updateEmployee(Employee emp) {
		String query="update employee set name='"+emp.getEmpName()
        +"', dept ='"+emp.getDepName()+"', sal ="
	   +emp.getEmpSal()+" where id ="+emp.getEmpId();
		Integer n = jt.update(query);
		return n;
		
	}

	@Override
	public Integer deleteEMployee(Integer id) {
		String query="delete from employee where id ="+id;
		Integer n = jt.update(query);
		return n;
	}

	@Override
	public Employee findById(Integer id) {
	    String sql ="select * from employee where id="+id;
	    Employee emp = jt.queryForObject(sql, new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee(id, rs.getString(2), rs.getString(3), rs.getFloat(4));
				return emp;
			}
	    	
	    });
		return emp;
	}

	@Override
	public List<Employee> getAll() {
		String sql ="select * from employee";
		List<Employee> list = jt.query(sql,new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
				return emp;
			}
	    	
	    });
		return list;
	}

}
