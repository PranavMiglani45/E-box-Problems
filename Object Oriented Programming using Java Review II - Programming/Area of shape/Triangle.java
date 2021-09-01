import java.util.*;
public class Triangle extends Shape   // fill the code
{
    private Double base;
    private Double height;
    
    public Triangle()
    {
        
    }
    public Triangle( Double base,Double height)
    {
        this.base=base;
        this.height=height;
    }
    
    public void setHeight(Double height) 
    {
		this.height=height;
	}
    public Double getHeight()
    {
        return this.height;
    }
    
        public void setBase(Double base) 
    {
		this.base=base;
	}
    public Double getBase()
    {
        return this.base;
    }
    
    
	public void computeArea()
    {
	       double a=(double)0.5 * base * height;
           //System.out.printf("Area of triangle is %.2f",a);
           this.setArea(a);
	}
}
