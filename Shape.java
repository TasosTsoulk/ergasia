import java.lang.Math.*;

public abstract class Shape {

  public String Color;
  public int x=Point.getX();
  public int y=Point.getY(); 

  public double  CalcDistance(int x2,int y2)
  {
    double distance;
    distance = Math.sqrt((y2-y)^2+(x2-x)^2);
    return distance;
  }

  public abstract double getEmv();
  public abstract double getPer();
   
  @Override public String toString() {
    return "A shape with color:" +this.Color+ "on the position:" +this.x + "," +this.y ;
       
  }

  public void setColor(String Color) {
    this.Color=Color;
  }
  
  public String getColor() {
    return Color;
  }

}