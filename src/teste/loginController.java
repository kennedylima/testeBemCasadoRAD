package teste;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;

public class loginController implements Initializable {

    @FXML
    private Button acessar;

    @FXML
    private TextField txUsuario;

    @FXML
    private PasswordField password;

    @FXML
    public void acessar(ActionEvent event) throws Exception {

        if (txUsuario.getText().length() > 0) {
            System.out.println("usuario ok" + txUsuario.getText());
            if (password.getText().length() > 0) {
                System.out.println("senha ok" + password.getText());

                
                acessar.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        try {

                            Parent root = FXMLLoader.load(getClass().getResource("principal.fxml"));
                            Stage stage = new Stage();
                            Scene scene = new Scene(root);
                            stage.setTitle("Lari Maia Bem Casados");
                            stage.setMaximized(true);
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

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Incorreto");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuário Incorreto");
        }

    }

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}