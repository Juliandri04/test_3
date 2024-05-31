package src.main.java;

public class Ball {
    
    private int numberOfBalls;
    
    public Ball() {
        this.reset();
    }
    
    public void reset() {
        numberOfBalls = 0;
    }
    
    public void addBall() {
        numberOfBalls++;
    }
    
    public void removeBall() {
        if (numberOfBalls > 0) {
            numberOfBalls--;
        }
    }
    
    public int getNumberOfBalls() {
        return numberOfBalls;
    }
}
