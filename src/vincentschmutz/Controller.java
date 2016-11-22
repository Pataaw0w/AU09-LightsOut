package vincentschmutz;

import java.awt.event.*;

/**
 * @author Patrick Zhanel
 * @version 2016-11-22
 * 
 * Controller-Klasse zur Verarbeitung der Aktionen der gedrückten Buttons
 *
 */
public class Controller implements ActionListener {
	
	private LightsOut lo;
	private View v;
	private Panel p;

	public Controller(){
		
		this.lo = new LightsOut();
		this.p = new Panel();
		this.v = new View(this.p, this.lo, this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		
	}

}
