package vincentschmutz;
import java.awt.BorderLayout;
import java.awt.Container;
import java.util.*;
import javax.swing.*;
/**
 * @author Vincent Schwartz
 * @version 2016-11-21
 */
public class View extends JFrame{
	private Panel p;
	private Controller c;
	private LightsOut lo;
	public View(Panel p, LightsOut lo, Controller c){
		this.p = p;
		this.c = c;
		this.lo = lo;
		this.setTitle("LightsOut");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(this.p);
		this.setVisible(true);
	}
	
}
