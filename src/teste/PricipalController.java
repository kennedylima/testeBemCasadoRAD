package teste;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class PricipalController {

    @FXML
    private MenuItem usuario;

    @FXML
    public void cadastrarUsuario(ActionEvent event) throws Exception {
        System.out.println("Cadastrando");
        usuario.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setTitle("Cadastro de Usuário");
                    stage.setMaximized(false);
                    stage.setScene(scene);
                    stage.show();
                    //fechando a tela de login
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        );
    }

}
