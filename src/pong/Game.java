package pong;

import java.util.ArrayList;

import apcs.Window;

public class Game {
public static void main(String[] args) {
	Window.size(800, 600);
	Ball b = new Ball(400, 300, 20, 7, 7, "white");
	Paddle l = new Paddle(50, 300, 20, 150, "blue", 7,'w','s');
	Paddle r = new Paddle(Window.width()-50, 300, 20, 150, "red", 7,'o','l');
	
	int le = 0;
	int ri = 0;
	
	
	while(true)
	{
		if(b.resetLeft())
		{
			le++;
		}
		if(b.resetRight())
		{
			ri++;
		}
		b.draw();
		b.move();
		b.bounce(r);
		b.bounce(l);
		l.draw();
		l.move();
		r.draw();
		r.move();
		Window.out.color("white");
		Window.out.print(le+" - "+ri, Window.width()/2, 50);
		Window.frame();
	}
}
}
