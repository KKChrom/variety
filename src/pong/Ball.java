package pong;
import apcs.Window;
public class Ball {
	int rad;
	int x;
	int y;
	int deltaX;
	int deltaY;
	String color;
	public void move()
	{
		//			Window.out.circle(x, y, rad);
		x+= deltaX;
		y+= deltaY;
		
		if(y-rad <= 0)
		{
			deltaY = -deltaY;
		}
		else if(y+rad >= Window.height())
		{	
			deltaY = -deltaY;
		}
	}
	public void draw()
	{
		Window.out.color(color);
		Window.out.circle(x, y, rad);
	}
	public Ball(int x, int y, int rad, int deltaX, int deltaY,String color)
	{
		this.rad = rad;
		this.x = x;
		this.y = y;
		this.deltaX = deltaX;
		this.deltaY = deltaY;
		this.color = color;
	}
	public void bounce(Paddle p)
	{
		 
		
		if(x+rad >= p.x -p.width/2 && x- rad <= p.x + p.width/2)
		{
			if(y - rad <= p.y + p.height/2 && y + rad >= p.y - p.height/2)
			{
				deltaX = -deltaX;

			}


		}
		

		

	}
	public boolean resetLeft()
	{
		if(x+rad >= Window.width())
		{
			x=400;
			y=300;
			return true;
		}
		return false;
		
		
	}
	public boolean resetRight()
	{
		if(x-rad<= 0)
		{
			x=400;
			y=300;
			return true;
		}
		return false;
	}

}




