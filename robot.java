public class Robot {
    String nom;
    Point position;
    String direction;
    public void avancer() {
        switch (direction) {
        case "Nord": position.y+=1; break;
        case "Sud": position.y-=1; break;
        case "Est": position.x+=1; break;
        default: position.x-=1;
        }
    }
    }
    