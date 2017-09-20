package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beeperValue = 0;
    public int replaceBeep = beeperValue;
    public void findTreasure() {
        while(beeperValue != 5) {
            beeperValue = 0;
            countBeepers();
            execute();
            
        }
        turnOff();
    }
    public void countBeepers() {
        while(nextToABeeper()) {
            pickBeeper();
            beeperValue++;
        }
        replaceBeep = beeperValue;
        while(replaceBeep > 0) {
            putBeeper();
            replaceBeep--;
        }
    }
    public void execute() {
        if(beeperValue == 1) {
            while(!facingNorth()) {
                turnLeft();
            }
            move();
            while(!nextToABeeper()) {
                move();
            }
        }
        if(beeperValue == 2) {
            while(!facingEast()) {
                turnLeft();
            }
            move();
            while(!nextToABeeper()) {
                move();
            }
        }
        if(beeperValue == 3) {
            while(!facingSouth()) {
                turnLeft();
            }
            move();
            while(!nextToABeeper()) {
                move();
            }
        }
        if(beeperValue == 4) {
            while(!facingWest()) {
                turnLeft();
            }
            move();
            while(!nextToABeeper()) {
                move();
            }
        }
    }
}

