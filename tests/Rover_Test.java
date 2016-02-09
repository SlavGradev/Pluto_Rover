/**
 * Created by slav on 16-2-8.
 */
import org.junit.*;
public class Rover_Test {

    Rover rover;

    // Movement tests
    @Test
    public void checkIfItGoesForward(){
        rover = new Rover('N', 0, 0);
        rover.command('F');
        Assert.assertTrue(rover.getY() == 1);
    }
    @Test
    public void checkIfItGoesBackward(){
        rover = new Rover('N', 0, 1);
        rover.command('B');
        Assert.assertTrue(rover.getY() == 0);
    }
    @Test
    public void checkIfItGoingForwardDirectionIsKept(){
        rover = new Rover('N', 0, 0);
        rover.command('F');
        Assert.assertTrue(rover.getFacingDirection() == 'N');
    }
    @Test
    public void checkIfItGoesBackwardDirectionIdKept(){
        rover = new Rover('N', 0, 1);
        rover.command('B');
        Assert.assertTrue(rover.getFacingDirection() == 'N');
    }
    // Rotation Tests
    @Test
    public void checkIfRotatesRight(){
        rover = new Rover('N', 0, 0);
        rover.command('R');
        Assert.assertTrue(rover.getFacingDirection() == 'W');
    }
    @Test
    public void checkIfRotatesLeft(){
        rover = new Rover('N', 0, 1);
        rover.command('L');
        Assert.assertTrue(rover.getFacingDirection() == 'E');
    }

    @Test
    public void checkIfRotatesAndGoesForward(){
        rover = new Rover('N', 0, 0);
        rover.command('R');
        rover.command('F');
        Assert.assertTrue(rover.getFacingDirection() == 'W');
        Assert.assertTrue(rover.getX() == 1);
    }
    @Test
    public void checkIfRotatesLeftAndGoesBackward(){
        rover = new Rover('N', 0, 0);
        rover.command('L');
        rover.command('B');
        Assert.assertTrue(rover.getFacingDirection() == 'E');
        Assert.assertTrue(rover.getX() == 1);
    }

    @Test
    public void checkIfMultipleRotationWorks(){
        rover = new Rover('N', 0, 0);
        rover.command('R');
        rover.command('R');
        Assert.assertTrue(rover.getFacingDirection() == 'S');
    }
    @Test
    public void checkIfMoveForEast(){
        rover = new Rover('E', 1, 1);
        rover.command('F');
        Assert.assertTrue(rover.getX() == 0);
    }
    @Test
    public void checkIfMoveBackEast(){
        rover = new Rover('E', 1, 1);
        rover.command('B');
        Assert.assertTrue(rover.getX() == 2);
    }
    @Test
    public void checkIfMoveForWest(){
        rover = new Rover('W', 1, 1);
        rover.command('F');
        Assert.assertTrue(rover.getX() == 2);
    }
    @Test
    public void checkIfMoveBackWest(){
        rover = new Rover('W', 1, 1);
        rover.command('B');
        Assert.assertTrue(rover.getX() == 0);
    }
    @Test
    public void checkIfMoveForNorth(){
        rover = new Rover('N', 1, 1);
        rover.command('F');
        Assert.assertTrue(rover.getY() == 2);
    }
    @Test
    public void checkIfMoveBackNorth(){
        rover = new Rover('N', 1, 1);
        rover.command('B');
        Assert.assertTrue(rover.getY() == 0);
    }
    @Test
    public void checkIfMoveForSouth(){
        rover = new Rover('S', 1, 1);
        rover.command('F');
        Assert.assertTrue(rover.getY() == 0);
    }
    @Test
    public void checkIfMoveBackSouth(){
        rover = new Rover('S', 1, 1);
        rover.command('B');
        Assert.assertTrue(rover.getY() == 2);
    }

    @Test
    public void checkIfRotateLeftNorth(){
        rover = new Rover('N', 0, 0);
        rover.command('L');
        Assert.assertTrue(rover.getFacingDirection() == 'E');
    }

    @Test
    public void checkIfRotateRightNorth(){
        rover = new Rover('N', 0, 0);
        rover.command('R');
        Assert.assertTrue(rover.getFacingDirection() == 'W');
    }

