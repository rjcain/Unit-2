package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beeperValue;
    public void fixBallots() {
        for(int x = 5; x > 0; x--) {
            beeperValue = 0;
            check3();
            checkRooms();
        }
    }
    public void check3() {
       move();
       while(nextToABeeper()) {
           pickBeeper();
           beeperValue++;
       }
    }
    public void checkRooms() {
        if(beeperValue >= 1) {
            beepRooms();
        }
        else {
            cleanRooms();
        }
    }
    public void beepRooms() {
        turnLeft();
        move();
        beeperValue = 0;
        while(nextToABeeper()) {
            pickBeeper();
            beeperValue++;
        }
        if(beeperValue != 0) {
            putBeeper();
            beeperValue = 0;
        }
        turnLeft();
        turnLeft();
        move();
        move();
        beeperValue = 0;
        while(nextToABeeper()) {
            pickBeeper();
            beeperValue++;
        }
        if(beeperValue != 0) {
            putBeeper();
            beeperValue = 0;
        }
        turnLeft();
        turnLeft();
        move();
        turnRight();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void cleanRooms() {
        turnLeft();
        move();
        while(nextToABeeper()) {
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        move();
        while(nextToABeeper()) {
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        turnRight();
        move();
    }
}

