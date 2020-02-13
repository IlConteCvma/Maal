package logic.view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertControl {
	
	private AlertControl() {
		 throw new IllegalStateException("Utility class");
	 }

 	public static void infoBox(String infoMessage, String titleBar)
    {
        infoBox(infoMessage, titleBar, null);
    }


    public static void infoBox(String infoMessage, String titleBar, String headerMessage)
    {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }
	
}
