/*Design a class
 a)Name of the class
 b)Member variable -Patient name (str),height(double),weight(double)
 c)member function - double computeBMI
 d)The above method should compute bmi and return result
 e)formula = weight(kg)/h^2
*/

class patient{
	
	String Name;
	double height;
	double weight;
	
	//double computeBMI(String name,double height,double weight) {
	void computeBMI(String name,double height,double weight) {	
		this.Name=name;
		this.height=height;
		this.weight=weight;
		double result;
		
		result=weight/(height*height);
		//return result;
		System.out.println("Name: "+name+"\nHeight: "+height+"\nweight: "+weight);
		System.out.println(result);
	}
}
public class asessmentDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//patient ex= new patient();
		
		patient ex= new patient();
		ex.computeBMI("ggg",1.67,67.7687);

	}

}
