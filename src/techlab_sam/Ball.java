package techlab_sam;
import apcs.Window;
import pong.Paddle;
public class Ball {
	int rad;
	int x;
	int y;
	int deltaX;
	int deltaY;
	String color;
	public void move()
	{
//		Window.out.circle(x, y, rad);
		x+= deltaX;
		y+= deltaY;
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
		
	}
	
}
