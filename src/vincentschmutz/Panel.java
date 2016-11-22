package vincentschmutz;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel{
	private ArrayList<JButton> goebbels;
	public Panel(){
		this.goebbels = new ArrayList<JButton>();
		ImageIcon imageForOne = new ImageIcon(getClass().getResource("hahn.jpg"));
		for(int i=0; i<25; i++) this.goebbels.add(new JButton("", imageForOne));
		this.setLayout(new GridLayout(5,5));
		for(JButton b:goebbels) {
			//b.setBackground(Color.gray);
			this.add(b);
		}
		
	}
	
	public boolean isJButton(JButton b){
		//if(b == this.goebbels) return true;
		return false;
	}
}
