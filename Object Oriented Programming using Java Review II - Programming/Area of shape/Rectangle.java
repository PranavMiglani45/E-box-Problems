import java.util.*;
public class Rectangle extends Shape   // fill the code
{
    private Double length;
    private Double breadth;
    
    public Rectangle()
    {
    }
    public Rectangle(Double length,Double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    public void setBreadth(Double breadth) 
    {
		this.breadth=breadth;
	}
    public Double getBreadth()
    {
        return this.breadth;
    }
    
    public void setLength(Double length) 
    {
    	this.length=length;
	}
    public Double getLength()
    {
        return this.length;
    }
    
     public void setArea(Double area){
        super.setArea(area);
    }
    public Double getArea(){
        return super.getArea();
    
    } 
    
	public void computeArea()
    {
	    double area= (double)length * breadth;
        //System.out.printf("Area of rectangle is %.2f",area);
        this.setArea(area);
	}
}
