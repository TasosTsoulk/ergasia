import java.util.*;
public abstract class Point implements Movable {
    public static int x;
    public static int y;
    Scanner in = new Scanner(System.in);
    public Point() {}
    public void setCord(int x, int y)
    {
    while ((this.x<=0) && (this.y<=0))
    {
        System.out.println("Dwse moy thn swsth timh tou x !");
        this.x=in.nextInt();
        System.out.println("Dwse moy thn swsth timh tou y !");
        this.y=in.nextInt();
    }
          x=this.x;
          y=this.y;
    }
    public static int getX () {
        return x;
    }
    public static int getY () {
        return y;
    }
}