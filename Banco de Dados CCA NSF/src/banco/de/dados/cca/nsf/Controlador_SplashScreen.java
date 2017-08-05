package banco.de.dados.cca.nsf;

import static banco.de.dados.cca.nsf.BancoDeDadosCCANSF.primarystage;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;

public class Controlador_SplashScreen implements Initializable {
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
    public void CloseButton(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    public void AvanteButton(ActionEvent event) {
        Task task = Tasks.loginTask();
        new Thread(task).start();
        Tasks.homeTask();
    }
    
    @FXML ProgressBar pgb_progresso;
    public void progresso() throws InterruptedException {
        double a = 0;
        double b = 1;
        
        while (a < b){
            a = a + 0.1;
            pgb_progresso.setProgress(a);
            Thread.sleep(500);
        }
        
    }

    @Override
        public void initialize(URL url, ResourceBundle rb) {
            try {
                progresso();
            } catch (InterruptedException ex) {
                Logger.getLogger(Controlador_SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    
    @FXML
        private void mover(MouseEvent event) {   
    } 
    
}


