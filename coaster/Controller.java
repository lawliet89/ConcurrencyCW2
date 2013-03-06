

/**
 * Complete the implementation of this class in line with the FSP model
 */

import display.*;

public class Controller {

  public static int Max = 9;
  protected NumberCanvas passengers;

  // declarations required
  protected int noPassengers;  // no. of passengers on the platform
  protected boolean go = false;

  public Controller(NumberCanvas nc) {
    passengers = nc;
  }

  public synchronized void newPassenger() throws InterruptedException {
     // complete implementation
     // use "passengers.setValue(integer value)" to update diplay
    while (noPassengers >= Max)
        wait();

    noPassengers++;
    passengers.setValue(noPassengers);
    notifyAll();
  }

  public synchronized int getPassengers(int mcar) throws InterruptedException {
     // complete implementation for part I
     // update for part II
     // use "passengers.setValue(integer value)" to update diplay
	  
	 go = false;		// reset go flag
	 while (noPassengers < mcar && !go) 
        wait();
     
     if (noPassengers < mcar && go){
    	 mcar = noPassengers;
    	 noPassengers = 0;
         go = false;
     }
     else{
    	 noPassengers -= mcar;
     }
     passengers.setValue(noPassengers);
     notifyAll();
     return mcar;
  }

  public synchronized void goNow() {
	  // complete implementation for part II
	  if (noPassengers > 0){
		  go = true;
          notifyAll();
	  }
  }

}