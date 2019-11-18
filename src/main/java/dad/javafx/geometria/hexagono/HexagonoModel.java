package dad.javafx.geometria.hexagono;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonoModel {
	private DoubleProperty apotema;

	private ReadOnlyDoubleWrapper area;
	private ReadOnlyDoubleWrapper perimetro;

	public HexagonoModel(Double apotema) {
		this.apotema = new SimpleDoubleProperty(apotema);

		this.area = new ReadOnlyDoubleWrapper(this, "area");
		this.area.bind(((this.apotema.multiply(6).divide(2)).multiply(this.apotema)).divide(2));

		this.perimetro = new ReadOnlyDoubleWrapper(this, "perimetro");
		this.perimetro.bind(this.apotema.multiply(6));

	}

	public HexagonoModel() {
		this(0.0);
	}

	public final DoubleProperty apotemaProperty() {
		return this.apotema;
	}

	public final double getApotema() {
		return this.apotemaProperty().get();
	}

	public final void setApotema(final double apotema) {
		this.apotemaProperty().set(apotema);
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
