package apclassroom;

public class frq1 
{
	31Y492VW
	A.A
	
	a)

	public ArrayList<Integer> screensWithMovies()
	{
		ArrayList<Integer> arrL = new ArrayList<Integer>();
		for (int i = 0; i < screenArr.size(); i++)
		{
			if(screenArr.getIndex(i) != null)
			{
				arrL.add(i);
			}
		}
		return arrL;
	}
	
	b)

	public void updateScreenArr(ArrayList<Movie> moviesToAssign)
	{
		for (int i = 0; i < screenArr.size(); i++)
		{
			if(screenArr.getIndex(i) == null)
			{
				moviesToAssign.add(i);
			}
		}
	}
	
	c)

	public void removeUnpopular(ArrayList<Movie> arrL1)
	{
		
	}
	private int views;
	//tracks the amount of people who watched the movie
	private int ratings;
	//shows the rating of the movie of what people gave it
	public void viewThreshold(int v)
	{
		//determines if the movie is getting enough views calculate if its inpopular or not
	}
	public void averageRating(int r)
	{
		//shows the average rating of the movie and how the public views this, determines if its popular among people or not.
	}
	public Movie (int v, int r)
	{
		views = v;
		ratings = r;
	}
	
	
	
	public static void main(String[] args) 
	{
		

	}

}
