/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Kennedy
 */
public class Teste extends Application {
    Stage f;
    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("Bem-Vindo");
        Parent root= FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        stage.show();
        f = stage;
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
    void fechaTela() {
       f.hide();
    }
    
}
