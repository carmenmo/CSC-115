public class Prism{

	
	private double width;
	private double height;
	private double depth;
	private double mass;
	
	//default constructor
	public Prism(){
	
		width = 0;
		height = 0;
		depth = 0;
		mass = 0;
	
	}
	//prism constructor
	public Prism(double w, double h, double d, double m){
		width = w;
		height  = h;
		depth = d;
		mass = m;
	}
	
	
	public double calculateVolume(){
	
		return width*height*depth;
	
	}
	
	public double calculateSurfaceArea(){
	
		return (2*width*height) + (2*width*depth) + (2*height*depth);
	
	}
	
	public double calculateDensity(){
	
		return (calculateVolume()/mass);
	
	}
	
	public String toString(){
	
		String s = "\nWidth = " + width + " cm, Height = " + height + " cm, Depth = " + 
					depth + " cm, mass = " + mass + " g\n\nVolume = " + calculateVolume() 
					+ " cm^3\nSurface Area = " + calculateSurfaceArea() + 
					" cm^2\nDensity = " + calculateDensity() + " g/cm^3\n";
		
		return s;
	
	}

}
