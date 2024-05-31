package test.java;

import static org.junit.Assert.*;
import src.main.java.Ball;
import org.junit.Test;

public class BallTest {

    @Test
    public void testReset() {
        Ball testBall = new Ball();
        
        for(int i = 0; i < 10; i++) {
            testBall.addBall();
        }
        
        testBall.reset();
        
        assertEquals(testBall.getNumberOfBalls(), 0);
    }

    @Test
    public void testAddBall() {
        Ball testBall = new Ball();
        
        for(int i = 1; i <= 10; i++) {
            testBall.addBall();
            assertEquals(testBall.getNumberOfBalls(), i);
        }
    }

    @Test
    public void testRemoveBall() {
        Ball testBall = new Ball();
        
        for(int i = 1; i <= 10; i++) {
            testBall.addBall();
        }
        
        for(int i = 9; i >= 0; i--) {
            testBall.removeBall();
            assertEquals(testBall.getNumberOfBalls(), i);
        }
    }
}
