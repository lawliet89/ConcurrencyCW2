

/**
 * Complete the implementation of this class in line with the FSP model
 */

import display.*;

public class Controller {

  public static int Max = 9;
  protected NumberCanvas passengers;

  // declarations required
  protected int noPassengers;  // no. of passengers on the platform


  public Controller(NumberCanvas nc) {
    passengers = nc;
  }

  public void newPassenger() throws InterruptedException {
     // complete implementation
     // use "passengers.setValue(integer value)" to update diplay
	  while (noPassengers >= Max){
		  // do nothing
	  }
	  noPassengers++;
	  passengers.setValue(noPassengers);
  }

  public int getPassengers(int mcar) throws InterruptedException {
     // complete implementation for part I
     // update for part II
     // use "passengers.setValue(integer value)" to update diplay
     while (noPassengers < mcar)  {
       // do nothing
     }
     noPassengers -= mcar;
     passengers.setValue(noPassengers);
   
     return mcar;
  }

  public synchronized void goNow() {
    // complete implementation for part II
  }

}