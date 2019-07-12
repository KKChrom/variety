package pong;

import apcs.Window;

public class Paddle {
	int width;
	int height;
	String color;
	int x;
	int y;
	int dy;
	char up;
	char down;
	public Paddle(int x, int y, int width, int height, String color, int dy, char up, char down)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		this.dy = dy;
		this.up = up;
		this.down = down;
	}
	public void move()
	{
		if(Window.key.pressed(up))
		{
			y-=dy;
		}
		else if(Window.key.pressed(down)				)
		{
			y += dy;
		}
	}
	public void draw()
	{
		Window.out.color(color);
		Window.out.rectangle(x, y, width, height);

	}
}
