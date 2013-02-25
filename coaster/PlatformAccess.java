

/**
 * Complete the implementation of this class in line with the FSP model
 */

public class PlatformAccess {

  /* declarations required */
  boolean platformOccupied = false;

  public void arrive() throws InterruptedException {
	  // complete implementation
	  while(platformOccupied);	// do nothing
	  platformOccupied = true;
  }

  public void depart() {
	  platformOccupied = false;
	  
  }

}