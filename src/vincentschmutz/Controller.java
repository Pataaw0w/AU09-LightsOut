package vincentschmutz;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * @author Patrick Zhanel, Vincent Schwartz
 * @version 2016-11-22
 *
 */
public class Controller implements ActionListener{
	private View v;
	private Panel p;
	private LightsOut lo;
	/**
	 * Constructor for Controller
	 */
	public Controller(){
		this.lo = new LightsOut();
		this.p = new Panel(this, this.lo);
		this.v = new View(this.p, this.lo, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.p.isJButton1((JButton)e.getSource())){
			this.p.change(this.p.getJButton1());
		}
		if(this.p.isJButton2((JButton)e.getSource())){
			this.p.change(this.p.getJButton2());
		}
		if(this.p.isJButton3((JButton)e.getSource())){
			this.p.change(this.p.getJButton3());
		}
		if(this.p.isJButton4((JButton)e.getSource())){
			this.p.change(this.p.getJButton4());
		}
		if(this.p.isJButton5((JButton)e.getSource())){
			this.p.change(this.p.getJButton5());
		}
		if(this.p.isJButton6((JButton)e.getSource())){
			this.p.change(this.p.getJButton6());
		}
		if(this.p.isJButton7((JButton)e.getSource())){
			this.p.change(this.p.getJButton7());
		}
		if(this.p.isJButton8((JButton)e.getSource())){
			this.p.change(this.p.getJButton8());
		}
		if(this.p.isJButton9((JButton)e.getSource())){
			this.p.change(this.p.getJButton9());
		}
		if(this.p.isJButton10((JButton)e.getSource())){
			this.p.change(this.p.getJButton10());
		}
		if(this.p.isJButton11((JButton)e.getSource())){
			this.p.change(this.p.getJButton11());
		}
		if(this.p.isJButton12((JButton)e.getSource())){
			this.p.change(this.p.getJButton12());
		}
		if(this.p.isJButton13((JButton)e.getSource())){
			this.p.change(this.p.getJButton13());
		}
		if(this.p.isJButton14((JButton)e.getSource())){
			this.p.change(this.p.getJButton14());
		}
		if(this.p.isJButton15((JButton)e.getSource())){
			this.p.change(this.p.getJButton15());
		}
		if(this.p.isJButton16((JButton)e.getSource())){
			this.p.change(this.p.getJButton16());
		}
		if(this.p.isJButton17((JButton)e.getSource())){
			this.p.change(this.p.getJButton17());
		}
		if(this.p.isJButton18((JButton)e.getSource())){
			this.p.change(this.p.getJButton18());
		}
		if(this.p.isJButton19((JButton)e.getSource())){
			this.p.change(this.p.getJButton19());
		}
		if(this.p.isJButton20((JButton)e.getSource())){
			this.p.change(this.p.getJButton20());
		}
		if(this.p.isJButton21((JButton)e.getSource())){
			this.p.change(this.p.getJButton21());
		}
		if(this.p.isJButton22((JButton)e.getSource())){
			this.p.change(this.p.getJButton22());
		}
		if(this.p.isJButton23((JButton)e.getSource())){
			this.p.change(this.p.getJButton23());
		}
		if(this.p.isJButton24((JButton)e.getSource())){
			this.p.change(this.p.getJButton24());
		}
		if(this.p.isJButton25((JButton)e.getSource())){
			this.p.change(this.p.getJButton25());
		}
		this.p.refresh();
	}
	
}
