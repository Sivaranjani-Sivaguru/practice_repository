
public class MethodsinJava {
	
//Non return type
	void printBanner() {
		System.out.println("Inside the non return type method");
	}
	
//Return type	
	char printChar() {
		return 'S';
	}
	
//Static Type	
//Only static variables can be added	
	static void loaddata() {
		System.out.println("Pre-Loading........");
		
	}

//Example : I want to print the names of five girls 
	
//Traditional methods:
	void printName(String n1,String n2,String n3) {
		
		System.out.println(n1+" "+n2+" "+n3);
		
	}
	
//Lets improve this method:
	void printName2(String names[]) {
		for(String name_2 : names) {
		System.out.println(name_2);}
	}
	
//Var-arg method :
	void printName3(String...x) {
		for(String name_3:x) {
			System.out.println(name_3);
		}
	}
	
//3 example :
	void printName4(int z,char d,String...x1) {//var args only in the last not in middle
		for(String name_4:x1) {
			System.out.println(name_4);
		}
		System.out.println("integer: "+z);
		System.out.println("Character: "+d);
		
	}
	
	//void printName5(String...x2,char...d1) {//You can't do two continuous things 
		//for(String name_5:x2) {
		//	System.out.println(name_5);
		//}
	//	for(char name_6:d1) {
	//		System.out.println(name_6);
	//	}
	
		
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsinJava.loaddata();
		MethodsinJava ref = new MethodsinJava();
		ref.printBanner();
		char data = ref.printChar();
		System.out.println(data);
		
		String names[]= {"savi","siva","aishu"};
		ref.printName("savi", "Sivu", "aishu");
		ref.printName2(names);
		ref.printName3("sibu","akshu","Nive","janu","udhi");
		ref.printName4(4,'r', "valli","deiva","muruga");
		//ref.printName5()
		
		

	}

}
