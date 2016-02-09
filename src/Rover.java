/**
 * Created by slav on 16-2-8.
 */
public class Rover {
    private char facingDirection;
    private int x;
    private int y;
    private int maxX;
    private int maxY;

    // Initializes default grid of 100 100
    public Rover(char facingDirection, int x, int y) {
        this.facingDirection = facingDirection;
        this.x = x;
        this.y = y;
        this.maxY = 100;
        this.maxX = 100;
    }

    // User supplies grid coordinates
    public Rover(char facingDirection, int x, int y,int maxX, int maxY) {
        this.facingDirection = facingDirection;
        this.x = x;
        this.y = y;
        this.maxX = maxX;
        this.maxY = maxY;
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

    public void commandList(String commands){
        for(int i = 0; i < commands.length(); i++){
            command(commands.charAt(i));
        }
    }
    // Handles Moving
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
        // Correct coordinates
        if(x == -1){
            x = maxX - 1;
        }else if (x == maxX) {
            x = 0;
        }else if (y == maxY) {
            y = 0;
        }else if (y == -1 ){
            y = maxY - 1;
        }
    }
    // Handles Rotation
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
