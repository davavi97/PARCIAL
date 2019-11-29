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
		this.posX=200;
		vivo=true;
		Homero = app1.loadImage("Data/homero_simpson.png");
	}

	@Override
	public void run() {
		while(true) {
			mover();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void pintar() {
		app1.image(Homero, posX, 0, 70, 100);
		
		
	}
	

	
	public void mover() {
		posX++;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
	
	
		
	}






	
