package dad.javafx.geometria;


import dad.javafx.geometria.circulo.CirculoController;
import dad.javafx.geometria.rectangulo.RectanguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class GeometriaApp extends Application {

	private RectanguloController controller;
	private CirculoController controllerC;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller  = new RectanguloController();
		
		
		//Todo resto de controladores
		
		TabPane tab = new TabPane();
		tab.getTabs().add(new Tab("Rectangulo", controller.getRoot()));
		//tab.getTabs().add(new Tab("Circulo", controllerC.getRoot()));
		tab.getTabs().add(new Tab("Triangulo"));
		tab.getTabs().add(new Tab("Hexagono"));
		
		
		Scene scene = new Scene(tab, 640, 480);
		
		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
