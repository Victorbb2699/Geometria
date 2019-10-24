package dad.javafx.geometria.circulo;

import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class CirculoView extends GridPane {

	private Circle circuloShape;
	private Rectangle rectanguloShape;
	private Triangle triangleShape;
	private Hexagon hexagonoShape;

	public CirculoView() {
		super();

		circuloShape = new Circle();
		circuloShape.setRadius(40);
		circuloShape.setFill(Color.RED);
		circuloShape.setStrokeWidth(2);
		circuloShape.setStroke(Color.BLACK);



		this.setVgap(5);
		this.setHgap(5);
		this.setAlignment(Pos.CENTER);
		this.add(circuloShape, 1, 0);
		
		
	}

}
