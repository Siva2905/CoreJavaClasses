package coreconcepts;

import java.util.Arrays;

import org.junit.Test;

public class MyArrays 
{

	    //An array is a container object that holds a fixed number of values of a single type.After creation of an array it's length is fixed.
		// Arrays are of two types --- They are 1.Fixed array  2.Dynamic Array
		
		//  OR Array is an object which contains elements of a similar data type.
		
		// Signature of an Array
		// DataType[] name = { values  };
		
		@Test
		public void ArrayNumbers()
		{                             // 0   1   2   3   4   5   6   7   8    9
			int[] numbers = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
			int len = numbers.length;
			System.out.println("Length of the Array : "+len);
			//int value=numbers[0];
			//numbers [5]= 488; // in the above array number 2 will be replaced by 488 & create a new number system
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
				int value=numbers[i];
				System.out.println("Array value is : "+value);
			}
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
				numbers[i]=88+i;  // Here i(i.e 0 1 2 3 4 5 6 7 8 9 ) location is added to 88 & result will be 88+0,88+1,88+2....,88+9

				numbers[i]=88+numbers[i]; // Here number will be added that is located in i location i.e 88+1,88+2,88+3.....,88+10
				System.out.println("Array value is after : "+numbers[i]);		
			}
			
		}
		@Test
		public void ArrayNames()
		{                             //       0         1           2                     3   
			String[] names = { "Siva","Siri","Brahmam","Annapurna"};
			int len = names.length;
			System.out.println("Length of the Array : "+len);
			//String value=names[0];
			//numbers [5]= 488; // in the above array number 2 will be replaced by 488 & create a new number system
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
				String value=names[i];
				System.out.println("Array Names is : "+value);
			}
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
		    	names[i]="Selenium"+i;  // Here i(i.e 0 1 2 3 4 5 6 7 8 9 ) location is added to 88 & result will be 88+0,88+1,88+2,88+3
				names[i]=88+names[i]; // Here names will be added that is located in i location i.e 88+Siva,88+Siri,88+Brahmam,88+Annapurma
				
				System.out.println("Array value  after changes is : "+ names[i]);		
			}
			
		}
		
		@Test
		public void dynamicArrayNames()
		{                             //       0         1           2                     3   
			//String[] names = { "Siva","Siri","Brahmam","Annapurna"};
			String[] names =new String[10];
			int len = names.length;
			System.out.println("Length of the Array : "+len);
			String value=names [1];// reading value
			//numbers [5]= 488; // in the above array number 2 will be replaced by 488 & create a new number system
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
				value=names[i];
				System.out.println("Array Names is : "+value);
			}
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
		    	names[i]="Selenium"+i;  // Here i(i.e 0 1 2 3 4 5 6 7 8 9 ) location is added to 88 & result will be 88+0,88+1,88+2,88+3
				names[i]=88+names[i]; // Here names will be added that is located in i location i.e 88+Siva,88+Siri,88+Brahmam,88+Annapurma
				
				System.out.println("Array value  after changes is : "+ names[i]);		
			}
			
		}
		@Test
		public void dynamicArrayNumbers()
		{                             //       0         1           2                     3   
			//String[] names = { "Siva","Siri","Brahmam","Annapurna"};
			int[] numbers =new int[10];
			int len = numbers.length;
			System.out.println("Length of the Array : "+len);
			int  value=numbers [1];// reading value
			//numbers [5]= 488; // in the above array number 2 will be replaced by 488 & create a new number system
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
				value=numbers[i];
				System.out.println("Array Names is : "+value);
			}
		    for (int i=0; i<len; i++) // If we write the condition as i<=len then it will through a error i.e ArrayIndexOutOfBoundsException
			{
		    	numbers[i]=1+i;  // Here i(i.e 0 1 2 3 4 5 6 7 8 9 ) location is added to 88 & result will be 88+0,88+1,88+2,88+3
				numbers[i]=88+numbers[i]; // Here names will be added that is located in i location i.e 88+Siva,88+Siri,88+Brahmam,88+Annapurma
				
				System.out.println("Array value  after changes is : "+ numbers[i]);		
			}
			
		}
		@Test
		public void findstudent()
		{
			int [] numbers ={20,21,22,23,24,25,26,27,28,29};
			int len =numbers.length;
			//System.out.println("Length of the Array is : "+len);
			for (int i=0 ; i<len ; i++)
			{
				int num =numbers[i];
				if(num==26)
				{
					System.out.println("Student found " );
					break;
				}
			}
			
		}
		@Test
		public void usingsortfindstudent()
		{
			int [] numbers ={320,121,22,523,924,725,267,275,280,29};
			for (int i=0;i<numbers.length;i++)
			{
			System.out.println("My Array Befor Sorting is : "+numbers[i]);
			}

			Arrays.sort(numbers);
			for (int i=0;i<numbers.length;i++)
			{
			System.out.println("My Array After Sorting is : "+numbers[i]);
			}
			
		}
		
	} 
