package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Personajes extends Thread{
	private PApplet app1;
	private int posX;
	private boolean vivo;
	private PImage Homero;
	
	public Personajes(PApplet app1) {
		this.app1=app1;
		this.posX=20;
		vivo=true;
		Homero = app1.loadImage("Data/homero_simpson.png");
	}

	@Override
	public void run() {
		while(true) {
			mover();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void pintar() {
		app1.image(Homero, posX, 0, 70, 100);
	}
	
/*	public boolean validar() {
		if(app1.dist(app1.mouseX, app1.mouseY, posX, 20) <25) {
			return true;
		} else {
			return false;
		}
	}
*/
	
	public void mover() {
		posX++;
	}
	
		
	}






	
