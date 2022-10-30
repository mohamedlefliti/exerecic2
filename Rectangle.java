
public class Rectangle {
	Point p1;
	Point p2;
	public Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public double surface() {
		return Math.abs(p2.x-p1.x)*Math.abs(p2.y-p1.y);
	}
	public boolean dansRectangle(Point p) {
		return ((p.x-p1.x)*(p.x-p2.x)<0)&&((p.y-p1.y)*(p.y-p2.y)<0);
	}
	public void show() {
		Point p3 = new Point(p1.x,p2.y);
		Point p4 = new Point(p2.x,p1.y);
		p1.show();
		p2.show();
		p3.show();
		p4.show();
	}
}
