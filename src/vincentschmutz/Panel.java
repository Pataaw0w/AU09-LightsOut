package vincentschmutz;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel{
	private HashSet<JButton> goebbels;
	public Panel(){
		this.goebbels = new HashSet<JButton>();
		for(int i=0; i<25; i++) this.goebbels.add(new JButton(""));
		this.setLayout(new GridLayout(5,5));
		for(JButton b:goebbels) this.add(b);
		
	}
	
	public boolean isJButton(){
		return true;
	}
}
