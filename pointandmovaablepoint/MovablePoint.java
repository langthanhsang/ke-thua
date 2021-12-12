package kethua.pointandmovaablepoint;

public class MovablePoint extends Point {
   private float xSpeed;
   private float ySpeed;

   public MovablePoint() {
   }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public double[] getxSpeedySeed () {
       double[] array = new double[] { getxSpeed(),getySpeed()};
               return array;
    }
    public void setxSpeedySeed(float xSpeed,float ySpeed) {
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;

    }
    public MovablePoint movablePoint(){
       float x1 = getX();
       float x2 = getY();
       x1 += xSpeed;
       x2 += ySpeed;
       return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
