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

    public void move(char direction){
        if(direction == 'F'){
            y += 1;
        } else {
            y -= 1;
        }
    }

}
