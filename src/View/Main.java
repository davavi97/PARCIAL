package View;

import Model.Logica;
import processing.core.PApplet;

public class Main extends PApplet {
	Logica logica;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());

	}
	public void setup() {
		logica= new Logica(this);
	}
	public void settings() {
		size(1000,600);
	}
	public void draw() {
		background(208,200,260);
		logica.pintar();
	}
	public void mousePressed() {
		
	}

}
