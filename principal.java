
public class Principal {

	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(1,1);
		Vecteur v = new Vecteur(p1,p2);
		v.showCoords();
		v.inverser();
		v.showCoords();
		System.out.println(v.longueur());
		System.out.println(v.angleX());
	
	}

}
