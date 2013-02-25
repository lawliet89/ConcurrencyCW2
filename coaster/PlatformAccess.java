

/**
 * Complete the implementation of this class in line with the FSP model
 */

public class PlatformAccess {

  /* declarations required */
  boolean platformOccupied = false;

  public void arrive() throws InterruptedException {
	  // complete implementation
	  synchronized(this){
		  while(platformOccupied)
			  wait();
		  platformOccupied = true;
	  }
	  
  }

  public synchronized void depart() {
	  synchronized(this){
		  platformOccupied = false;
		  notifyAll();
	  }
	  
  }

}