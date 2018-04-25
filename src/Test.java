
/*import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Collectors; 

public class Test
{

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> result= new ArrayList<Integer>();

        a.add(3);
        a.add(5);
        a.add(1);
        a.add(6);

        b.add(1);
        b.add(2);
        b.add(6);
        b.add(1);
        
        
        
        
 result = IntStream.range(0, a.size()).mapToObj(i -> a.get(i) + b.get(i)).collect(Collectors.toList());

System.out.println("result of addition of two equal list:"+result);
    }

}*/

public class Test
{
int b;
    public static void main(String[] args) {
    	//int x;
    	//System.out.println(x);   //The local variable may not have been initialized.
    	
    	int a=100;
    	int b=10;
    	if(a==100)
    	{
    		b=100;
    	}
    	System.out.println(b);
    	
    }
}