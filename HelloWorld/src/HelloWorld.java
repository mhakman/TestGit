
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
		
		System.out.println ("Feature-2");
	}
}
