import java.io.*; // I/O
import java.util.*; // Scanner class

public class Lab5
{
	public static void main( String args[] )
	{
		int[] arr = { 13, 5, 7, 11, 23, 15, 6, 31, 91, 27, 14, 41, 55, 14 };
		int arrmin,arrmax;
		double arrave,arrprod;

		arrmin = arr[0];
		arrmax = arr[0];
		arrave = 0;
		arrprod = 1;

		for ( int i=0 ; i<arr.length ; ++i ) //arrmin
		{
			if (arr[i] < arrmin)
				arrmin = arr[i];
		}

		for ( int i=0 ; i<arr.length ; ++i ) //arrmax
		{
			if (arr[i] > arrmax)
				arrmax = arr[i];
		}

		for ( int i=0 ; i<arr.length ; ++i ) //arrave
		{
			arrave += arr[i];
		}

		arrave = arrave/arr.length;

		for ( int i=0 ; i<arr.length ; ++i ) //arrprod
		{
			arrprod *= arr[i];
		}

		System.out.println( "The smallest number in the array is: " + arrmin );
		System.out.println( "The largest number in the array is: " + arrmax );
		System.out.println( "The average of the numbers in the array is: " + arrave );
		System.out.println( "The product of the numbers in the array is: " + arrprod );


	} // END MAIN METHOD



} // END CLASS Lab5
