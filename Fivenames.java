class Employeeess{
	int eid;
	String ename;
	int phone;
	float salary;
	
	Employeeess(int eid,String ename,int phone,float salary){
		this.eid=eid;
		this.ename=ename;
		this.phone=phone;
		this.salary=salary;
	}
	public String toString()	
	{
		return " "+eid+" "+ename+" "+phone+" "+salary; 
	}
	
}//end of the class

public class Fivenames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employeeess emp[]=new Employeeess[4];
        emp[0]=new Employeeess(1,"ss",3333,23.45f);
        emp[1]=new Employeeess(2,"pp",4444,23.55f);
        emp[2]=new Employeeess(3,"rr",5555,23.65f);
        emp[3]=new Employeeess(4,"dd",6666,23.75f);
        printAllName(emp);
	}
     static void printAllName(Employeeess emp[]) {
    		for (Employeeess e:emp) {
    			System.out.println(e);
    		
    	}
        
	}

}
