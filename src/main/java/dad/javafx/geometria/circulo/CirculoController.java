package dad.javafx.geometria.circulo;

import javafx.util.converter.NumberStringConverter;

public class CirculoController {

	private CirculoModel model = new CirculoModel(20.0);
	private CirculoView view = new CirculoView();

	public CirculoController() {
		view.getRadioText().textProperty().bindBidirectional(model.radioProperty(), new NumberStringConverter());
		view.getCirculoShape().radiusProperty().bind(model.radioProperty());
		
		view.getAreaLabel().textProperty().bind(model.areaProperty().asString());
		view.getPerimetroLabel().textProperty().bind(model.perimetroProperty().asString());
		
	}

	public CirculoView getRoot() {
		return view;
	}

}
