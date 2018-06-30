package co.edureka.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class EmployeeDAO implements DAO{
	
	private Statement st=null;
	Connection con;
	public EmployeeDAO() throws Exception {
	    con=ConnectionFactory.getConnection();
		st=con.createStatement();
	}

	@Override
	public void saveEmp(Employee emp) throws Exception {
		
		String sql="insert into emps values(? , ?, ?)";
		
	try {
		PreparedStatement stmt= con.prepareStatement(sql);
		 stmt.setInt(1, emp.getEmpno());
		 stmt.setString(2, emp.getEname());
		 stmt.setFloat(3, emp.getSal());
		 
		int n=stmt.executeUpdate();
		System.out.println("exceuted");
	} catch(Exception e)
	{
		 System.out.println("failed");
		e.printStackTrace();
	}
	
			System.out.println("Employee Saved");
	}
	

	@Override
	public void updateEmp(Employee emp) throws Exception {
		String sql="update  emps set sal=? where empno=?";
		try {
		PreparedStatement stmt= con.prepareStatement(sql);
		 stmt.setFloat(1, emp.getSal());
		 stmt.setInt(2, emp.getEmpno());
		int n=stmt.executeUpdate();
		System.out.println("exceuted");
		System.out.println("Employee updated");
		} catch(Exception e)
		{
			 System.out.println("failed to update");
			e.printStackTrace();
		}
		
	}
	

	@Override
	public void deleteEmp(int eno) throws Exception {
		String sql="delete from emps where empno=?";
		try {
		PreparedStatement stmt= con.prepareStatement(sql);
		 stmt.setInt(1, eno);
		int n=stmt.executeUpdate();
		System.out.println("Employee Deleted");
		}catch (Exception e)
		{
			 System.out.println("failed to delete");
			e.printStackTrace();
		}
		
	}

}
