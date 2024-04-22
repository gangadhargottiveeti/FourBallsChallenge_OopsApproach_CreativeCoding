import processing.core.PApplet;
public class Ball{
    private float xPosition, yPosition, sizeOfBall;
    public Ball(){

    }

    public Ball(float xPosition, float yPosition, float sizeOfBall) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.sizeOfBall = sizeOfBall;
    }

    public float getxPosition() {
        return xPosition;
    }

    public void setxPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    public float getyPosition() {
        return yPosition;
    }

    public void setyPosition(float yPosition) {
        this.yPosition = yPosition;
    }

    public float getSizeOfBall() {
        return sizeOfBall;
    }

    public void setSizeOfBall(float sizeOfBall) {
        this.sizeOfBall = sizeOfBall;
    }

    void move(float speedOfBall){
        xPosition += speedOfBall;
    }

    void show(PApplet pApplet){
        pApplet.ellipse(xPosition, yPosition, sizeOfBall, sizeOfBall);
    }
}
