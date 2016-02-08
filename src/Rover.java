/**
 * Created by slav on 16-2-8.
 */
public class Rover {
    private char facingDirection;
    private int x;
    private int y;

    public Rover(char facingDirection, int x, int y) {
        this.facingDirection = facingDirection;
        this.x = x;
        this.y = y;
    }

    public char getFacingDirection() {
        return facingDirection;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void command(char commandType){
        if(commandType == 'F' || commandType == 'B'){
            move(commandType);
        } else {
            rotate(commandType);
        }
    }

    private void move(char direction){
        if(direction == 'F'){
            switch(facingDirection) {
                case 'E': {x -= 1;break;}
                case 'N': {y += 1;break;}
                case 'W': {x += 1;break;}
                case 'S': {y -= 1;break;}
            }
        } else {
            switch(facingDirection) {
                case 'E': {x += 1;break;}
                case 'N': {y -= 1;break;}
                case 'W': {x -= 1;break;}
                case 'S': {y += 1;break;}
            }
        }
    }

    private void rotate(char direction) {
        if(direction == 'L'){
            switch(facingDirection) {
                case 'E': {facingDirection = 'S';break;}
                case 'N': {facingDirection = 'E';break;}
                case 'W': {facingDirection = 'N';break;}
                case 'S': {facingDirection = 'W';break;}
            }
        } else {
            switch(facingDirection) {
                case 'E': {facingDirection = 'N';break;}
                case 'N': {facingDirection = 'W';break;}
                case 'W': {facingDirection = 'S';break;}
                case 'S': {facingDirection = 'E';break;}
            }
        }
    }
}
