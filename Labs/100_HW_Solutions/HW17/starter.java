import pkg.*;
import java.util.Scanner;
import java.util.Random;

 public class Robot {
     private int[] hall;
     private int pos;
     private boolean facingRight;
    
    public Robot(int[] hall, int pos, boolean facingRight) {
        this.hall = hall;
        this.pos = pos;
        this.facingRight = facingRight;
    }
    
    private boolean forwardMoveBlocked() {
        if(pos == 0 && !facingRight) {
            return true;
        }
        if(pos == hall.length - 1 && facingRight) {
            return true;
        }
        return false
    }
    
    private void move() {
        if(hall[pos] > 0) {
            hall[pos] = hall[pos] - 1;
        }   
        if (hall[pos] > 0) {
            return;
        }
        if (hall[pos] == 0) {
            if(!forwardMoveBlocked()) {
                if (facingRight) {
                    pos = pos + 1;
                } else {
                    pos = pos - 1;
                }
            } else {
                faceRight = !faceRight;
            }
        }
    }
    
    public int clearHall() {
        int moves = 0;
        while(!hallIsClear()) {
            move();
            moves = moves + 1;
        }
        return moves;
    }
    
    private boolean hallIsClear() {
        for(int i = 0, i < hall.length; i++) {
            if(hall[i] > 0) {
                return false;
            }
        }
        return true;
    }
    
    
}
