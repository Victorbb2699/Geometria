package dad.javafx.geometria.circulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class CirculoModel {
	private DoubleProperty radio = new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();

	public CirculoModel(Double radio) {
		this.radio = new SimpleDoubleProperty(this, "radio", radio);

		this.area = new ReadOnlyDoubleWrapper(this, "area");
		this.area.bind((this.radio.multiply(this.radio)).multiply(Math.PI));

		this.perimetro = new ReadOnlyDoubleWrapper(this, "perimetro");
		this.perimetro.bind((this.radio.multiply(Math.PI)).multiply(2));
	}

	public CirculoModel() {
		this(0.0);
	}

	public final DoubleProperty radioProperty() {
		return this.radio;
	}

	public final double getRadio() {
		return this.radioProperty().get();
	}

	public final void setRadio(final double radio) {
		this.radioProperty().set(radio);
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}

	public final double getArea() {
		return this.areaProperty().get();
	}

}
