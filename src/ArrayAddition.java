/*public class ArrayAddition
{
public static void main(String[] args)
{
    BigDecimal array1[] = {1, 2, 3, 4, 5}; // first array
    int array2[] = {6, 7, 8, 9}; // second array
    int length = Math.max(array1.length, array2.length); // length of longest array
    int newArray[] = new int[length]; // result must be length of longest array

   // int index1 = array1.length - 1; // last element of first array
    //int index2 = array2.length - 1; // last element of second array
    //int indexRes = length - 1;      // result will be placed in last spot of result
    
    int index1 = 0; // last element of first array
    int index2 = 0; // last element of second array
    int indexRes =0;      // result will be placed in last spot of result

    //for (int i = length-1; i >= 0; i--) // adds elements of two arrays together backward
    for (int i =0; i<=length-1; i++) // adds elements of two arrays together forward
    {

        int val1, val2;     // value holders for array elements

        try  // try to get value of the array 1 at certain position
        {
            val1 = array1[index1];
        }
        catch(ArrayIndexOutOfBoundsException e)  // if empty, make it zero
        {
          val1 = 0;
        }

        try   // try to get value of array 2 at certain position
        {
            val2 = array2[index2];
        }
        catch(ArrayIndexOutOfBoundsException e) // if empty make it zero
        {
            val2 = 0;
        }

        newArray[indexRes] = val1 + val2; // array[?] result is val1 + val 2
        index1++;  // increment to the next lower value
        index2++; // increment to the next lower value
        indexRes++; // go the next higher spot

        //index1--;  // decrement to the next lower value
        //index2--; // decrement to the next lower value
        //indexRes--; // go the next lower spot

    }
    System.out.print("New Array:");
    for (int i = 0; i < newArray.length; i++)  // this loop prints out the results
       
    	System.out.print(newArray[i]);

}

}
*/

public class ArrayAddition
{
public static void main(String[] args)
{
    int monthOne[] = {1, 2, 3, 4, 5}; // first array
    int monthTwo[] = {6, 7, 8, 9}; // second array
    int length = Math.max(monthOne.length, monthTwo.length); // length of longest array
    int result[] = new int[length]; // result must be length of longest array

   
    
    int index1 = 0;        // first element of first array
    int index2 = 0;       // first element of second array
    int indexResult =0;      // result will be placed in last spot of result

    for (int i =0; i<=length-1; i++) // adds elements of two arrays together in forward direction...
    {

        int val1, val2;     // value holders for array elements

        try  // try to get value of the monthOne at certain position
        {
            val1 = monthOne[index1];
        }
        catch(ArrayIndexOutOfBoundsException e)  // if empty, make it zero
        {
          val1 = 0;
        }

        try   // try to get value of array 2 at certain position
        {
            val2 = monthTwo[index2];
        }
        catch(ArrayIndexOutOfBoundsException e) // if empty make it zero
        {
            val2 = 0;
        }

        result[indexResult] = val1 + val2; // array[?] result is val1 + val 2
        index1++;  // increment to the next higher value
        index2++; // increment to the next higher value
        indexResult++; // go the next higher spot
    }
    System.out.print("Result of Addition of Two unequal Array:");
    for (int i = 0; i <result.length; i++)    // this loop prints out the results
       
    	System.out.print(result[i]+" ");

}

}


