import java.lang.Math.*;

public class Circle extends Shape {
    public double Rad;

    public double getEmv() {
        return Math.PI * Rad * Rad;
    }
    
    public double getPer(){
        return 2.0 * Math.PI *Rad;
    }

    @Override public String toString(){
        return  "A circle with radius =" +this.Rad+ "which is a subclass of"+super.toString();
    }

    public void setRad(double Rad){
        this.Rad=Rad;
    }
    
    public double getRad(){
        return Rad;
    }
}