package vincentschmutz;
import javax.swing.JButton;

/**
 * @author Patrick Zhanel
 * @version 2016-11-22
 * 
 * Model-Klasse für die benötigten Methoden.
 * true - an, false - off
 */

public class LightsOut {
	
	private boolean[][] lights;
	/**
	 * Constructor for LightsOut (Model) class
	 */
	public LightsOut(){
		
		this.lights = new boolean[5][5];
		
		for(int i = 0; i < 5; i++){
			
			for(int j = 0; j < 5; j++){
			
			this.lights[i][j] = true;
					
			}
			
		}
		
	}
	/**
	 * Ändert die Farbe von einer "zufälligen" Anzahl von Buttons.
	 */
	public void click(){
		int rdm = (int)(Math.random()*24);
		for(int i=3; i<=rdm; i++){
			int x = (int)(Math.random()*4);
			int y = (int)(Math.random()*4);
			changeColor(x, y);
		}
	}
	
	/**
	 * Method to see which button is pressed
	 * 
	 * @param x coordinate
	 * @param y coordinate
	 */
	
	public void changeColor(int x, int y){
		
		if(x != 0 && x != 4 && y != 0 && y != 4) {
		
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x+1][y] = !this.lights[x+1][y];
			this.lights[x-1][y] = !this.lights[x-1][y];
			this.lights[x][y+1] = !this.lights[x][y+1];
			this.lights[x][y-1] = !this.lights[x][y-1];
			
		} else if(x == 0 && y != 0 && y != 4){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x+1][y] = !this.lights[x+1][y];
			this.lights[x][y+1] = !this.lights[x][y+1];
			this.lights[x][y-1] = !this.lights[x][y-1];
			
		} else if(x == 4 && y != 0 && y != 4){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x-1][y] = !this.lights[x-1][y];
			this.lights[x][y+1] = !this.lights[x][y+1];
			this.lights[x][y-1] = !this.lights[x][y-1];
			
		} else if(x != 0 && x != 4 && y == 0){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x+1][y] = !this.lights[x+1][y];
			this.lights[x-1][y] = !this.lights[x-1][y];
			this.lights[x][y+1] = !this.lights[x][y+1];
			
		} else if(x != 0 && x != 4 && y == 4){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x+1][y] = !this.lights[x+1][y];
			this.lights[x-1][y] = !this.lights[x-1][y];
			this.lights[x][y-1] = !this.lights[x][y-1];
			
		} else if(x == 0 && y == 0){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x+1][y] = !this.lights[x+1][y];
			this.lights[x][y+1] = !this.lights[x][y+1];
			
		} else if(x == 4 && y == 0){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x-1][y] = !this.lights[x-1][y];
			this.lights[x][y+1] = !this.lights[x][y+1];
			
		} else if(x == 0 && y == 4){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x+1][y] = !this.lights[x+1][y];
			this.lights[x][y-1] = !this.lights[x][y-1];
			
		} else if(x == 4 && y == 4){
			
			this.lights[x][y] = !this.lights[x][y];
			this.lights[x-1][y] = !this.lights[x-1][y];
			this.lights[x][y-1] = !this.lights[x][y-1];
			
		}
		
	}
	/**
	 * Gettet das boolean Array lights
	 * @return this.lights
	 */
	public boolean[][] getLights(){
		
		return this.lights;
		
	}

}
