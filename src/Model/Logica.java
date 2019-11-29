package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	private PApplet app;
	private PImage Homero, Bart;
	Personajes personajes;
	
	
	
	public Logica(PApplet app){
		this.app = app;
		Homero = app.loadImage("Data/homero_simpson.png");
		this.personajes= new Personajes(app);
		
	}
	
	public void pintar() {
		//app.image(Homero, 0, 0, 70, 100);
		personajes.pintar();
	}
}
