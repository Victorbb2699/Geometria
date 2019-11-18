package dad.javafx.geometria;


import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.hexagono.HexagonoController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.triangulo.TrianguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class GeometriaApp extends Application {

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TabPane tab = new TabPane();
		tab.getTabs().add(new Tab("Rectangulo", new RectanguloController().getRoot()));
		tab.getTabs().add(new Tab("Circulo", new CirculoController().getRoot()));
		tab.getTabs().add(new Tab("Triangulo", new TrianguloController()));
		tab.getTabs().add(new Tab("Hexagono", new HexagonoController()));
		
		
		Scene scene = new Scene(tab, 640, 480);
		
		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
