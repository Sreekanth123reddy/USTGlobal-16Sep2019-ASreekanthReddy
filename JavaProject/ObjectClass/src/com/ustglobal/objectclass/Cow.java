package com.ustglobal.objectclass;

public class Cow {
	int id;
	String color;
	double cost;
	public Cow(int id, String color, double cost) {
		super();
		this.id = id;
		this.color = color;
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
	if(this==obj)
	{
		return true;
	}
	Cow c = (Cow)obj;
	if(this.id==c.id)
	{
		if(this.color.equals(c.color))
		{
			if(this.cost==c.cost)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	else
	{
		return false;
	}
	}

}
