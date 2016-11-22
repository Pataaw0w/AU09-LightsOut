package vincentschmutz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Patrick Zhanel, Vincent Schwartz
 * @version 2016-11-22
 *
 */
public class Controller implements ActionListener{
	private View v;
	private Panel p;
	private LightsOut lo;
	public Controller(){
		this.p = new Panel();
		this.lo = new LightsOut();
		this.v = new View(this.p, this.lo, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.p.isJButton1((JButton)e.getSource())==true){}
	}
	public static void main(String[] args){
		new Controller();
	}
}
