package banco.de.dados.cca.nsf;

import static banco.de.dados.cca.nsf.BancoDeDadosCCANSF.primarystage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

public class Controlador_CadastrarResp implements Initializable {
    
    
    private double xOffset = 0;
    private double yOffset = 0;
        
    @FXML
    public void PressMouse(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    @FXML
    public void DragMouse(MouseEvent event) {
        primarystage.setX(event.getScreenX() - xOffset);
        primarystage.setY(event.getScreenY() - yOffset);
    }
           
    @FXML
    public void MinimizeButton(ActionEvent event) {
        primarystage.setIconified(true);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ComboBoxes();
    }    
    
    @FXML
    public void CloseButton(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    public void HomeButton(ActionEvent event) {
            Task task = Tasks.homeTask();
            new Thread(task).start();
            Tasks.homeTask();    
        
    }
    
    @FXML
    public void DeslogarButton(ActionEvent event) {
            Task task = Tasks.loginTask();
            new Thread(task).start();
            Tasks.homeTask();      
    }
    
    @FXML ComboBox arquivomorto;
    
    public void ComboBoxes() {
        
    arquivomorto.getItems().addAll(
    "Sim",
    "Não"
);
 
    }
    
    @FXML
    public void CadRespButton(ActionEvent event) {

            Task task = Tasks.cadastrorespTask();
            new Thread(task).start();
            Tasks.homeTask();    
        
    }
    
    @FXML
    private void mover(MouseEvent event) {
        
    } 
    
}
