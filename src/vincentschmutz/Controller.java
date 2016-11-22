package vincentschmutz;
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
		this.p = new Panel();
		this.lo = new LightsOut();
		this.v = new View(this.p, this.lo, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.p.isJButton1((JButton)e.getSource())==true){}
		if(this.p.isJButton2((JButton)e.getSource())==true){}
		if(this.p.isJButton3((JButton)e.getSource())==true){}
		if(this.p.isJButton4((JButton)e.getSource())==true){}
		if(this.p.isJButton5((JButton)e.getSource())==true){}
		if(this.p.isJButton6((JButton)e.getSource())==true){}
		if(this.p.isJButton7((JButton)e.getSource())==true){}
		if(this.p.isJButton8((JButton)e.getSource())==true){}
		if(this.p.isJButton9((JButton)e.getSource())==true){}
		if(this.p.isJButton10((JButton)e.getSource())==true){}
		if(this.p.isJButton11((JButton)e.getSource())==true){}
		if(this.p.isJButton12((JButton)e.getSource())==true){}
		if(this.p.isJButton13((JButton)e.getSource())==true){}
		if(this.p.isJButton14((JButton)e.getSource())==true){}
		if(this.p.isJButton15((JButton)e.getSource())==true){}
		if(this.p.isJButton16((JButton)e.getSource())==true){}
		if(this.p.isJButton17((JButton)e.getSource())==true){}
		if(this.p.isJButton18((JButton)e.getSource())==true){}
		if(this.p.isJButton19((JButton)e.getSource())==true){}
		if(this.p.isJButton20((JButton)e.getSource())==true){}
		if(this.p.isJButton21((JButton)e.getSource())==true){}
		if(this.p.isJButton22((JButton)e.getSource())==true){}
		if(this.p.isJButton23((JButton)e.getSource())==true){}
		if(this.p.isJButton24((JButton)e.getSource())==true){}
		if(this.p.isJButton25((JButton)e.getSource())==true){}
		
	}
	public static void main(String[] args){
		new Controller();
	}
}

