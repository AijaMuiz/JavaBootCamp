package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		Employee e = EmployeeJDBC.findEmployeeById(1);
		assertEquals("Aija", e.getFirstName());
		assertEquals("Muiz", e.getLastName());
		assertEquals(123, e.getSalary());
		//complete the code here
	}

	public void testFindEmployeeById_NoMatchFound() {
		Employee e1 = emp.findEmployeeById(99);
		assertNull(e1);
		//complete the code here
	}
	
	
	public void testFindEmployeesByName_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Aija");
		
			Employee e = list.get(0);
			
		assertEquals(1, e.getId());
		assertEquals("Aija", e.getFirstName());
		assertEquals("Muiz", e.getLastName());
		assertEquals(123, e.getSalary());
		//complete the code here
	}
	
	public void testFindEmployeesByName_MatchMultiple() {
		ArrayList<Employee> list = emp.findEmployeesByName("Maija");
		assertEquals(2, list.size());
		//complete the code here
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesByName("Janis");
		
		assertEquals(0, list.size());
	}

	public void testFindEmployeesBySalary_MatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(123);
		
		Employee e = list.get(0);
		
		assertEquals(1, e.getId());
		assertEquals("Aija", e.getFirstName());
		assertEquals("Muiz", e.getLastName());
		assertEquals(123, e.getSalary());
		//complete the code here
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		ArrayList<Employee> list = emp.findEmployeesBySalary(111);
		
		assertEquals(0, list.size());
		//complete the code here
	}
	
	public void testInsertEmployee(){
		Employee e1 = new Employee(); 
		e1.setId(5);
		e1.setFirstName("Karlis");
		e1.setLastName("Briedis");
		e1.setSalary(444);
		EmployeeJDBC.insertEmployee(e1);
		
		Employee e = EmployeeJDBC.findEmployeeById(5);
		assertEquals("Karlis", e.getFirstName());
		assertEquals("Briedis", e.getLastName());
		assertEquals(444, e.getSalary());
		//complete the code here
	}
}
