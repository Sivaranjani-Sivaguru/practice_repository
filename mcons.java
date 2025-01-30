//In this we are going to see about multiple constructor
class printer{
	
	printer(String path,String imgname){
		//this();//i commented this because at least one constructor should be free from this keyword 
		System.out.println("path: "+path+"img name: "+imgname);
	}
	printer(String txtfile){
		this("c://imgdir//..","Training.jpeg");//connected to double parameter
		System.out.println("File: "+txtfile);
	}
	printer(){
		this("abc.txt");//connecting to single parameter
		System.out.println("inside Default");
	}
}
public class mcons {//multiple constructors

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //new printer("abc.txt");
        new printer();
        //new printer("c:\\imgdir\\..","Training.jpeg");
	}

}
