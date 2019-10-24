package dad.javafx.geometria.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {

	private RectanguloModel model = new RectanguloModel(20.0, 20.0);
	private RectanguloView view = new RectanguloView();

	public RectanguloController() {

//		anchoText.textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
//		altoText.textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
//		areaLabel.textProperty().bind(model.areaProperty().asString());
//		rectanguloShape.widthProperty().bind(model.baseProperty());
//		rectanguloShape.heightProperty().bind(model.alturaProperty());
	}

	public RectanguloView getRoot() {
		return view;
	}

}
