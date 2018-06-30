package co.edureka.jdbc;

public class Main {

	public static void main(String[] args) throws Exception {
		
		DAO dao=new EmployeeDAO();
		Employee emp=new Employee(101,"Ambili", 345.55f);
		dao.updateEmp(emp);
		
		
		//save Employee
		//Employee emp=new Employee(107,"Ambili", 345.56f);
		//	dao.saveEmp(emp);
		
		
		
		/* delete employee int eno=107;
		dao.deleteEmp(eno);
		*/
		
		
	}

}
                                   