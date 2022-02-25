
package layouts.gridpane2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class LayoutsGridPane2 extends Application {
    
    /*public void addPrefDimensionButton(Button btn, int width, int height){
        btn.setPrefWidth(width);
        btn.setPrefHeight(height);
    }
    
    public void addMaxfDimensionButton(Button btn){
        btn.setMaxWidth(Double.MAX_VALUE);
        btn.setPrefHeight(Double.MAX_VALUE);
    }*/
    
    @Override
    public void start(Stage primaryStage) {

        //Botones Numericos
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        
        //Botones Operacionales
        Button btnSuma = new Button("+");
        Button btnResta = new Button("-");
        Button btnMul = new Button("X");
        Button btnDivi = new Button("/");
        
        Button btnIgual = new Button("=");
        Button btnBorrar = new Button("C");
        
        
        //Texto
        TextField txtOperaciones = new TextField("");

        //Sub Contenedor
        GridPane gridPane = new GridPane();
        
        //Fila0                               Ubicacion, Dimensiones
                                              //C  F  C  F
        GridPane.setConstraints(txtOperaciones, 0, 0, 4, 1);
        
        //Fila 1
        GridPane.setConstraints(btn7, 0, 1);
        GridPane.setConstraints(btn8, 1, 1);
        GridPane.setConstraints(btn9, 2, 1);
        GridPane.setConstraints(btnSuma, 3, 1);
        
        //Fila 2
        GridPane.setConstraints(btn4, 0, 2);
        GridPane.setConstraints(btn5, 1, 2);
        GridPane.setConstraints(btn6, 2, 2);
        GridPane.setConstraints(btnResta, 3, 2);
        
        //Fila 3
        GridPane.setConstraints(btn1, 0, 3);
        GridPane.setConstraints(btn2, 1, 3);
        GridPane.setConstraints(btn3, 2, 3);
        GridPane.setConstraints(btnMul, 3, 3);
        
        //Fila 4
        GridPane.setConstraints(btnBorrar, 0, 4);
        GridPane.setConstraints(btn0, 1, 4);
        GridPane.setConstraints(btnIgual, 2, 4);
        GridPane.setConstraints(btnDivi, 3, 4);
        
        //Alineacion de los componentes
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        
        //Agrego los componentes al sub contenedor
        gridPane.getChildren().setAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnBorrar, btnDivi,
                btnIgual, btnMul, btnResta, btnSuma, txtOperaciones);
                
        StackPane.setMargin(gridPane, new Insets(20) );//Agrega un margen 
        
        StackPane root = new StackPane(gridPane);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
