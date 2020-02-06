package logic.view.graphic.elements;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class SimpleGraphicElement implements GraphicElementInterface {
	
	private String myElement;
	
	public SimpleGraphicElement(String element) {
		this.myElement = element;
	}
	
	@Override
	public AnchorPane draw() throws IOException {
		AnchorPane root = FXMLLoader.<AnchorPane>load(getClass().getResource(myElement));
		return root;
	}

}
