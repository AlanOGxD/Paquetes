package edu.tecjerez.topicos.figuras.tresDimensiones;

public class Cono {
	private double volumenCono(double radio, double altura) {
		return (Math.PI * Math.pow(radio, 2) * altura) / 3;	
	}
}