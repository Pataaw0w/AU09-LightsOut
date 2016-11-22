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
		this.p = new Panel(this);
		this.lo = new LightsOut();
		this.v = new View(this.p, this.lo, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.p.isJButton1((JButton)e.getSource())){
			this.p.getJButton1().setBackground(Color.white);
		}
		if(this.p.isJButton2((JButton)e.getSource())){
			this.p.getJButton2().setBackground(Color.white);
		}
		if(this.p.isJButton3((JButton)e.getSource())){
			this.p.getJButton3().setBackground(Color.white);
		}
		if(this.p.isJButton4((JButton)e.getSource())){
			this.p.getJButton4().setBackground(Color.white);
		}
		if(this.p.isJButton5((JButton)e.getSource())){
			this.p.getJButton5().setBackground(Color.white);
		}
		if(this.p.isJButton6((JButton)e.getSource())){
			this.p.getJButton6().setBackground(Color.white);
		}
		if(this.p.isJButton7((JButton)e.getSource())){
			this.p.getJButton7().setBackground(Color.white);
		}
		if(this.p.isJButton8((JButton)e.getSource())){
			this.p.getJButton8().setBackground(Color.white);
		}
		if(this.p.isJButton9((JButton)e.getSource())){
			this.p.getJButton9().setBackground(Color.white);
		}
		if(this.p.isJButton10((JButton)e.getSource())){
			this.p.getJButton10().setBackground(Color.white);
		}
		if(this.p.isJButton11((JButton)e.getSource())){
			this.p.getJButton11().setBackground(Color.white);
		}
		if(this.p.isJButton12((JButton)e.getSource())){
			this.p.getJButton12().setBackground(Color.white);
		}
		if(this.p.isJButton13((JButton)e.getSource())){
			this.p.getJButton13().setBackground(Color.white);
		}
		if(this.p.isJButton14((JButton)e.getSource())){
			this.p.getJButton14().setBackground(Color.white);
		}
		if(this.p.isJButton15((JButton)e.getSource())){
			this.p.getJButton15().setBackground(Color.white);
		}
		if(this.p.isJButton16((JButton)e.getSource())){
			this.p.getJButton16().setBackground(Color.white);
		}
		if(this.p.isJButton17((JButton)e.getSource())){
			this.p.getJButton17().setBackground(Color.white);
		}
		if(this.p.isJButton18((JButton)e.getSource())){
			this.p.getJButton18().setBackground(Color.white);
		}
		if(this.p.isJButton19((JButton)e.getSource())){
			this.p.getJButton19().setBackground(Color.white);
		}
		if(this.p.isJButton20((JButton)e.getSource())){
			this.p.getJButton20().setBackground(Color.white);
		}
		if(this.p.isJButton21((JButton)e.getSource())){
			this.p.getJButton21().setBackground(Color.white);
		}
		if(this.p.isJButton22((JButton)e.getSource())){
			this.p.getJButton22().setBackground(Color.white);
		}
		if(this.p.isJButton23((JButton)e.getSource())){
			this.p.getJButton23().setBackground(Color.white);
		}
		if(this.p.isJButton24((JButton)e.getSource())){
			this.p.getJButton24().setBackground(Color.white);
		}
		if(this.p.isJButton25((JButton)e.getSource())){
			this.p.getJButton25().setBackground(Color.white);
		}
		this.p.refresh();
	}
	public static void main(String[] args){
		new Controller();
	}
}

