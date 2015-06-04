public class Square extends Shape {
    protected double A;  // πλάτος 
    
    public double getEmv(){
        return A*A;
    }

    public double getPer(){
        return 4.0*A;
    }

    @Override public String toString(){
        return "A square with length =" +A+ "which is a subclass of" +super.toString();
    }

    public void setA(double A){
        this.A=A;
    }

    public double getA(){
        return A;
    }
}