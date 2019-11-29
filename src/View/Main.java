package View;

import Model.Logica;
import Model.MiExcepcion;
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
		background(255);
		logica.pintar();
		try {
			logica.Excepciones();
		} catch (MiExcepcion e) {
			System.out.println(e.getMessage());
		}
			
		}
	
	public void mousePressed() {
		
	}

}
