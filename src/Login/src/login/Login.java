
package login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {
  Cuentas cuenta = new Cuentas();
    public static void main(String[] args) {
        launch(args);  
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bienvenido");//titulo de ventana
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Hotel California");//titulo de pantalla
        scenetitle.setId("welcome-aaa"); //tamaño de texto
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("Usuario:");
        grid.add(userName, 0, 1);

        final TextField usuario = new TextField();
        grid.add(usuario, 1, 1);

        Label pw = new Label("Contraseña:");
        grid.add(pw, 0, 2);

        final PasswordField contrasena = new PasswordField();
        grid.add(contrasena, 1, 2);

        Button btn = new Button("Entrar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        actiontarget.setId("actiontarget");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {//evento del boton
                
                if(usuario.getText().equals("admin")&& contrasena.getText().equals("admin")){
                //ejecuta el main
                }  
                else{
                     actiontarget.setText("usuario o contraseña invalidos");
                }
            }
        });


        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Login.class.getResource("Login.css").toExternalForm());
        primaryStage.show();
         controlador();
    }
    
    private void controlador(){
       Controlador controlador  = new Controlador(cuenta,this); 
    }
}