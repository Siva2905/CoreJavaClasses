package coreconcepts;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class MyCollections 
{
      // Signature of collection : ArrayList<GenericType>  myList = new ArrayList<GenericType>();
	
	@Test
	public void studentNumber()
	{
		ArrayList<Integer> number = new ArrayList<Integer>();
		int len = number.size();
		System.out.println("Length of the ArryList : " + len);
		number.add(3);//0 // From here we are inserting the values to the arry list.To insert the value in ArryList we use the keyword ".add"
		number.add(6);//1
		number.add(8);//2
		number.add(1);//3
		len=number.size();
		System.out.println("Length of the ArryList after Inserting : "+len);
		number.get(0);
		for (int i=0;i<number.size();i++)
		{
			System.out.println("Elements in the collection :"+number.get(i));
		}
		number.add(2, 488);
		
		for (int i=0;i<number.size();i++)
		{
			System.out.println("Elements in the collection after adding :"+number.get(i));
		} 
		number.remove(0);
		System.out.println("Length of the ArryList after removing : "+len);
		for (int i=0;i<number.size();i++)
		{
			System.out.println("Elements in the collection after removing :"+number.get(i));
		}

	}
		
	@Test
	public void listOfStudents()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student(25 , "Siva",555);
		Student s2 = new Student(26 , "Naga",575);
		Student s3 = new Student(27, "Rao",585);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		//students.get(0);
		//students.add(s3);
		students.add(new Student(28, "SNR",479));
		students.add(new Student(30, "SNRao",488));
		for (int i=0;i<students.size();i++)
		{
			System.out.println("Student Number : " +i);
			System.out.println(students.get(i).name);
			System.out.println(students.get(i).number);
			System.out.println(students.get(i).Marks);
		}
		
	}

    class Student
  {
   int number;
   String name;
   int Marks;
  Student(int num , String myname, int mymarks)
  {
	  number = num;
	  name = myname;
	  Marks = mymarks;
  }
  
}
        
	//How the arrange the given numbers in sequence by using SORT in collections

  	@Test
  	public void sortCollection()
  	{
  		ArrayList<Integer> numbers = new ArrayList<Integer>();
  		int len = numbers.size();
  		System.out.println("Length of the collection : "+len);
  		numbers.add(55);
  		numbers.add(23);
  		numbers.add(4);
  		numbers.add(21);
  		numbers.add(78);
  		numbers.add(88);
  		numbers.add(488);
  		numbers.add(366);
  		numbers.add(188);
  		numbers.add(1);
  		System.out.println("My Collections Before Sorting is : "+numbers);
  		Collections.sort(numbers); //  Sort is used to arrange the given collection in ascending Order
  		int len2=numbers.size();
  		System.out.println("My Collections After Sorting is : "+numbers);
  		System.out.println("Length of the Collections After Sorting is "+len2);
  		Collections.reverse(numbers);//  Reverse is used the arrange in Descending Order
  		System.out.println("My Collections After Reverse Sorting is : "+numbers);


  	}
    
}
