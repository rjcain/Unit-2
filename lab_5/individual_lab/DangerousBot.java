package lab_5.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beeperValue = 0;
    public void choosePile() {
        countBeepers();
        execute();
    }
    public void countBeepers() {
        while(nextToABeeper()) {
            pickBeeper();
            beeperValue++;
        }
    }
    public void execute() {
        if(beeperValue % 2 == 0) {
            while(!facingEast()) {
                turnLeft();
            }
            move();
            while(nextToABeeper()) {
                pickBeeper();
            }
        }
        else {
            while(!facingWest()) {
                turnLeft();
            }
            move();
            while(nextToABeeper()) {
                pickBeeper();
            }
        }
    }
}

