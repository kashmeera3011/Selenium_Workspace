package task_30_May;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Kashu2
{
	int rollno;
	String name;
	int age;
	
	Kashu2(int rollno,String name,int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		// TODO Auto-generated method stub
		//return 0;
		Kashu k = (Kashu)o1; 
		Kashu k1 = (Kashu)o2;
		
		if(k.age==k1.age)
		{
			return 0;
		}
		else if (k.age > k1.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
		
		
	}
	
}

class NameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		// TODO Auto-generated method stub
		//return 0;
		Kashu k = (Kashu)o1; 
		Kashu k1 = (Kashu)o2;
		
		return k.name.compareTo(k1.name);
		
		
		
		
	}
	
}


public class ComparatorEx
{
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(new Kashu(101,"grishma",25));
		al.add(new Kashu(102,"flora",38));
		al.add(new Kashu (103,"fiyona",43));
		
		Collections.sort(al);
		Iterator itr = al.iterator();
		
		
		while (itr.hasNext())
		{
			Kashu k = (Kashu)itr.next();
			System.out.println(k.rollno + " " + k.name + " " +k.age);
		}
	}
}
