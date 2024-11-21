package unit4codingactivities;

import java.lang.Math;

public class Circle 
{
	private double radius;
	
	public Circle(double r)
	{
		setRadius(r);
	}
	
	public Circle()
	{
		this(5.0);
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double r)
	{
		if (r<0)
		{
			radius = 5.0;
		}
		else
		radius = r;
	}
	
	public String toString()
	{
		return "The circle has a radius of " + radius + ".";
	}
	
	public double findArea()
	{
		double area = radius* radius* Math.PI;
		return area;
	}
	
	public double findCircumference()
	{
		double circumference = 2* radius* Math.PI;
		return circumference;
	}
}
