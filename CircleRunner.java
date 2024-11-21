package unit4codingactivities;

public class CircleRunner 
{

	public static double compareRadii(Circle circ1, Circle circ2)
	{
		if (circ1.getRadius() > circ2.getRadius())
		{
			return circ1.getRadius();
		}
		else
		{
			return circ2.getRadius();
		}
	}
	
	public static double compareAreas(Circle circ1, Circle circ2)
	{
		if (circ1.findArea() > circ2.findArea())
		{
			return circ1.findArea();
		}
		else
		{
			return circ2.findArea();
		}
	}
	
	public static double compareCircumference(Circle circ1, Circle circ2)
	{
		if (circ1.findCircumference() > circ2.findCircumference())
		{
			return circ1.findCircumference();
		}
		else
		{
			return circ2.findCircumference();
		}
	}
	
	public static void main(String[] args) 
	{
		Circle circ1 = new Circle();
		Circle circ2 = new Circle(3);
		System.out.println(circ1.toString());
		System.out.println(circ2.toString());
		System.out.printf("The larger radius of the two circles is: %.1f\n", compareRadii(circ1, circ2));
		System.out.printf("The larger area of the two circles is: %.2f\n", compareAreas(circ1, circ2));
		System.out.printf("The larger circumference of the two circles is: %.2f\n", compareCircumference(circ1, circ2));
		circ2.setRadius(10);
		System.out.println(circ2.toString());
		System.out.printf("The larger radius of the two circles is: %.1f\n", compareRadii(circ1, circ2));
		System.out.printf("The larger area of the two circles is: %.2f\n", compareAreas(circ1, circ2));
		System.out.printf("The larger circumference of the two circles is: %.2f\n", compareCircumference(circ1, circ2));
		Circle circ3 = new Circle(-7);
		System.out.println(circ3.toString());
		
		
		
		

	}

}
