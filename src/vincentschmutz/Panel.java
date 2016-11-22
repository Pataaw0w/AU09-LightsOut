package vincentschmutz;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
/**
 * @author Vincent Schwartz
 * @version 2016-11-22
 */
public class Panel extends JPanel{
	private JButton[][] goebbels;
	private int random, random2;
	/**
	 * Constructor for Panel
	 */
	public Panel(){
		this.goebbels = new JButton[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				this.goebbels[i][j] = new JButton(); //i = x-Achse, j = y-Achse
				this.goebbels[i][j].setBackground(Color.gray);
			}
		}
		
		this.setLayout(new GridLayout(5,5));
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				this.add(this.goebbels[i][j]);
			}
		}
	}
	/**
	 * @param b
	 * @return true if b == this.goebbels[x][y] 
	 */
	public boolean isJButton1(JButton b){
		if(b == this.goebbels[0][0]) return true;
		return false;
	}
	public boolean isJButton2(JButton b){
		if(b == this.goebbels[0][1]) return true;
		return false;
	}
	public boolean isJButton3(JButton b){
		if(b == this.goebbels[0][2]) return true;
		return false;
	}
	public boolean isJButton4(JButton b){
		if(b == this.goebbels[0][3]) return true;
		return false;
	}
	public boolean isJButton5(JButton b){
		if(b == this.goebbels[0][4]) return true;
		return false;
	}
	public boolean isJButton6(JButton b){
		if(b == this.goebbels[1][0]) return true;
		return false;
	}
	public boolean isJButton7(JButton b){
		if(b == this.goebbels[1][1]) return true;
		return false;
	}
	public boolean isJButton8(JButton b){
		if(b == this.goebbels[1][2]) return true;
		return false;
	}
	public boolean isJButton9(JButton b){
		if(b == this.goebbels[1][3]) return true;
		return false;
	}
	public boolean isJButton10(JButton b){
		if(b == this.goebbels[1][4]) return true;
		return false;
	}
	public boolean isJButton11(JButton b){
		if(b == this.goebbels[2][0]) return true;
		return false;
	}
	public boolean isJButton12(JButton b){
		if(b == this.goebbels[2][1]) return true;
		return false;
	}
	public boolean isJButton13(JButton b){
		if(b == this.goebbels[2][2]) return true;
		return false;
	}
	public boolean isJButton14(JButton b){
		if(b == this.goebbels[2][3]) return true;
		return false;
	}
	public boolean isJButton15(JButton b){
		if(b == this.goebbels[2][4]) return true;
		return false;
	}
	public boolean isJButton16(JButton b){
		if(b == this.goebbels[3][0]) return true;
		return false;
	}
	public boolean isJButton17(JButton b){
		if(b == this.goebbels[3][1]) return true;
		return false;
	}
	public boolean isJButton18(JButton b){
		if(b == this.goebbels[3][2]) return true;
		return false;
	}
	public boolean isJButton19(JButton b){
		if(b == this.goebbels[3][3]) return true;
		return false;
	}
	public boolean isJButton20(JButton b){
		if(b == this.goebbels[3][4]) return true;
		return false;
	}
	public boolean isJButton21(JButton b){
		if(b == this.goebbels[4][0]) return true;
		return false;
	}
	public boolean isJButton22(JButton b){
		if(b == this.goebbels[4][1]) return true;
		return false;
	}
	public boolean isJButton23(JButton b){
		if(b == this.goebbels[4][2]) return true;
		return false;
	}
	public boolean isJButton24(JButton b){
		if(b == this.goebbels[4][3]) return true;
		return false;
	}
	public boolean isJButton25(JButton b){
		if(b == this.goebbels[4][4]) return true;
		return false;
	}
}
