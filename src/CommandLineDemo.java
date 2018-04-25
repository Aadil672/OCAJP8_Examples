
public class CommandLineDemo {
	
	    public static void main(String[] strings)
	    {
	        // check if length of args array is
	        // greater than 0
	        if (strings.length > 0)
	        {
	            System.out.println("The command line"+
	                               " arguments are:");
	 
	            // iterating the args array and printing
	            // the command line arguments
	            for (String val:strings)
	                System.out.print(val+" ");
	        }
	        else
	            System.out.println("No command line "+
	                               "arguments found.");
	    }
	}