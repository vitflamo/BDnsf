package banco.de.dados.cca.nsf;

import java.io.IOException;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import static banco.de.dados.cca.nsf.BancoDeDadosCCANSF.primarystage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.StageStyle;

public class Tasks {

public static Scene scene;    
    
public static Task<Void> loginTask() {
        return new Task<Void>() {
            @Override
            public Void call() {
                for (double i = 0; i < 3; i = i + 0.1) {
                    if (isCancelled()) {
                        break;
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        return null;
                    }
                }
                Platform.runLater(() -> {
                    Parent root = null;
                    try {
                        root = (Parent) FXMLLoader.load(getClass().getResource("Tela_Login.fxml"));
                    } catch (IOException ex) {
                        
                    }
                    if (scene == null) {
                        scene = new Scene(root);
                        primarystage.setScene(scene);
                        
                    } else {
                        primarystage.getScene().setRoot(root);
                    }
                    primarystage.setWidth(400);
                    primarystage.setHeight(300);
                    primarystage.show();
                });
                return null;
            }
        };
    }
    
    //Pagina Inicial
    public static Task<Void> homeTask() {
        return new Task<Void>() {
            @Override
            public Void call() {
                for (double i = 0; i < 3; i = i + 0.1) {
                    if (isCancelled()) {
                        break;
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        return null;
                    }
                }
                Platform.runLater(() -> {
                    Parent root = null;
                    try {
                        root = (Parent) FXMLLoader.load(getClass().getResource("Tela_Home.fxml"));
                        
                    } catch (IOException ex) {
                        
                    }
                    if (scene == null) {
                        
                        scene = new Scene(root);
                        primarystage.setScene(scene);
                    } else {
                        primarystage.getScene().setRoot(root);
                    }
                    primarystage.setWidth(1000);
                    primarystage.setHeight(750);
                    primarystage.show();
                });
                return null;
            }
        };
    }
    
    //Cadastro
    public static Task<Void> cadastrorespTask() {
        return new Task<Void>() {
            @Override
            public Void call() {
                for (double i = 0; i < 3; i = i + 0.1) {
                    if (isCancelled()) {
                        break;
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        return null;
                    }
                }
                Platform.runLater(() -> {
                    Parent root = null;
                    try {
                        root = (Parent) FXMLLoader.load(getClass().getResource("Tela_CadastrarResp.fxml"));
                    } catch (IOException ex) {
                        
                    }
                    if (scene == null) {
                        scene = new Scene(root);
                        primarystage.setScene(scene);
                    } else {
                        primarystage.getScene().setRoot(root);
                    }
                    
                    primarystage.show();
                });
                return null;
            }
        };
    }
    
    
}
