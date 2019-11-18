package dad.javafx.geometria.hexagono;

import dad.javafx.geometria.shapes.Hexagon;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController extends VBox {

	// model
	private HexagonoModel model = new HexagonoModel(20.0);

	// view
	private TextField radioText;
	private Hexagon hexagonShape;
	private Label areaLabel, perimetroLabel;

	public HexagonoController() {
		super();

		radioText = new TextField();

		HBox radioBox = new HBox(5, new Label("Apotema:"), radioText);
		radioBox.setAlignment(Pos.CENTER);

		// area y perimetro añadido

		areaLabel = new Label();
		HBox areaBox = new HBox(5, new Label("Área:"), areaLabel);
		areaBox.setAlignment(Pos.CENTER);

		perimetroLabel = new Label();
		HBox perimetroBox = new HBox(5, new Label("Perímetro:"), perimetroLabel);
		perimetroBox.setAlignment(Pos.CENTER);

		hexagonShape = new Hexagon();
		hexagonShape.setFill(Color.PURPLE);
		hexagonShape.setStroke(Color.DARKBLUE);
		hexagonShape.setStrokeWidth(2);

		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(radioBox, hexagonShape, areaBox, perimetroBox);
		this.setPadding(new Insets(5));

		// bindigs

		radioText.textProperty().bindBidirectional(model.apotemaProperty(), new NumberStringConverter());
		hexagonShape.radiusProperty().bind(model.apotemaProperty());

		areaLabel.textProperty().bind(model.areaProperty().asString());
		perimetroLabel.textProperty().bind(model.perimetroProperty().asString());

	}

}
