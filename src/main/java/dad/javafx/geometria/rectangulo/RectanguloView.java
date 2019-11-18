package dad.javafx.geometria.rectangulo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends HBox {

	private TextField anchoText;
	private TextField altoText;
	private Label areaLabel;
	private Rectangle rectanguloShape;
	private Label perimetroLabel;

	public RectanguloView() {
		super();

		anchoText = new TextField();
		anchoText.setPrefColumnCount(5);

		HBox anchoBox = new HBox(5, new Label("Ancho:"), anchoText);
		anchoBox.setAlignment(Pos.BASELINE_CENTER);

		altoText = new TextField();
		altoText.setPrefColumnCount(5);

		HBox altoBox = new HBox(5, new Label("Alto:"), altoText);
		altoBox.setAlignment(Pos.BASELINE_CENTER);

		areaLabel = new Label("Área: XXX píxeles cuadrados");
		HBox areaBox = new HBox(5, new Label("Área:"), areaLabel);
		areaBox.setAlignment(Pos.BASELINE_CENTER);

		perimetroLabel = new Label();
		HBox perimetroBox = new HBox(5, new Label("Perímetro:"), perimetroLabel);
		perimetroBox.setAlignment(Pos.BASELINE_CENTER);

		rectanguloShape = new Rectangle(100, 50);
		rectanguloShape.setFill(Color.AQUAMARINE);
		rectanguloShape.setStroke(Color.DARKBLUE);
		rectanguloShape.setStrokeWidth(2);

		this.setSpacing(5);
		this.setAlignment(Pos.TOP_CENTER);
		this.getChildren().addAll(anchoBox, altoBox, areaBox, perimetroBox, rectanguloShape);
		this.setPadding(new Insets(5));

	}

	public TextField getAnchoText() {
		return anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Rectangle getRectanguloShape() {
		return rectanguloShape;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}

	public void setArea(Label area) {
		this.areaLabel = area;
	}

}
