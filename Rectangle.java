package unit4codingactivities;

public class Rectangle 
{
	private double width;
	private double length;
	
	public Rectangle(double w, double l)
	{
		setLength(l);
		setWidth(w);
	}
	
	public Rectangle()
	{
		this(3.0, 2.0);
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public void setLength(double l)
	{
		if (l<0)
		{
			length = 3.0;
		}
		else 
		{
			length = l;
		}
		
	}
	
	public void setWidth(double w)
	{
		if (w<0)
		{
			width = 2.0;
		}
		else
		{
			width = w;
		}
	}
	
	public String toString()
	{
		return "The rectangle has a length of " + length + " and a width of " + width + "."; 
	}
	
	public double findArea()
	{
		double area = width*length;
		return area;
	}
	
	public double findPerimeter()
	{
		double perimeter = width + width + length + length;
		return perimeter;
	}
	
}
