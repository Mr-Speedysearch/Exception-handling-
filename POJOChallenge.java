import java.awt.*;

public class POJOChallenge {

    // our two fields of X and Y
    private int x;
    private int y;

    // insert our 2 constructors
    public POJOChallenge (){}
    public POJOChallenge (int x, int y){}

    // add method getX
    public int getX (){
        return x;
    }

    // add method getY
    public int getY(){
        return y;
    }


    public int setX(int x){
       return this.x = x;
    }

    public int setY(int y){
        return this.y=y;
    }


    public double distance(){
        return distance(0, 0);
    }

    public double distance (Point a){
        return distance(a.x, a.y);
    }

    public double distance(int x, int y){
        int xDiff = this.x-x;
        int yDiff = this.y-y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    
}


