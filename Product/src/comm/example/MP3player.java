package comm.example;

public class MP3player extends Electronics {
	 private String color;
	    
	    public MP3player(double regularPrice, 
	                String manufacturer,
	                String color) {
	        super(regularPrice, manufacturer);
	        this.color = color;
	    }
	    
	    // Implement the abstract method
	    public double computeSalePrice(){
	        return super.getRegularPrice() * 0.9;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }
}
