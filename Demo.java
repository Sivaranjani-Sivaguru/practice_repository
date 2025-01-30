public class Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Break
		for (int i=0;i<10;i++)
		{
			if(i==5)//if i equals to 5 loop breaks
			{
				break;
			}
				System.out.println("i: "+i);
				
			}
			System.out.println("Loop Complete");
			
		for (int i =0;i<10;i++)
		{
			if(i%2 == 0)//if the no is even it skips 
			{
				continue;
				}
			System.out.println("i: "+i);
			
		}
		System.out.println("Loop Complete");
		
		
		//using return
		
	    boolean t=true;
	    
	    System.out.println("Before the return");
	    if(t)
	    {
	    	return;
	    }
	    System.out.println("This thing wont execute");
	    //Compiler will bypass every statement
        
	}

}
Arrays.sort(s,0, n, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
