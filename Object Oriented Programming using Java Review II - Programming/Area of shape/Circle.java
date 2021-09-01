import java.util.*;
public class Circle extends Shape    // fill the code
{
    private Double radius;
    
    public Circle()
    {
    }
    public Circle(Double radius)
    {
        this.radius=radius;
    }
     public void setRadius(Double radius)
    {
        this.radius=radius;
    }
    public Double getRadius()
    {
        return this.radius;
    }
    public void setArea(Double area){
        super.setArea(area);
    }
    public Double getArea(){
        return super.getArea();
    
    } 
    

   public void computeArea()
    {
       double area=(double)(22 * radius * radius)/7;
       super.setArea(area);
    }
}
