package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot Bob = new Robot();
		//2. Set the speed to 100
		Bob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Pick a color", "What color do you want?", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Yellow", "Blue"}, 0);
		
		//3. Use if statements to check the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 0) {
			Bob.setPenColor(Color.red);
		}
		
		else if (colorChoice == 1) {
			Bob.setPenColor(Color.yellow);
		}
		else {
			Bob.setPenColor(Color.blue);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String Polygons = JOptionPane.showInputDialog("how many polgons do you want drawn? 1, 2, or 3?");
		//5. Use the robot to draw the number of polygons the user requested.
		if (Polygons.equals ("1")) {
			Bob.move(100);
			Bob.turn(270);
			Bob.penDown();
			Bob.move(200);
			Bob.turn(90);
			Bob.move(200);
			Bob.turn(90);
			Bob.move(200);
			Bob.turn(90);
			Bob.move(200);
		}
		else if (Polygons.equals ("2")) {
			
			Bob.turn(270);
			Bob.penDown();
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			
			Bob.penUp();
			Bob.move(120);
			Bob.turn(90);
			Bob.penDown();
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
		}
		
		else {
		for (int i=3; i>0; i=i-1) {
			
			Bob.move(100);
			Bob.turn(270);
			Bob.penDown();
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.turn(90);
			Bob.move(100);
			Bob.penUp();
			Bob.move(120);
			
			}
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

