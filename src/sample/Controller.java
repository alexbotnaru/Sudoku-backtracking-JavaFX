package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    static int n = 9;
    private static int[][] board = new int[n][n];
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button generateGame;

    public static int[][] getBoard() {
        return board;
    }

    public static void setBoard(int[][] board) {
        Controller.board = board;
    }

    @FXML
    void initialize() {
            generateGame.setOnAction(event ->{
                generateGame.getScene().getWindow().hide();

                FXMLLoader loader= new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/newGame.fxml/"));

                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();

                //BackTracking bk = new BackTracking();
                //bk.generateGrid(getBoard(), n);
                //bk.print(getBoard(), n);

            } );

        }

    }

