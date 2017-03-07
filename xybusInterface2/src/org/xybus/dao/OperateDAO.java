package org.xybus.dao;

import java.util.List;

import org.xybus.entity.Employee;

public interface OperateDAO {
	void save(List<Employee> list);
	void delete(Employee e);
	void selectversion();
	void selectMAX();
	void truncateTable();
}
