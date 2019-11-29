package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	private PApplet app;
	private PImage Homero, Bart;
	Personajes personajes;
	private Personajes [] arrPerso;
	private int cont;

	
	
	
	public Logica(PApplet app){
		this.app = app;
		Homero = app.loadImage("Data/homero_simpson.png");
		this.personajes= new Personajes(app);
		arrPerso = new Personajes [10];
		personajes.start();
		cont++;
		
	}
	
	public void pintar() {
		personajes.pintar();
	for(int i = 0; i < cont; i++) {
		cont++;
		
	}
	}
	
	public void Excepciones() throws MiExcepcion{
		if(cont >10) {
			throw new MiExcepcion("Intente");
		}
	}
}

