import processing.core.PApplet;
public class FourBalls extends PApplet{

    Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        int width = 700;
        int height = 450;
        size(width,height);
    }

    @Override
    public void setup() {

        float xPositionForAllBalls = 0;
        float sizeOfBall = 10;

        for(int i=0; i < balls.length; i++){
            balls[i] = new Ball(xPositionForAllBalls, (float) (height * (i+1)) /5, sizeOfBall);
        }
    }

    @Override
    public void draw() {
        for(int i=0; i < balls.length; i++){
            balls[i].show(this);
            balls[i].move(i+1);
        }
    }
}
