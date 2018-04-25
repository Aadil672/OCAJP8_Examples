
import java.util.Arrays;
public class Program {

	public static void main(String[] args) {
		
		String[][] strings= {{"A","Z"},{"C","Z","S"},{"L"}};
		
		Arrays.sort(strings);
		
	     for(String []str:strings)
	     {
	     for(String s:str)
	    		 {
	    		 System.out.println(s);
	}
	     }
}
}
