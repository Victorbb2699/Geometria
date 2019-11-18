package dad.javafx.geometria.circulo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirculoView extends VBox {

	private Circle circuloShape;
	private Label areaLabel;
	private TextField radioText;
	private Label perimetroLabel;
	
	public CirculoView() {
		super();


		radioText = new TextField();
		
		HBox radioBox = new HBox(5, new Label("Radio:"), radioText);
		radioBox.setAlignment(Pos.CENTER);
		
		circuloShape = new Circle();
		circuloShape.setFill(Color.ORANGE);
		circuloShape.setStroke(Color.DARKBLUE);
		circuloShape.setStrokeWidth(2);
		
		
		areaLabel = new Label();
		HBox areaBox = new HBox(5, new Label("Área:"), areaLabel);
		areaBox.setAlignment(Pos.CENTER);
		
		perimetroLabel = new Label();
		HBox perimetroBox = new HBox(5, new Label("Perímetro:"), perimetroLabel);
		perimetroBox.setAlignment(Pos.CENTER);
		
		
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(radioBox, circuloShape, areaBox, perimetroBox);
		this.setPadding(new Insets(5));

	}

	public Circle getCirculoShape() {
		return circuloShape;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public TextField getRadioText() {
		return radioText;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}


}
