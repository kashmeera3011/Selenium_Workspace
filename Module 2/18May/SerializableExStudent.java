package task_18_May;

import java.io.Serializable;

public class SerializableExStudent implements Serializable
{
	int id ;
	String name;
	
	public SerializableExStudent(int id,String name)
	{
		this.id=id;
		this.name = name;
	}
}
