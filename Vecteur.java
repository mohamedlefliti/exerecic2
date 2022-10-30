
public class Vecteur {
	Point p1;
	Point p2;
	public Vecteur(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public void showPoints() {
		System.out.println("{p1:"+p1+",	p2:"+p2+"}");
	}
	public void showCoords() {
		System.out.println("{x:"+(p2.x-p1.x)+", y:"+(p2.y-p1.y)+"}");
	}
	public void inverser() {
		Point p3 = p1;
		p1 = p2;
		p2 = p3;
	}
	public double longueur() {
		return p1.distance(p2);
	}
	public double angleX() {
		double cosAlpha = (p2.x-p1.x)/longueur();
		double alpha = Math.acos(cosAlpha);	
		return Math.toDegrees(alpha);
	}
	public void etaler(double d) {
		p2.x = p2.x + d*Math.cos(angleX());
		p2.y = p2.y + d*Math.sin(angleX());
	}
	public void tourner(double angle) {
		double newAngle = angleX()+angle;
		newAngle = Math.toRadians(newAngle);
		double d = longueur();
		p2.x = d*Math.cos(newAngle);
		p2.y = d*Math.sin(newAngle);
	}
	
}











