package banco.de.dados.cca.nsf;

import static banco.de.dados.cca.nsf.BancoDeDadosCCANSF.primarystage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controlador_Login implements Initializable {
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
    
    @FXML Button btn_logar;
    @FXML Label lbl_erro;
    @FXML TextField txt_user;
    @FXML TextField txt_senha;
    
    @FXML
    public void MinimizeButton(ActionEvent event) {
        primarystage.setIconified(true);
    }
  
    @FXML
    public void CloseButton(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    public void LoginButton(ActionEvent event) {
        String user, senha;
        
        user = txt_user.getText();
        senha = txt_senha.getText();
        
        if(user.equals("adm") && senha.equals("123")){
            Task task = Tasks.homeTask();
            new Thread(task).start();
            Tasks.homeTask();
        }else{
            lbl_erro.setVisible(true);
        }
        
    }

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    @FXML
    private void mover(MouseEvent event) {
        
    } 
    
}
