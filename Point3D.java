
public class Point3D extends Point {
	int z;
	
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public void show() {
		System.out.println("{x:"+this.x+"y:"+this.y+"z:"+this.z+"}");
	}
	public void deplacer(int dx,int dy,int dz) {
		this.x+= dx;
		this.y+= dy;
		this.z+= dz;
	}
	
	public double distance(Point3D p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		double dz = this.z - p.z;
		
		double d = Math.sqrt(dx*dx+dy*dy+dz*dz);
		return d;
		
	}
}
