package vincentschmutz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
/**
 * @author Vincent Schwartz
 * @version 2016-11-22
 */
public class Panel extends JPanel{
	private JButton[][] goebbels;
	private Controller c;
	private LightsOut lo;
	private JButton start;
	private JLabel l;
	/**
	 * Constructor for Panel class
	 * @param c
	 * @param lo 
	 */
	public Panel(Controller c, LightsOut lo){
		this.c = c;
		this.lo = lo;
		this.goebbels = new JButton[5][5];
		this.start = new JButton("Start");
		this.l = new JLabel();
		Dimension d = new Dimension(100, 100);
		Font f = new Font("Arial", Font.BOLD, 30);
		this.start.setPreferredSize(d);
		this.start.setFont(f);
		this.start.addActionListener(this.c);
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				this.goebbels[i][j] = new JButton(); //i = x-Achse, j = y-Achse
				this.goebbels[i][j].addActionListener(this.c);
				this.goebbels[i][j].setBackground(Color.gray);
			}
		}
		this.setLayout(new BorderLayout());
		this.add(this.l, BorderLayout.CENTER);
		this.l.setLayout(new GridLayout(5,5));
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				this.l.add(this.goebbels[i][j]);
			}
		}
		this.add(this.start, BorderLayout.SOUTH);
		
	}
	/**
	 * Geht 2D Array "goebbels" durch und prüft ob der JButton an der Stelle [i][j] mit dem JButton im Parameter übereinstimmt, 
	 * wenn ja wird die changeColor Methode aufgerufen.
	 * @param b
	 */
	public void change(JButton b){
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(this.goebbels[i][j] == b){
					this.lo.changeColor(i, j);
				}
			}
		}
	}
	/**
	 * Geht das light Array durch und schaut welcher JButton auf true bzw. false gesetzt ist.
	 * Wenn true, dann wird der JButton auf grau gesetzt.
	 * Wenn false, dann wird der JButton auf weiß gesetzt.
	 */
	public void refresh(){
		boolean licht[][] = lo.getLights();
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(licht[i][j])
					this.goebbels[i][j].setBackground(Color.white);
				else 
					this.goebbels[i][j].setBackground(Color.gray);
			}
		}
	}
	
	/**
	 * Getter for the JButtons
	 * @return JButton at the index this.goebbels[x][x]
	 */
	public JButton getJButton1(){return this.goebbels[0][0];}
	public JButton getJButton2(){return this.goebbels[0][1];}
	public JButton getJButton3(){return this.goebbels[0][2];}
	public JButton getJButton4(){return this.goebbels[0][3];}
	public JButton getJButton5(){return this.goebbels[0][4];}
	
	public JButton getJButton6(){return this.goebbels[1][0];}
	public JButton getJButton7(){return this.goebbels[1][1];}
	public JButton getJButton8(){return this.goebbels[1][2];}
	public JButton getJButton9(){return this.goebbels[1][3];}
	public JButton getJButton10(){return this.goebbels[1][4];}
	
	public JButton getJButton11(){return this.goebbels[2][0];}
	public JButton getJButton12(){return this.goebbels[2][1];}
	public JButton getJButton13(){return this.goebbels[2][2];}
	public JButton getJButton14(){return this.goebbels[2][3];}
	public JButton getJButton15(){return this.goebbels[2][4];}
	
	public JButton getJButton16(){return this.goebbels[3][0];}
	public JButton getJButton17(){return this.goebbels[3][1];}
	public JButton getJButton18(){return this.goebbels[3][2];}
	public JButton getJButton19(){return this.goebbels[3][3];}
	public JButton getJButton20(){return this.goebbels[3][4];}
	
	public JButton getJButton21(){return this.goebbels[4][0];}
	public JButton getJButton22(){return this.goebbels[4][1];}
	public JButton getJButton23(){return this.goebbels[4][2];}
	public JButton getJButton24(){return this.goebbels[4][3];}
	public JButton getJButton25(){return this.goebbels[4][4];}
	/**
	 * @param b
	 * @return true if b == this.goebbels[x][y] 
	 */
	public boolean isJButton1(JButton b){return b == this.goebbels[0][0];}
	public boolean isJButton2(JButton b){return b == this.goebbels[0][1];}
	public boolean isJButton3(JButton b){return b == this.goebbels[0][2];}
	public boolean isJButton4(JButton b){return b == this.goebbels[0][3];}
	public boolean isJButton5(JButton b){return b == this.goebbels[0][4];}
	
	public boolean isJButton6(JButton b){return b == this.goebbels[1][0];}
	public boolean isJButton7(JButton b){return b == this.goebbels[1][1];}
	public boolean isJButton8(JButton b){return b == this.goebbels[1][2];}
	public boolean isJButton9(JButton b){return b == this.goebbels[1][3];}
	public boolean isJButton10(JButton b){return b == this.goebbels[1][4];}
	
	public boolean isJButton11(JButton b){return b == this.goebbels[2][0];}
	public boolean isJButton12(JButton b){return b == this.goebbels[2][1];}
	public boolean isJButton13(JButton b){return b == this.goebbels[2][2];}
	public boolean isJButton14(JButton b){return b == this.goebbels[2][3];}
	public boolean isJButton15(JButton b){return b == this.goebbels[2][4];}
	
	public boolean isJButton16(JButton b){return b == this.goebbels[3][0];}
	public boolean isJButton17(JButton b){return b == this.goebbels[3][1];}
	public boolean isJButton18(JButton b){return b == this.goebbels[3][2];}
	public boolean isJButton19(JButton b){return b == this.goebbels[3][3];}
	public boolean isJButton20(JButton b){return b == this.goebbels[3][4];}
	
	public boolean isJButton21(JButton b){return b == this.goebbels[4][0];}
	public boolean isJButton22(JButton b){return b == this.goebbels[4][1];}
	public boolean isJButton23(JButton b){return b == this.goebbels[4][2];}
	public boolean isJButton24(JButton b){return b == this.goebbels[4][3];}
	public boolean isJButton25(JButton b){return b == this.goebbels[4][4];}
	/**
	 * @param b
	 * @return this.start
	 */
	public boolean isStart(JButton b){return b == this.start;}
	
}