    @Test
    public void checkIfRotateLeftWest(){
        rover = new Rover('W', 0, 0);
        rover.command('L');
        Assert.assertTrue(rover.getFacingDirection() == 'N');
    }

    @Test
    public void checkIfRotateRightWest(){
        rover = new Rover('W', 0, 0);
        rover.command('R');
        Assert.assertTrue(rover.getFacingDirection() == 'S');
    }
    @Test
    public void checkIfRotateLeftEast(){
        rover = new Rover('E', 0, 0);
        rover.command('L');
        Assert.assertTrue(rover.getFacingDirection() == 'S');
    }

    @Test
    public void checkIfRotateRightEast(){
        rover = new Rover('E', 0, 0);
        rover.command('R');
        Assert.assertTrue(rover.getFacingDirection() == 'N');
    }
    @Test
    public void checkIfRotateLeftSouth(){
        rover = new Rover('S', 0, 0);
        rover.command('L');
        Assert.assertTrue(rover.getFacingDirection() == 'W');
    }

    @Test
    public void checkIfRotateRightSouth(){
        rover = new Rover('S', 0, 0);
        rover.command('R');
        Assert.assertTrue(rover.getFacingDirection() == 'E');
    }
    // Grid Tests
    @Test
    public void checkIfRotateRobotWrapsAroundEast(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.command('L');
        rover.command('F');
        Assert.assertTrue(rover.getX() == 99 );
    }

    @Test
    public void checkIfRotateRobotWrapsAroundSouth(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.command('B');
        Assert.assertTrue(rover.getY() == 99 );
    }

    @Test
    public void checkIfRotateRobotWrapsAroundNorth(){
        rover = new Rover('N', 0, 99, 100, 100);
        rover.command('F');
        Assert.assertTrue(rover.getY() == 0 );
    }

    @Test
    public void checkIfRotateRobotWrapsAroundWest(){
        rover = new Rover('W', 99, 0, 100, 100);
        rover.command('F');
        Assert.assertTrue(rover.getX() == 0 );
    }
    // String of Commands Tests

    @Test
    public void checkMultipleRotations(){
        rover = new Rover('E', 99, 0, 100, 100);
        rover.commandList("LL");
        Assert.assertTrue(rover.getFacingDirection() == 'W');
    }

    @Test
    public void checkMultipleForwards(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.commandList("FF");
        Assert.assertTrue(rover.getFacingDirection() == 'N');
        Assert.assertTrue(rover.getY() == 2);
    }

    @Test
    public void checkMoveRotationMove(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.commandList("FRF");
        Assert.assertTrue(rover.getFacingDirection() == 'W');
        Assert.assertTrue(rover.getY() == 1);
        Assert.assertTrue(rover.getX() == 1);
    }
    @Test
    public void checkMultipleForwardsMultipleBackwards(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.commandList("FFBB");
        Assert.assertTrue(rover.getFacingDirection() == 'N');
        Assert.assertTrue(rover.getY() == 0);
        Assert.assertTrue(rover.getX() == 0);
    }
    @Test
    public void checkMultipleForwardsMultipleRotationsMultipleBackwards(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.commandList("FFLLBB");
        Assert.assertTrue(rover.getFacingDirection() == 'S');
        Assert.assertTrue(rover.getY() == 4);
        Assert.assertTrue(rover.getX() == 0);
    }
    // Obstacle Tests
    @Test(expected= Rover.ObstacleException.class)
    public void checkBumpIntoObstacleThrowsException(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.setObstacle(0, 1);
        rover.commandList("F");
    }

    @Test
    public void checkBumpIntoObstacleReturnsLastValidCoordinates(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.setObstacle(0, 1);
        try{
            rover.commandList("F");
        }catch(Rover.ObstacleException e){
            Assert.assertTrue(rover.getY() == 0);
            Assert.assertTrue(rover.getX() == 0);
        }
    }

    @Test
    public void checkIfStopsAfterBumpingIntoFirstObstacle(){
        rover = new Rover('N', 0, 0, 100, 100);
        rover.setObstacle(0, 1);
        rover.setObstacle(2, 0);
        try{
            rover.commandList("FRFF");
        }catch(Rover.ObstacleException e){
            Assert.assertTrue(rover.getY() == 0);
            Assert.assertTrue(rover.getX() == 0);
        }
    }




}
