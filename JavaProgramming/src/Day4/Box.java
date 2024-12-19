package Day4;

public class Box {

	double width,height,length;
	
	Box(double l,double w,double h){
		length=l;
		width=w;
		height=h;
	}
	Box(){
		length=width=height=0;
	}
	
	Box(double len){
		length=width=height=len;
	}
	
	double volume() {
		return (length*width*height);
	}
}
