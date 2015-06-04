public class Rectangle extends Square {
    public double Width;
    System.out.println("int A" + A);
    public double getEmv(){
        return A*Width;
    }
    public double getPer(){
        return 2.0*A+2.0*Width;
    }
    @Override public String toString(){
        return "A rectangle with width =" +Width+ "which is a subclass of" +super.toString();
    }
     public void setWidth(double Width){
        this.Width=Width;
    }
    public double getWidth(){
        return Width;
    }
}
