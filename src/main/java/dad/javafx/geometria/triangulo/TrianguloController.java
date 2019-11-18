package dad.javafx.geometria.triangulo;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController extends VBox {

	// model

	private TrianguloModel trianguloModel = new TrianguloModel(20.0, 20.0);

	// view
	private TextField baseText;
	private TextField alturaText;

	private Label areaLabel;
	private Label perimetroLabel;

	private Triangle trianguloShape;

	public TrianguloController() {
		super();

		baseText = new TextField();
		baseText.setPrefColumnCount(5);

		HBox baseBox = new HBox(5, new Label("Base:"), baseText);
		baseBox.setAlignment(Pos.CENTER);
		
		alturaText = new TextField();
		alturaText.setPrefColumnCount(5);
		HBox alturaBox = new HBox(5, new Label("Altura:"), alturaText);
		alturaBox.setAlignment(Pos.CENTER);

		areaLabel = new Label();
		HBox areaBox = new HBox(5, new Label("Área:"), areaLabel);
		areaBox.setAlignment(Pos.CENTER);

		perimetroLabel = new Label();
		HBox perimetroBox = new HBox(5, new Label("Perímetro:"), perimetroLabel);
		perimetroBox.setAlignment(Pos.CENTER);

		trianguloShape = new Triangle();
		trianguloShape.setFill(Color.GREEN);
		trianguloShape.setStroke(Color.DARKBLUE);
		trianguloShape.setStrokeWidth(2);

		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(baseBox, alturaBox, trianguloShape, areaBox, perimetroBox);
		this.setPadding(new Insets(5));

		// bindings

		baseText.textProperty().bindBidirectional(trianguloModel.baseProperty(), new NumberStringConverter());
		alturaText.textProperty().bindBidirectional(trianguloModel.alturaProperty(), new NumberStringConverter());

		areaLabel.textProperty().bind(trianguloModel.areaProperty().asString());
		perimetroLabel.textProperty().bind(trianguloModel.perimetroProperty().asString());

		trianguloShape.baseProperty().bind(trianguloModel.baseProperty());
		trianguloShape.heightProperty().bind(trianguloModel.alturaProperty());

	}
	

}
