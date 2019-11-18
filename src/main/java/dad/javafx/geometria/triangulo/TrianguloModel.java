package dad.javafx.geometria.triangulo;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class TrianguloModel {
	private DoubleProperty base;
	private DoubleProperty altura;
	private ReadOnlyDoubleWrapper area;
	private ReadOnlyDoubleWrapper perimetro;

	public TrianguloModel(Double base, Double altura) {
		this.base = new SimpleDoubleProperty(this, "base", base);
		this.altura = new SimpleDoubleProperty(this, "altura", altura);
		this.area = new ReadOnlyDoubleWrapper(this, "area");
		this.area.bind(this.base.multiply(this.altura).divide(2));

		// como nuestro triangulo es equilatero
		this.perimetro = new ReadOnlyDoubleWrapper(this, "perimetro");
		this.perimetro.bind(this.base.multiply(3));

	}

	public TrianguloModel() {
		this(0.0, 0.0);
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}

	public final double getBase() {
		return this.baseProperty().get();
	}

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}

	public final DoubleProperty alturaProperty() {
		return this.altura;
	}

	public final double getAltura() {
		return this.alturaProperty().get();
	}

	public final void setAltura(final double altura) {
		this.alturaProperty().set(altura);
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}

	public final double getArea() {
		return this.areaProperty().get();
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}

}