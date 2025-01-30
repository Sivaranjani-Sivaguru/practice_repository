//Store the information about employee
class Employee {
	//instance member
	int eid;
	String ename;
	int phone;
	float salary;
	
//lets create a method which will take the input/store the information of employee
	void saveEmployee(int id,String ename,int phone,float salary)
	{
		eid=id;
		this.ename=ename;//equalize instance member of employee class to local variable
		this.phone=phone;
		this.salary=salary;
		System.out.println("saved the details ");
	}
//print the details 	
	void printEmployee() {
		System.out.println(" "+eid+" "+ename+" "+phone+" "+salary);
	}
//To string method 
    public String toString()	
	{
		return " "+eid+" "+ename+" "+phone+" "+salary; 
	}
}//end of the class
public class call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee emp=new Employee();
        emp=new Employee();//Re initializing 
        emp.saveEmployee(101, "Raji", 12345, 50000.50f);
        emp.printEmployee();
        System.out.println(emp);
	}

}
