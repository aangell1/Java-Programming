package cootie;

public class Cootie 
{
	private int legs;
	private boolean hasHead;
	private boolean hasEyes;
	private boolean hasAntenne;
	private boolean hasBody;
	private boolean hasMouthpiece;
	private int players;
	private int currentValue;
	
	public Cootie(int l, boolean h, boolean e, boolean a, boolean b, boolean m, int p, int c)
	{
		legs = l;
		hasHead = h;
		hasEyes = e;
		hasAntenne = a;
		hasBody = b;
		hasMouthpiece = m;
		players = p;
		currentValue = c;
	}
	
	public Cootie()
	{
		this(0, false, false, false, false, false, 2, 0);
	}
	
	public int getLegs()
	{
		return legs;
	}
	
	public boolean getHead()
	{
		return hasHead;
	}
	
	public boolean getEyes()
	{
		return hasEyes;
	}
	
	public boolean getAntenne()
	{
		return hasAntenne;
	}
	
	public boolean getBody()
	{
		return hasBody;
	}
	
	public boolean getMouthpiece()
	{
		return hasMouthpiece;
	}
	
	public int getPlayers()
	{
		return players;
	}
	
	public int getCurrentValue()
	{
		return currentValue;
	}
	
	public void setLegs(int l)
	{
		int c = 0;
		if (roll(c) == 6)
		{
			l++;
		}
		if(legs > 6)
		{
			legs = 6;
		}
		else
		{
			legs = l;
		}
		if(hasBody == false)
		{
			System.out.print("Darn!  You can't have legs until you have a body.");
		}
	}
	
	public void setHead(boolean h)
	{
		hasHead = h;
		int c = 0;
		if(roll(c) == 2)
		{
			hasHead = true;
		}
	}
	
	public void setEyes(boolean e)
	{
		hasEyes = e;
		int c = 0;
		if(roll(c) == 4)
		{
			hasEyes = true;
		}
		else if(hasHead == false && hasBody == false)
		{
			System.out.print("Darn!  You can't get a mouthpiece until you have a head and a body.");
		}
	}
	
	public void setAntenne(boolean a)
	{
		hasAntenne = a;
		int c = 0;
		if(roll(c) == 3)
		{
			hasAntenne = true;
		}
		else if(hasHead == false && hasBody == false)
		{
			System.out.print("Darn!  You can't get a mouthpiece until you have a head and a body.");
		}
	}
	
	public void setBody(boolean b)
	{
		hasBody = b;
		int c = 0;
		if(roll(c) == 1)
		{
			hasBody = true;
		}
	}
	
	public void setMouthpiece(boolean m)
	{
		hasMouthpiece = m;
		int c = 0;
		if(hasHead == false && hasBody == false)
		{
			System.out.print("Darn!  You can't get a mouthpiece until you have a head and a body.");
		}
		else if(roll(c) == 5)
		{
			hasMouthpiece = true;
		}
	}
	
	public void setPlayers(int p)
	{
		if (players <= 1 || players >= 5)
		{
			System.out.println("Please enter a valid number of players");
		}
		else
		{
			players = p;
		}
	}
	
	public void setCurrentValue(int c)
	{
		currentValue = c;
	}
	
	public int roll(int r)
	{
		return r = (int)(Math.random()*6) + 1;
	}
	
	
	
	
	
	
}
