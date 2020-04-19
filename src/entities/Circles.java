package entities;

import entities.enums.Color;

public class Circles extends Shape {
	
	private Double radius;
	
	public Circles() {
		super();
	}
	

	public Circles(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
