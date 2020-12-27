package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import static java.lang.Integer.parseInt;
import static sample.BackTracking.nrOp;
import static sample.Check.valid_board;

public class GameController {

    @FXML
    private GridPane gridPane;

    @FXML
    private TextField cell00;

    @FXML
    private TextField cell01;

    @FXML
    private TextField cell02;

    @FXML
    private TextField cell03;

    @FXML
    private TextField cell04;

    @FXML
    private TextField cell05;

    @FXML
    private TextField cell06;

    @FXML
    private TextField cell07;

    @FXML
    private TextField cell08;

    @FXML
    private TextField cell10;

    @FXML
    private TextField cell11;

    @FXML
    private TextField cell12;

    @FXML
    private TextField cell13;

    @FXML
    private TextField cell14;

    @FXML
    private TextField cell15;

    @FXML
    private TextField cell16;

    @FXML
    private TextField cell17;

    @FXML
    private TextField cell18;

    @FXML
    private TextField cell20;

    @FXML
    private TextField cell21;

    @FXML
    private TextField cell22;

    @FXML
    private TextField cell23;

    @FXML
    private TextField cell24;

    @FXML
    private TextField cell25;

    @FXML
    private TextField cell26;

    @FXML
    private TextField cell27;

    @FXML
    private TextField cell28;

    @FXML
    private TextField cell30;

    @FXML
    private TextField cell31;

    @FXML
    private TextField cell32;

    @FXML
    private TextField cell33;

    @FXML
    private TextField cell34;

    @FXML
    private TextField cell35;

    @FXML
    private TextField cell36;

    @FXML
    private TextField cell37;

    @FXML
    private TextField cell38;

    @FXML
    private TextField cell40;

    @FXML
    private TextField cell41;

    @FXML
    private TextField cell42;

    @FXML
    private TextField cell43;

    @FXML
    private TextField cell44;

    @FXML
    private TextField cell45;

    @FXML
    private TextField cell46;

    @FXML
    private TextField cell47;

    @FXML
    private TextField cell48;

    @FXML
    private TextField cell50;

    @FXML
    private TextField cell51;

    @FXML
    private TextField cell52;

    @FXML
    private TextField cell53;

    @FXML
    private TextField cell54;

    @FXML
    private TextField cell55;

    @FXML
    private TextField cell56;

    @FXML
    private TextField cell57;

    @FXML
    private TextField cell58;

    @FXML
    private TextField cell60;

    @FXML
    private TextField cell61;

    @FXML
    private TextField cell62;

    @FXML
    private TextField cell63;

    @FXML
    private TextField cell64;

    @FXML
    private TextField cell65;

    @FXML
    private TextField cell66;

    @FXML
    private TextField cell67;

    @FXML
    private TextField cell68;

    @FXML
    private TextField cell70;

    @FXML
    private TextField cell71;

    @FXML
    private TextField cell72;

    @FXML
    private TextField cell73;

    @FXML
    private TextField cell74;

    @FXML
    private TextField cell75;

    @FXML
    private TextField cell76;

    @FXML
    private TextField cell77;

    @FXML
    private TextField cell78;

    @FXML
    private TextField cell80;

    @FXML
    private TextField cell81;

    @FXML
    private TextField cell82;

    @FXML
    private TextField cell83;

    @FXML
    private TextField cell84;

    @FXML
    private TextField cell85;

    @FXML
    private TextField cell86;

    @FXML
    private TextField cell87;

    @FXML
    private TextField cell88;

    @FXML
    private Button altGridButton;

    @FXML
    private Button selfSolveButton;

    @FXML
    private Button checkButton;

