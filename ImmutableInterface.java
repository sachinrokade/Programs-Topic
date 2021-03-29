interface ImmutablePoint
{
	public int getX();
	public int getY();
}
class Point implements ImmutablePoint
{
	
	int x;
	int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

public class ImmutableInterface {
public static void main(String[] args) {
	
	ImmutablePoint ap=new Point(10,20);
	System.out.println(ap.getX());
}
}
