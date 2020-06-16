package it.dstech.formazione.model;

public class Operatore {

	private double x;
	private double y;

	public Operatore(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double somma() {
		return x + y;
	}

	public double sottrazione() {
		return x - y;
	}

	public double moltiplicazione() {
		return x * y;
	}

	public double divisione() {
		if (y == 0)
			return Double.MAX_VALUE;
		return x / y;
	}

}
