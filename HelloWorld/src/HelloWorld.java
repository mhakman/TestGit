
public class HelloWorld {

	public static void main (String [] args) {
		
		try {
			
			HelloWorld hw = new HelloWorld ();
			
			hw.run ();
			
		} catch (Exception ex) {
			
			ex.printStackTrace ();
			
			System.exit (1);;
		}
	}
	
	protected void run () {
		
		System.out.println ("Hello World!");
		
		System.out.println ("Feature-1");
		
		System.out.println ("Feature-2");
		
		System.out.println ("Fix-1");
		
		System.out.println ("Fix-2");
		
		System.out.println ("Feature-1.1");
		
		System.out.println ("Feature-2.1");
		
		System.out.println ("Feature-1.1.1");
		
		System.out.println ("Feature-2.1.1");
		
		System.out.println ("Feature-1.1.1.1");
		
		System.out.println ("Feature-2.1.1.1");
	}
}
