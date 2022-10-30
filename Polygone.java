import java.util.ArrayList;
import java.util.List;

public class Polygone {
List<Point> points;

public Polygone() {
	points = new ArrayList<Point>();
}
public void addPoint(Point p) {
	points.add(p);
}
public double perimetre() {
	double perimetre=0;
	for(int i=0;i<points.size()-1;i++) {
		perimetre+=points.get(i).distance(points.get(i+1));
	}
	perimetre+=points.get(0).distance(points.get(points.size()-1));
	return perimetre;
}
public void deplacer(double dx,double dy) {
	points.forEach(p->{p.deplacer(dx, dy);});
}
public void show() {
	points.forEach(p->p.show());
}
}
