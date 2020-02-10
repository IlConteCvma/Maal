package logic.view.graphic.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import logic.view.AlertControl;
import logic.view.NamePage;


public class NavbarGraphicController extends GraphicController {
	
	private HomeMenuGraphicController controlHome = new HomeMenuGraphicController();
	
	@FXML
	public void homeButton(ActionEvent e) throws IOException {
		controlHome.homeButton(e);
	}
	
	public void calendarButton(ActionEvent e) {
		AlertControl.infoBox("Operation not available", "WARNING");
	}
	
	public void forumButton(ActionEvent e) throws IOException {
		goToPage(NamePage.QUESTIONTYPE);
	}
	
	public void profileButton(ActionEvent e) {
		AlertControl.infoBox("Operation not available", "WARNING");
	}
	public void logOutButton(ActionEvent e) throws IOException {
		goToPage(NamePage.LOGIN);
	}
			
}