    @FXML
    void initialize() {
        int n = 9;
        int[][] board = new int[n][n];
        BackTracking bk = new BackTracking();
        bk.generateGrid(board , n);
        bk.print(board , n);
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = Integer.parseInt(" ");
                }
            }
        }*/
        if (board[0][0] != 0) {
            cell00.setText(String.valueOf(board[0][0]));
        }
        if (board[0][1] != 0) {
            cell01.setText(String.valueOf(board[0][1]));
        }
        if (board[0][2] != 0) {
            cell02.setText(String.valueOf(board[0][2]));
        }
        if (board[0][3] != 0) {
            cell03.setText(String.valueOf(board[0][3]));
        }
        if (board[0][4] != 0) {
            cell04.setText(String.valueOf(board[0][4]));
        }
        if (board[0][5] != 0) {
            cell05.setText(String.valueOf(board[0][5]));
        }
        if (board[0][6] != 0) {
            cell06.setText(String.valueOf(board[0][6]));
        }
        if (board[0][7] != 0) {
            cell07.setText(String.valueOf(board[0][7]));
        }
        if (board[0][8] != 0) {
            cell08.setText(String.valueOf(board[0][8]));
        }
        if (board[1][0] != 0) {
            cell10.setText(String.valueOf(board[1][0]));
        }
        if (board[1][1] != 0) {
            cell11.setText(String.valueOf(board[1][1]));
        }
        if (board[1][2] != 0) {
            cell12.setText(String.valueOf(board[1][2]));
        }
        if (board[1][3] != 0) {
            cell13.setText(String.valueOf(board[1][3]));
        }
        if (board[1][4] != 0) {
            cell14.setText(String.valueOf(board[1][4]));
        }
        if (board[1][5] != 0) {
            cell15.setText(String.valueOf(board[1][5]));
        }
        if (board[1][6] != 0) {
            cell16.setText(String.valueOf(board[1][6]));
        }
        if (board[1][7] != 0) {
            cell17.setText(String.valueOf(board[1][7]));
        }
        if (board[1][8] != 0) {
            cell18.setText(String.valueOf(board[1][8]));
        }
        if (board[2][0] != 0) {
            cell20.setText(String.valueOf(board[2][0]));
        }
        if (board[2][1] != 0) {
            cell21.setText(String.valueOf(board[2][1]));
        }
        if (board[2][2] != 0) {
            cell22.setText(String.valueOf(board[2][2]));
        }
        if (board[2][3] != 0) {
            cell23.setText(String.valueOf(board[2][3]));
        }
        if (board[2][4] != 0) {
            cell24.setText(String.valueOf(board[2][4]));
        }
        if (board[2][5] != 0) {
            cell25.setText(String.valueOf(board[2][5]));
        }
        if (board[2][6] != 0) {
            cell26.setText(String.valueOf(board[2][6]));
        }
        if (board[2][7] != 0) {
            cell27.setText(String.valueOf(board[2][7]));
        }
        if (board[2][8] != 0) {
            cell28.setText(String.valueOf(board[2][8]));
        }
        if (board[3][0] != 0) {
            cell30.setText(String.valueOf(board[3][0]));
        }
        if (board[3][1] != 0) {
            cell31.setText(String.valueOf(board[3][1]));
        }
        if (board[3][2] != 0) {
            cell32.setText(String.valueOf(board[3][2]));
        }
        if (board[3][3] != 0) {
            cell33.setText(String.valueOf(board[3][3]));
        }
        if (board[3][4] != 0) {
            cell34.setText(String.valueOf(board[3][4]));
        }
        if (board[3][5] != 0) {
            cell35.setText(String.valueOf(board[3][5]));
        }
        if (board[3][6] != 0) {
            cell36.setText(String.valueOf(board[3][6]));
        }
        if (board[3][7] != 0) {
            cell37.setText(String.valueOf(board[3][7]));
        }
        if (board[3][8] != 0) {
            cell38.setText(String.valueOf(board[3][8]));
        }
        if (board[4][0] != 0) {
            cell40.setText(String.valueOf(board[4][0]));
        }
        if (board[4][1] != 0) {
            cell41.setText(String.valueOf(board[4][1]));
        }
        if (board[4][2] != 0) {
            cell42.setText(String.valueOf(board[4][2]));
        }
        if (board[4][3] != 0) {
            cell43.setText(String.valueOf(board[4][3]));
        }
        if (board[4][4] != 0) {
            cell44.setText(String.valueOf(board[4][4]));
        }
        if (board[4][5] != 0) {
            cell45.setText(String.valueOf(board[4][5]));
        }
        if (board[4][6] != 0) {
            cell46.setText(String.valueOf(board[4][6]));
        }
        if (board[4][7] != 0) {
            cell47.setText(String.valueOf(board[4][7]));
        }
        if (board[4][8] != 0) {
            cell48.setText(String.valueOf(board[4][8]));
        }
        if (board[5][0] != 0) {
            cell50.setText(String.valueOf(board[5][0]));
        }
        if (board[5][1] != 0) {
            cell51.setText(String.valueOf(board[5][1]));
        }
        if (board[5][2] != 0) {
            cell52.setText(String.valueOf(board[5][2]));
        }
        if (board[5][3] != 0) {
            cell53.setText(String.valueOf(board[5][3]));
        }
        if (board[5][4] != 0) {
            cell54.setText(String.valueOf(board[5][4]));
        }
        if (board[5][5] != 0) {
            cell55.setText(String.valueOf(board[5][5]));
        }
        if (board[5][6] != 0) {
            cell56.setText(String.valueOf(board[5][6]));
        }
        if (board[5][7] != 0) {
            cell57.setText(String.valueOf(board[5][7]));
        }
        if (board[5][8] != 0) {
            cell58.setText(String.valueOf(board[5][8]));
        }
        if (board[6][0] != 0) {
            cell60.setText(String.valueOf(board[6][0]));
        }
        if (board[6][1] != 0) {
            cell61.setText(String.valueOf(board[6][1]));
        }
        if (board[6][2] != 0) {
            cell62.setText(String.valueOf(board[6][2]));
        }
        if (board[6][3] != 0) {
            cell63.setText(String.valueOf(board[6][3]));
        }
        if (board[6][4] != 0) {
            cell64.setText(String.valueOf(board[6][4]));
        }
        if (board[6][5] != 0) {
            cell65.setText(String.valueOf(board[6][5]));
        }
        if (board[6][6] != 0) {
            cell66.setText(String.valueOf(board[6][6]));
        }
        if (board[6][7] != 0) {
            cell67.setText(String.valueOf(board[6][7]));
        }
        if (board[6][8] != 0) {
            cell68.setText(String.valueOf(board[6][8]));
        }
        if (board[7][0] != 0) {
            cell70.setText(String.valueOf(board[7][0]));
        }
        if (board[7][1] != 0) {
            cell71.setText(String.valueOf(board[7][1]));
        }
        if (board[7][2] != 0) {
            cell72.setText(String.valueOf(board[7][2]));
        }
        if (board[7][3] != 0) {
            cell73.setText(String.valueOf(board[7][3]));
        }
        if (board[7][4] != 0) {
            cell74.setText(String.valueOf(board[7][4]));
        }
        if (board[7][5] != 0) {
            cell75.setText(String.valueOf(board[7][5]));
        }
        if (board[7][6] != 0) {
            cell76.setText(String.valueOf(board[7][6]));
        }
        if (board[7][7] != 0) {
            cell77.setText(String.valueOf(board[7][7]));
        }
        if (board[7][8] != 0) {
            cell78.setText(String.valueOf(board[7][8]));
        }
        if (board[8][0] != 0) {
            cell80.setText(String.valueOf(board[8][0]));
        }
        if (board[8][1] != 0) {
            cell81.setText(String.valueOf(board[8][1]));
        }
        if (board[8][2] != 0) {
            cell82.setText(String.valueOf(board[8][2]));
        }
        if (board[8][3] != 0) {
            cell83.setText(String.valueOf(board[8][3]));
        }
        if (board[8][4] != 0) {
            cell84.setText(String.valueOf(board[8][4]));
        }
        if (board[8][5] != 0) {
            cell85.setText(String.valueOf(board[8][5]));
        }
        if (board[8][6] != 0) {
            cell86.setText(String.valueOf(board[8][6]));
        }
        if (board[8][7] != 0) {
            cell87.setText(String.valueOf(board[8][7]));
        }
        if (board[8][8] != 0) {
            cell88.setText(String.valueOf(board[8][8]));
        }
        cell00.setOnAction(event->{
            board[0][0]= parseInt(cell00.getText());
        });



        selfSolveButton.setOnAction(event -> {
            bk.solveSudoku(board,n);
                cell00.setText(String.valueOf(board[0][0]));

                cell01.setText(String.valueOf(board[0][1]));

                cell02.setText(String.valueOf(board[0][2]));

                cell03.setText(String.valueOf(board[0][3]));

                cell04.setText(String.valueOf(board[0][4]));

                cell05.setText(String.valueOf(board[0][5]));

                cell06.setText(String.valueOf(board[0][6]));

                cell07.setText(String.valueOf(board[0][7]));

                cell08.setText(String.valueOf(board[0][8]));

                cell10.setText(String.valueOf(board[1][0]));

                cell11.setText(String.valueOf(board[1][1]));

                cell12.setText(String.valueOf(board[1][2]));

                cell13.setText(String.valueOf(board[1][3]));

                cell14.setText(String.valueOf(board[1][4]));

                cell15.setText(String.valueOf(board[1][5]));

                cell16.setText(String.valueOf(board[1][6]));

                cell17.setText(String.valueOf(board[1][7]));

                cell18.setText(String.valueOf(board[1][8]));

                cell20.setText(String.valueOf(board[2][0]));

                cell21.setText(String.valueOf(board[2][1]));

                cell22.setText(String.valueOf(board[2][2]));

                cell23.setText(String.valueOf(board[2][3]));

                cell24.setText(String.valueOf(board[2][4]));

                cell25.setText(String.valueOf(board[2][5]));

                cell26.setText(String.valueOf(board[2][6]));

                cell27.setText(String.valueOf(board[2][7]));

                cell28.setText(String.valueOf(board[2][8]));

                cell30.setText(String.valueOf(board[3][0]));

                cell31.setText(String.valueOf(board[3][1]));

                cell32.setText(String.valueOf(board[3][2]));

                cell33.setText(String.valueOf(board[3][3]));

                cell34.setText(String.valueOf(board[3][4]));

                cell35.setText(String.valueOf(board[3][5]));

                cell36.setText(String.valueOf(board[3][6]));

                cell37.setText(String.valueOf(board[3][7]));

                cell38.setText(String.valueOf(board[3][8]));

                cell40.setText(String.valueOf(board[4][0]));

                cell41.setText(String.valueOf(board[4][1]));

                cell42.setText(String.valueOf(board[4][2]));

                cell43.setText(String.valueOf(board[4][3]));

                cell44.setText(String.valueOf(board[4][4]));

                cell45.setText(String.valueOf(board[4][5]));

                cell46.setText(String.valueOf(board[4][6]));

                cell47.setText(String.valueOf(board[4][7]));

                cell48.setText(String.valueOf(board[4][8]));

                cell50.setText(String.valueOf(board[5][0]));

                cell51.setText(String.valueOf(board[5][1]));

                cell52.setText(String.valueOf(board[5][2]));

                cell53.setText(String.valueOf(board[5][3]));

                cell54.setText(String.valueOf(board[5][4]));

                cell55.setText(String.valueOf(board[5][5]));

                cell56.setText(String.valueOf(board[5][6]));

                cell57.setText(String.valueOf(board[5][7]));

                cell58.setText(String.valueOf(board[5][8]));

                cell60.setText(String.valueOf(board[6][0]));

                cell61.setText(String.valueOf(board[6][1]));

                cell62.setText(String.valueOf(board[6][2]));

                cell63.setText(String.valueOf(board[6][3]));

                cell64.setText(String.valueOf(board[6][4]));

                cell65.setText(String.valueOf(board[6][5]));

                cell66.setText(String.valueOf(board[6][6]));

                cell67.setText(String.valueOf(board[6][7]));

                cell68.setText(String.valueOf(board[6][8]));

                cell70.setText(String.valueOf(board[7][0]));

                cell71.setText(String.valueOf(board[7][1]));

                cell72.setText(String.valueOf(board[7][2]));

                cell73.setText(String.valueOf(board[7][3]));

                cell74.setText(String.valueOf(board[7][4]));

                cell75.setText(String.valueOf(board[7][5]));

                cell76.setText(String.valueOf(board[7][6]));

                cell77.setText(String.valueOf(board[7][7]));

                cell78.setText(String.valueOf(board[7][8]));

                cell80.setText(String.valueOf(board[8][0]));

                cell81.setText(String.valueOf(board[8][1]));

                cell82.setText(String.valueOf(board[8][2]));

                cell83.setText(String.valueOf(board[8][3]));

                cell84.setText(String.valueOf(board[8][4]));

                cell85.setText(String.valueOf(board[8][5]));

                cell86.setText(String.valueOf(board[8][6]));

                cell87.setText(String.valueOf(board[8][7]));

                cell88.setText(String.valueOf(board[8][8]));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Results");
            alert.setHeaderText("Sudoku a fost rezolvat prin algoritmul Backtracking \nNumarul de operatii elementare : " + nrOp);
            alert.showAndWait();

        });

        altGridButton.setOnAction(event ->{
            bk.generateGrid(board,n);
            cell00.setText("");

            cell01.setText("");

            cell02.setText("");

            cell03.setText("");

            cell04.setText("");;

            cell05.setText("");

            cell06.setText("");

            cell07.setText("");

            cell08.setText("");

            cell10.setText("");

            cell11.setText("");

            cell12.setText("");

            cell13.setText("");

            cell14.setText("");

            cell15.setText("");

            cell16.setText("");

            cell17.setText("");
            cell18.setText("");

            cell20.setText("");

            cell21.setText("");

            cell22.setText("");
            cell23.setText("");

            cell24.setText("");

            cell25.setText("");

            cell26.setText("");

            cell27.setText("");

            cell28.setText("");
            cell30.setText("");
            cell31.setText("");

            cell32.setText("");

            cell33.setText("");
            cell34.setText("");

            cell35.setText("");
            cell36.setText("");

            cell37.setText("");
            cell38.setText("");
            cell40.setText("");
            cell41.setText("");

            cell42.setText("");

            cell43.setText("");

            cell44.setText("");

            cell45.setText("");

            cell46.setText("");

            cell47.setText("");

            cell48.setText("");

            cell50.setText("");

            cell51.setText("");

            cell52.setText("");

            cell53.setText("");

            cell54.setText("");

            cell55.setText("");

            cell56.setText("");

            cell57.setText("");

            cell58.setText("");

            cell60.setText("");

            cell61.setText("");

            cell62.setText("");

            cell63.setText("");

            cell64.setText("");

            cell65.setText("");

            cell66.setText("");

            cell67.setText("");

            cell68.setText("");

            cell70.setText("");

            cell71.setText("");

            cell72.setText("");

            cell73.setText("");

            cell74.setText("");

            cell75.setText("");

            cell76.setText("");

            cell77.setText("");

            cell78.setText("");

            cell80.setText("");

            cell81.setText("");

            cell82.setText("");

            cell83.setText("");

            cell84.setText("");

            cell85.setText("");

            cell86.setText("");

            cell87.setText("");

            cell88.setText("");

            if (board[0][0] != 0) {
                cell00.setText(String.valueOf(board[0][0]));
            }
            if (board[0][1] != 0) {
                cell01.setText(String.valueOf(board[0][1]));
            }
            if (board[0][2] != 0) {
                cell02.setText(String.valueOf(board[0][2]));
            }
            if (board[0][3] != 0) {
                cell03.setText(String.valueOf(board[0][3]));
            }
            if (board[0][4] != 0) {
                cell04.setText(String.valueOf(board[0][4]));
            }
            if (board[0][5] != 0) {
                cell05.setText(String.valueOf(board[0][5]));
            }
            if (board[0][6] != 0) {
                cell06.setText(String.valueOf(board[0][6]));
            }
            if (board[0][7] != 0) {
                cell07.setText(String.valueOf(board[0][7]));
            }
            if (board[0][8] != 0) {
                cell08.setText(String.valueOf(board[0][8]));
            }
            if (board[1][0] != 0) {
                cell10.setText(String.valueOf(board[1][0]));
            }
            if (board[1][1] != 0) {
                cell11.setText(String.valueOf(board[1][1]));
            }
            if (board[1][2] != 0) {
                cell12.setText(String.valueOf(board[1][2]));
            }
            if (board[1][3] != 0) {
                cell13.setText(String.valueOf(board[1][3]));
            }
            if (board[1][4] != 0) {
                cell14.setText(String.valueOf(board[1][4]));
            }
            if (board[1][5] != 0) {
                cell15.setText(String.valueOf(board[1][5]));
            }
            if (board[1][6] != 0) {
                cell16.setText(String.valueOf(board[1][6]));
            }
            if (board[1][7] != 0) {
                cell17.setText(String.valueOf(board[1][7]));
            }
            if (board[1][8] != 0) {
                cell18.setText(String.valueOf(board[1][8]));
            }
            if (board[2][0] != 0) {
                cell20.setText(String.valueOf(board[2][0]));
            }
            if (board[2][1] != 0) {
                cell21.setText(String.valueOf(board[2][1]));
            }
            if (board[2][2] != 0) {
                cell22.setText(String.valueOf(board[2][2]));
            }
            if (board[2][3] != 0) {
                cell23.setText(String.valueOf(board[2][3]));
            }
            if (board[2][4] != 0) {
                cell24.setText(String.valueOf(board[2][4]));
            }
            if (board[2][5] != 0) {
                cell25.setText(String.valueOf(board[2][5]));
            }
            if (board[2][6] != 0) {
                cell26.setText(String.valueOf(board[2][6]));
            }
            if (board[2][7] != 0) {
                cell27.setText(String.valueOf(board[2][7]));
            }
            if (board[2][8] != 0) {
                cell28.setText(String.valueOf(board[2][8]));
            }
            if (board[3][0] != 0) {
                cell30.setText(String.valueOf(board[3][0]));
            }
            if (board[3][1] != 0) {
                cell31.setText(String.valueOf(board[3][1]));
            }
            if (board[3][2] != 0) {
                cell32.setText(String.valueOf(board[3][2]));
            }
            if (board[3][3] != 0) {
                cell33.setText(String.valueOf(board[3][3]));
            }
            if (board[3][4] != 0) {
                cell34.setText(String.valueOf(board[3][4]));
            }
            if (board[3][5] != 0) {
                cell35.setText(String.valueOf(board[3][5]));
            }
            if (board[3][6] != 0) {
                cell36.setText(String.valueOf(board[3][6]));
            }
            if (board[3][7] != 0) {
                cell37.setText(String.valueOf(board[3][7]));
            }
            if (board[3][8] != 0) {
                cell38.setText(String.valueOf(board[3][8]));
            }
            if (board[4][0] != 0) {
                cell40.setText(String.valueOf(board[4][0]));
            }
            if (board[4][1] != 0) {
                cell41.setText(String.valueOf(board[4][1]));
            }
            if (board[4][2] != 0) {
                cell42.setText(String.valueOf(board[4][2]));
            }
            if (board[4][3] != 0) {
                cell43.setText(String.valueOf(board[4][3]));
            }
            if (board[4][4] != 0) {
                cell44.setText(String.valueOf(board[4][4]));
            }
            if (board[4][5] != 0) {
                cell45.setText(String.valueOf(board[4][5]));
            }
            if (board[4][6] != 0) {
                cell46.setText(String.valueOf(board[4][6]));
            }
            if (board[4][7] != 0) {
                cell47.setText(String.valueOf(board[4][7]));
            }
            if (board[4][8] != 0) {
                cell48.setText(String.valueOf(board[4][8]));
            }
            if (board[5][0] != 0) {
                cell50.setText(String.valueOf(board[5][0]));
            }
            if (board[5][1] != 0) {
                cell51.setText(String.valueOf(board[5][1]));
            }
            if (board[5][2] != 0) {
                cell52.setText(String.valueOf(board[5][2]));
            }
            if (board[5][3] != 0) {
                cell53.setText(String.valueOf(board[5][3]));
            }
            if (board[5][4] != 0) {
                cell54.setText(String.valueOf(board[5][4]));
            }
            if (board[5][5] != 0) {
                cell55.setText(String.valueOf(board[5][5]));
            }
            if (board[5][6] != 0) {
                cell56.setText(String.valueOf(board[5][6]));
            }
            if (board[5][7] != 0) {
                cell57.setText(String.valueOf(board[5][7]));
            }
            if (board[5][8] != 0) {
                cell58.setText(String.valueOf(board[5][8]));
            }
            if (board[6][0] != 0) {
                cell60.setText(String.valueOf(board[6][0]));
            }
            if (board[6][1] != 0) {
                cell61.setText(String.valueOf(board[6][1]));
            }
            if (board[6][2] != 0) {
                cell62.setText(String.valueOf(board[6][2]));
            }
            if (board[6][3] != 0) {
                cell63.setText(String.valueOf(board[6][3]));
            }
            if (board[6][4] != 0) {
                cell64.setText(String.valueOf(board[6][4]));
            }
            if (board[6][5] != 0) {
                cell65.setText(String.valueOf(board[6][5]));
            }
            if (board[6][6] != 0) {
                cell66.setText(String.valueOf(board[6][6]));
            }
            if (board[6][7] != 0) {
                cell67.setText(String.valueOf(board[6][7]));
            }
            if (board[6][8] != 0) {
                cell68.setText(String.valueOf(board[6][8]));
            }
            if (board[7][0] != 0) {
                cell70.setText(String.valueOf(board[7][0]));
            }
            if (board[7][1] != 0) {
                cell71.setText(String.valueOf(board[7][1]));
            }
            if (board[7][2] != 0) {
                cell72.setText(String.valueOf(board[7][2]));
            }
            if (board[7][3] != 0) {
                cell73.setText(String.valueOf(board[7][3]));
            }
            if (board[7][4] != 0) {
                cell74.setText(String.valueOf(board[7][4]));
            }
            if (board[7][5] != 0) {
                cell75.setText(String.valueOf(board[7][5]));
            }
            if (board[7][6] != 0) {
                cell76.setText(String.valueOf(board[7][6]));
            }
            if (board[7][7] != 0) {
                cell77.setText(String.valueOf(board[7][7]));
            }
            if (board[7][8] != 0) {
                cell78.setText(String.valueOf(board[7][8]));
            }
            if (board[8][0] != 0) {
                cell80.setText(String.valueOf(board[8][0]));
            }
            if (board[8][1] != 0) {
                cell81.setText(String.valueOf(board[8][1]));
            }
            if (board[8][2] != 0) {
                cell82.setText(String.valueOf(board[8][2]));
            }
            if (board[8][3] != 0) {
                cell83.setText(String.valueOf(board[8][3]));
            }
            if (board[8][4] != 0) {
                cell84.setText(String.valueOf(board[8][4]));
            }
            if (board[8][5] != 0) {
                cell85.setText(String.valueOf(board[8][5]));
            }
            if (board[8][6] != 0) {
                cell86.setText(String.valueOf(board[8][6]));
            }
            if (board[8][7] != 0) {
                cell87.setText(String.valueOf(board[8][7]));
            }
            if (board[8][8] != 0) {
                cell88.setText(String.valueOf(board[8][8]));
            }
        });
        int[][] board1 = new int[n][n];
        checkButton.setOnAction(event->{

            if (cell00.getText() == "") {
                board[0][0]=0;
            }
            else board1[0][0]= Integer.parseInt(cell00.getText());

            board1[0][1]= Integer.parseInt(cell01.getText());
            board1[0][2]= Integer.parseInt(cell02.getText());
            board1[0][3]= Integer.parseInt(cell03.getText());
            board1[0][4]= Integer.parseInt(cell04.getText());
            board1[0][5]= Integer.parseInt(cell05.getText());
            board1[0][6]= Integer.parseInt(cell06.getText());
            board1[0][7]= Integer.parseInt(cell07.getText());
            board1[0][8]= Integer.parseInt(cell08.getText());

            board1[1][0]= Integer.parseInt(cell10.getText());
            board1[1][1]= Integer.parseInt(cell11.getText());
            board1[1][2]= Integer.parseInt(cell12.getText());
            board1[1][3]= Integer.parseInt(cell13.getText());
            board1[1][4]= Integer.parseInt(cell14.getText());
            board1[1][5]= Integer.parseInt(cell15.getText());
            board1[1][6]= Integer.parseInt(cell16.getText());
            board1[1][7]= Integer.parseInt(cell17.getText());
            board1[1][8]= Integer.parseInt(cell18.getText());

            board1[2][0]= Integer.parseInt(cell20.getText());
            board1[2][1]= Integer.parseInt(cell21.getText());
            board1[2][2]= Integer.parseInt(cell22.getText());
            board1[2][3]= Integer.parseInt(cell23.getText());
            board1[2][4]= Integer.parseInt(cell24.getText());
            board1[2][5]= Integer.parseInt(cell25.getText());
            board1[2][6]= Integer.parseInt(cell26.getText());
            board1[2][7]= Integer.parseInt(cell27.getText());
            board1[2][8]= Integer.parseInt(cell28.getText());

            board1[3][0]= Integer.parseInt(cell30.getText());
            board1[3][1]= Integer.parseInt(cell31.getText());
            board1[3][2]= Integer.parseInt(cell32.getText());
            board1[3][3]= Integer.parseInt(cell33.getText());
            board1[3][4]= Integer.parseInt(cell34.getText());
            board1[3][5]= Integer.parseInt(cell35.getText());
            board1[3][6]= Integer.parseInt(cell36.getText());
            board1[3][7]= Integer.parseInt(cell37.getText());
            board1[3][8]= Integer.parseInt(cell38.getText());

            board1[4][0]= Integer.parseInt(cell40.getText());
            board1[4][1]= Integer.parseInt(cell41.getText());
            board1[4][2]= Integer.parseInt(cell42.getText());
            board1[4][3]= Integer.parseInt(cell43.getText());
            board1[4][4]= Integer.parseInt(cell44.getText());
            board1[4][5]= Integer.parseInt(cell45.getText());
            board1[4][6]= Integer.parseInt(cell46.getText());
            board1[4][7]= Integer.parseInt(cell47.getText());
            board1[4][8]= Integer.parseInt(cell48.getText());

            board1[5][0]= Integer.parseInt(cell50.getText());
            board1[5][1]= Integer.parseInt(cell51.getText());
            board1[5][2]= Integer.parseInt(cell52.getText());
            board1[5][3]= Integer.parseInt(cell53.getText());
            board1[5][4]= Integer.parseInt(cell54.getText());
            board1[5][5]= Integer.parseInt(cell55.getText());
            board1[5][6]= Integer.parseInt(cell56.getText());
            board1[5][7]= Integer.parseInt(cell57.getText());
            board1[5][8]= Integer.parseInt(cell58.getText());

            board1[6][0]= Integer.parseInt(cell60.getText());
            board1[6][1]= Integer.parseInt(cell61.getText());
            board1[6][2]= Integer.parseInt(cell62.getText());
            board1[6][3]= Integer.parseInt(cell63.getText());
            board1[6][4]= Integer.parseInt(cell64.getText());
            board1[6][5]= Integer.parseInt(cell65.getText());
            board1[6][6]= Integer.parseInt(cell66.getText());
            board1[6][7]= Integer.parseInt(cell67.getText());
            board1[6][8]= Integer.parseInt(cell68.getText());

            board1[7][0]= Integer.parseInt(cell70.getText());
            board1[7][1]= Integer.parseInt(cell71.getText());
            board1[7][2]= Integer.parseInt(cell72.getText());
            board1[7][3]= Integer.parseInt(cell73.getText());
            board1[7][4]= Integer.parseInt(cell74.getText());
            board1[7][5]= Integer.parseInt(cell75.getText());
            board1[7][6]= Integer.parseInt(cell76.getText());
            board1[7][7]= Integer.parseInt(cell77.getText());
            board1[7][8]= Integer.parseInt(cell78.getText());

            board1[8][0]= Integer.parseInt(cell80.getText());
            board1[8][1]= Integer.parseInt(cell81.getText());
            board1[8][2]= Integer.parseInt(cell82.getText());
            board1[8][3]= Integer.parseInt(cell83.getText());
            board1[8][4]= Integer.parseInt(cell84.getText());
            board1[8][5]= Integer.parseInt(cell85.getText());
            board1[8][6]= Integer.parseInt(cell86.getText());
            board1[8][7]= Integer.parseInt(cell87.getText());
            board1[8][8]= Integer.parseInt(cell88.getText());
            bk.print(board1,n);

            if (valid_board(board1)==true) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Congratulations!!!");
                alert.setHeaderText("The grid is solved correctly!");
                alert.showAndWait();
            }
            else if (valid_board(board1)==false ) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Mai încearcă");
                alert.setHeaderText("The grid is incorrect\nTry again");
                alert.showAndWait();
            }
            else try{
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Something went wrong");
                alert.setHeaderText("The grid is incomplete");
                alert.showAndWait();
            } catch (Exception e) {
                    e.printStackTrace();
                }


        });

    }
}
