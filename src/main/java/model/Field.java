package model;

public class Field {
	
	private Figure[] figures = new Figure[2];

	public Figure[] getFigures() {
		return figures;
	}

	public void setFigure (final Figure figure, int i){
		figures[i] = figure;
	}
}
