package gui.main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("Menu Vendedor");
	}
	
	@FXML
	public void onMenuItemDepartamentoAction() {
		System.out.println("Menu Departamento");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("Menu Sobre");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

}
