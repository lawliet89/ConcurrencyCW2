

/**
 * Complete the implementation of this class in line with the FSP model
 */

public class PlatformAccess {

  /* declarations required */
  boolean platformOccupied = false;

  public synchronized void arrive() throws InterruptedException {
	  // complete implementation
	  while(platformOccupied)
		  wait();
	  platformOccupied = true;
  }

  public synchronized void depart() {
	  platformOccupied = false;
	  notifyAll();
	  
  }

}