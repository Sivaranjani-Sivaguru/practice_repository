//import java.util.*;
//create a class to compare two alphabets and print in ascending order
//like if you give "s" and "a" it has to print it like "a" and "s" or if you give like "d" and "j" it has to print it like "d" and "j"
class alpha{
	char alpha1;
	char alpha2;
	
	void Printalpha(char alpha1,char alpha2) {
		this.alpha1=alpha1;
		this.alpha2=alpha2;
		
		int a1=alpha1;
		int a2=alpha2;
		
		if(a1<a2) {
			System.out.println("First:"+alpha1+"\nSecond:"+alpha2);
		}
		else{
			System.out.println("First:"+alpha2+"\nSecond:"+alpha1);
		}
		
	}
	
	//Scanner scan =new Scanner(System.in);
}
public class asessment2day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        alpha ex = new alpha();
        ex.Printalpha('a', 'z');
        ex.Printalpha('v', 'd');
	}

}
