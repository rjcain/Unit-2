package lab_5.pair_programming;
import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers = 0;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void doubleBeepers()
    {
       move();
       while(nextToABeeper()) {
           pickBeeper();
           beepers++;
        }
       for(int x = 0; x < beepers; x++) {
           putBeeper();
        }
       move();
       for(int y = 0; y < 2; y++) {
           for(int x = 0; x < beepers; x++) {
           putBeeper();
          }
        }
       move();
    }
}
