/**
 * Created by ArupPc on 28-01-2017.
 */
public class PointF {
    double x,y;
    String name;
    public void setXY(double x,double y,String name ){
        this.x = x;
        this.y=y;
        this.name = name;
    }
    public void setXY(double x,double y){
        this.x = x;
        this.y=y;

    }
    public PointF(){
        this.x=0.0;
        this.y=0.0;
        this.name = "";
    }
    public PointF(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }


    public double getX() {

        return x;
    }

    public String getName() {
        return name;
    }
    public void printAll(){
        System.out.println("Center: "+ this.name + " Lat: " + this.x + " Long: " + this.y);
    }
}
