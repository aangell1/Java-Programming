package unit4codingactivities;

public class RectangleRunner 
{

	public static double compareLenths(Rectangle rect1, Rectangle rect2)
	{
		if (rect1.getLength() > rect2.getLength())
		{
			return rect1.getLength();
		}
		else if (rect1.getLength() < rect2.getLength())
		{
			return rect2.getLength();
		}
		return rect1.getLength();	
	}
	
	public static double compareAreas(Rectangle rect1, Rectangle rect2)
	{
		if (rect1.findArea() > rect2.findArea())
		{
			return rect1.findArea();
		}
		else if (rect1.findArea() < rect2.findArea())
		{
			return rect2.findArea();
		}
		return rect1.findArea();
	}
	
	public static double comaprePerimeters(Rectangle rect1, Rectangle rect2)
	{
		if (rect1.findPerimeter() > rect2.findPerimeter())
		{
			return rect1.findPerimeter();
		}
		else if (rect1.findPerimeter() < rect2.findPerimeter())
		{
			return rect2.findPerimeter();
		}
		return rect1.findPerimeter();
	}
	public static void main(String[] args) 
	{
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(9.5, 5.0);
		Rectangle rect3 = new Rectangle(-7, -1);
		System.out.println(rect1);
		System.out.println(rect2.toString());
		System.out.println("The larger length of the two Rectangles is: " + compareLenths(rect1, rect2));
		System.out.println("The larger area of the two Rectangles is: " +compareAreas(rect1, rect2));
		System.out.println("The larger perimeter of the two Rectangles is: " +comaprePerimeters(rect1, rect2));
		rect2.setLength(1);
		rect2.setWidth(.5);
		System.out.println(rect2.toString());
		System.out.println("The larger length of the two Rectangles is: " +compareLenths(rect1, rect2));
		System.out.println("The larger area of the two Rectangles is: " +compareAreas(rect1, rect2));
		System.out.println("The larger perimeter of the two Rectangles is: " +comaprePerimeters(rect1, rect2));
		System.out.println(rect3.toString());
	}
}
