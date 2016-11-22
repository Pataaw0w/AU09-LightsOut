package vincentschmutz;

import javax.swing.JButton;

/**
 * @author Patrick Zhanel
 * @version 2016-11-19
 * 
 * Model-Klasse für die benötigten Methoden.
 * true - an, false - off
 */

public class LightsOut {
	
	private boolean[][] lights;
	
	public LightsOut(){
		
		this.lights = new boolean[5][5];
		
		for(int i = 0; i < 5; i++){
			
			for(int j = 0; j < 5; j++){
			
			boolean random = Math.random() >= 0.5;
			this.lights[i][j] = random;
					
			}
			
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
			this.lights[x+-1][y] = !this.lights[x+-1][y];
			this.lights[x][y-1] = !this.lights[x][y-1];
			
		}
		
	}

}
