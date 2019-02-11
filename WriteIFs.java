
/**
 * Write a description of class WriteIFs here.
 *
 * @author (Pineapple McGee)
 * @version (1.0)
 */
public class WriteIFs
{

     public void playerDied(boolean player1) {
        boolean isAlive = !player1;

        if (isAlive) {
            System.out.println ("Yay");
        }   else  {

            displayGameOver(player1);

        }

    }

    public String thermoSTAT(int room) {
        if (tempurature(room) < 70) {
            heatOn(); 
        } else {
            coolOn();
        }

        return this.ss;
    }

    public void fireplaceControl(Object fireplace1) {
        
        if (outsideTemp() < 50 && insideTemp() < 62) {
            startAFire(fireplace1);
        }  
        
    }

    public void checkFuel(double fuelLevel) {
         if (fuelLevel < 0.08) {
             refuel();
            }
        
       
    }

    int x;
    int tt_t;
    int tt_s;
    int oo1, oo2;
    String ss;

    /**
     * Constructor for objects of class WriteIFs
     */
    public WriteIFs()
    {
        // initialise instance variables
        x = 0;
        tt_t = 0;
        tt_s = 1;
        ss = "";
        oo1 = 61;
        oo2 = 49;
    }

    // associated routines
    public boolean isAlive(boolean p) {
        return !p;
    }

    private int tempurature(int t) {
        return t+2;
    }

    private void heatOn() {
        this.ss = "heating";
    }

    private void coolOn() {
        this.ss = "cooling";
    }

    private int insideTemp() {
        return oo1;
    }

    private int outsideTemp() {
        return oo2;
    }

    private void startAFire(Object o) {
        this.tt_s = 213;
    }

    private void refuel() {
        this.x = 99;
    }

    private void displayGameOver(boolean b) {
        this.ss = "Game Over!";
    }
}
