package dad.javafx.geometria.rectangulo;

import javafx.util.converter.NumberStringConverter;

public class RectanguloController {

	private RectanguloModel model = new RectanguloModel(20.0, 20.0);
	private RectanguloView view = new RectanguloView();

	public RectanguloController() {

		view.getAnchoText().textProperty().bindBidirectional(model.baseProperty(), new NumberStringConverter());
		view.getAltoText().textProperty().bindBidirectional(model.alturaProperty(), new NumberStringConverter());
		view.getAreaLabel().textProperty().bind(model.areaProperty().asString());
		view.getPerimetroLabel().textProperty().bind(model.perimetroProperty().asString());
		
		
		view.getRectanguloShape().widthProperty().bind(model.baseProperty());
		view.getRectanguloShape().heightProperty().bind(model.alturaProperty());

	}

	public RectanguloView getRoot() {
		return view;
	}

}
