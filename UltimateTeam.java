package ultimatefrisbee;

public class UltimateTeam 
{
	private UltimatePlayer[] players;
	private Coach[] coaches;
	
	public UltimateTeam(UltimatePlayer[]ps, Coach[] cs)
	{
		players = ps;
		coaches = cs;
	}

	public String getCutters()
	{
		String c = "\n**CUTTERS**\n";
		for (int i = 0; i < players.length; i++)
		{
			if (players[i].getPosition().equals("cutter"))
			{
				c += players[i].toString() + "\n";
			}
		}
		return c;
	}
	public String getHandlers()
	{
		String h = "**HANDLERS**\n";
		for (int i = 0; i < players.length; i++)
		{
			if (players[i].getPosition().equals("handler"))
			{
				h += players[i].toString() + "\n";
			}
		}
		return h;
	}
	public String toString()
	{
		String c = "**COACHES**";
		String p = "\n\n**PLAYERS**";
		String cu = "\n\n**CUTTERS**";
		String h = "\n\n**HANDLERS**";
		for (int i = 0; i < coaches.length; i++)
		{
			c +=  "\n" + coaches[i].toString();
		}
		for (int j = 0; j<players.length; j++)
		{
			p += "\n" + players[j].toString();
		}
		for (int a = 0; a < players.length; a++)
		{
			if (players[a].getPosition().equals("handler"))
			{
				h += "\n" + players[a].toString();
			}
			else
			{
				cu += "\n" + players[a].toString();
			}
		}
		return "\n**TEAM**\n\n" + c + p + cu + h;
	}
	
}
