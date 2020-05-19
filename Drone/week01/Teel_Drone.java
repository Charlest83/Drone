//Author name: Charles Teel
//Date: 5/13/2020
//Program Name : Teel_Drone
//Purpose: Simulation using button, drone movement in x, y, z location 
package week01;

import java.util.Scanner;
//Every move x or y or z coordinate increase or decrease by 1.

//This program should not be GUI. Please submit source file and 2 screenshots of running program.

//Write a class that controls a drone. The class will have certain public methods that allow the UI to control the drone, and display the drone location.
public class Teel_Drone {

	// The internal variables would track the drone’s location (x, y and z
	// coordinates).
	private int x;
	private int y;
	private int z;

	public Teel_Drone() {

		x = 0;
		y = 0;
		z = 0;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
		return;
	}

	// Method to move drone up vertically
	public int moveUp(int position) {
		return y += position;

	}

	// Method to move drone down vertically
	public void moveDown(int position) {
		y -= position;
		if (y < 0) {
			y = 0;
		}

	}

	public void moveForward(int position) {

		// moving north
		z += position;
	}

	// Method to move drone backward for given position
	public void moveBackward(int position) {
		// moving south

		z -= position;

	}

	// method to turn drone 90 degrees to right

	public int turnRight(int position) {

		// Moving East

		return x += position;

	}

	// method to turn drone 90 degrees to left

	public int turnLeft(int position) {

		// Moving West

		return x -= position;

	}

	// Method to control direction of the drone.
	/*
	 * x values determine east (positive x value) or west (negative x value) , z values determine north(positive) and south(negative)
	 */
	public String orientation() {

		String n = "North";
		String e = "East";
		String w = "West";
		String s = "South";

		if (z > 0) {
			return n;

		} else if (x > 0) {
			return e;

		} else if (x < 0) {
			return w;

		} else if (z < 0) {
			return s;
		}
		return n;

	}

	public static void main(String[] args) {
		int userChoice = 0;
		

		Teel_Drone drone = new Teel_Drone();

		// displayMenu();
		Scanner keyboard = new Scanner(System.in);

		while (userChoice != 8) {

			displayMenu();

			userChoice = Integer.parseInt(keyboard.nextLine());

			if (userChoice < 0) {

				System.out.println("Number must be greater than zero");
				continue;
			}
			

			switch (userChoice) {

			// Move drone up
			case 1:
				System.out.println("You have moved up");
				drone.moveUp(1);
				break;

			// Move drone down
			case 2:
				System.out.println("You have moved down");
				drone.moveDown(1);
				break;

			// Move forward
			case 3:
				System.out.println("You have moved forward");
				drone.moveForward(1);
				break;

			// Move Backward
			case 4:
				System.out.println("You have moved backward");
				drone.moveBackward(1);

				break;

			// Turn Left
			case 5:
				System.out.println("You have turned left");
				drone.turnLeft(1);
				break;

			// Turn Right
			case 6:
				System.out.println("You have turned right");
				drone.turnRight(1);
				break;

			// Display Position
			case 7:
				System.out.println(drone.toString());

				break;

			case 8:
				System.out.println("You are no longer controlling the drone.");
				break;

			}

		}

	}

	public static void displayMenu() {

		System.out.println("Which direction would you like to move the drone? ");
		System.out.println("1 - Move Up");
		System.out.println("2 - Move Down");
		System.out.println("3 - Move Forward");
		System.out.println("4 - Move Backward");
		System.out.println("5 - Turn Left");
		System.out.println("6 - Turn Right");
		System.out.println("7 - Display Position");
		System.out.println("8 - Exit Navigation");

	}


	@Override
	public String toString() {

		return "Teel_Drone" + "[ x_pos= " + x + ", y_pos= " + y + ", z_pos=" + z + ", orientation=" + orientation()
				+ "]";
	}
}
