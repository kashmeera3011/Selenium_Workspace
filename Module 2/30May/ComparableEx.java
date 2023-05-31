package task_30_May;

import java.util.ArrayList;
import java.util.Collections;

class Kashu implements Comparable<Kashu>
{
	int rollno;
	String name;
	int age;
	
	public Kashu(int rollno, String name, int age) 
	{
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Kashu o) 
	{
		// TODO Auto-generated method stub
		//return 0;
		if(age==o.age)
		{
			return 0;
		}
		else if(age>o.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
}

public class ComparableEx
{
	public static void main(String[] args)
	{
		ArrayList<Kashu> al = new ArrayList<>();
		al.add(new Kashu(101,"grishma",25));
		al.add(new Kashu(102,"flora",38));
		al.add(new Kashu (103,"fiyona",43));
		
		Collections.sort(al);
		
		for(Kashu k:al)
		{
			System.out.println(k.rollno+ " " + k.name + " " +k.age);
		}
		
		
	}
}
