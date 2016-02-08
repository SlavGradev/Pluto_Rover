/**
 * Created by slav on 16-2-8.
 */
import org.junit.*;
public class Rover_Test {

    Rover rover ;
    @Test
    public void checkIfItGoesForward(){
        rover = new Rover('N', 0, 0);
        rover.move('F');
        Assert.assertTrue(rover.getY() == 1);
    }
    @Test
    public void checkIfItGoesBackward(){
        rover = new Rover('N', 0, 1);
        rover.move('B');
        Assert.assertTrue(rover.getY() == 0);
    }
    @Test
    public void checkIfItGoingForwardDirectionIsKept(){
        rover = new Rover('N', 0, 0);
        rover.move('F');
        Assert.assertTrue(rover.getFacingDirection() == 'N');
    }
    @Test
    public void checkIfItGoesBackwardDirectionIdKept(){
        rover = new Rover('N', 0, 1);
        rover.move('B');
        Assert.assertTrue(rover.getFacingDirection() == 'N');
    }



}
