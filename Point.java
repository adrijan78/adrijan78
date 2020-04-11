import java.util.List;

class Point {
	String id
	double x,y;
	String boja;

	public Point(String id, double x, double y, String boja) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.boja = boja;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}



	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection =='L'){
			setX(this.x-1);
		}
		if(xDirection =='R'){
			setX(this.x+1);
		}
		if(yDirection =='U'){
			setY(this.y+1);
		}
		if(yDirection =='D'){
			setY(this.y-1);
		}

	}

	public void draw () {
		//TODO
		if(x>0 && y>0){
			System.out.println("Tockata se naogja vo I kvadrant");
		}
		if(x<0 && y>0){
			System.out.println("Tockata se naogja vo II kvadrant");
		}
		if(x<0 && y<0){
			System.out.println("Tockata se naogja vo III kvadrant");
		}
		if(x>0 && y<0){
			System.out.println("Tockata se naogja vo IV kvadrant");
		}
	}



}
class Canvas{
	List<Point> tocki;

	void dodadi(Point p){
		tocki.add(p);
	}
	void removeTocki(Point p){
		for (Point tocka:tocki) {
			if(tocka == p){
				tocki.remove(tocka);
			}
		}
	}



}