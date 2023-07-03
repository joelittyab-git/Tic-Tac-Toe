package TicTacToe.Model.Engine;

import TicTacToe.Model.Obj.Val;
import TicTacToe.Packages.Interfaces.VirtualBoard;

public class EngineGameBoard implements VirtualBoard {
    public Val [][] vBoard = new Val[3][3];

    public EngineGameBoard(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                vBoard[i][j] = new Val("");
                //vBoard[i][j].setValue(' ');
            }
        }
    }

    @Override
    public void printBoard(){
        for(Val x[] : vBoard){
            for(Val j : x){
                System.out.print(j.value + "|");
            }
            System.out.println();
        }
    }

    @Override
    public void setvBoardVal(int row, int column, int n){
        if(!boxAlreadyPlayed(row,column)){
            if(n%2==0){
                vBoard[row][column].value = 'X';
            }else{
                vBoard[row][column].value = 'O';
            }
        }
        printBoard();
    }

    /*
        -X- 1
        -Y- 2
        -else- 0
     */
    public int returnGameWinner(int n){
        //declaration
        StringBuilder a;

        //_init
        a = new StringBuilder("");

        //Each column
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                a.append(vBoard[i][j].value);
            }
            if(seriesCheck(a.charAt(0), a.charAt(1),a.charAt(2))){
                if(n%2==0)return 1;
                else return 2;
            }
            a.delete(0,a.length());
        }

        //row
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                a.append(vBoard[j][i].value);
            }
            if(seriesCheck(a.charAt(0), a.charAt(1),a.charAt(2))){
                if(n%2==0)return 1;
                else return 2;
            }
            a.delete(0,a.length());
        }

        //Diagonal1

            for(int i = 0; i<3; i++){
                a.append(vBoard[i][i].value);
            }
            if(seriesCheck(a.charAt(0),a.charAt(1),a.charAt(2))){
                if(n%2==0)return 1;
                else return 2;
            }
            a.delete(0, a.length());


        //Diagonal2

            a.append(vBoard[0][2].value);
            a.append(vBoard[1][1].value);
            a.append(vBoard[2][0].value);

            if(seriesCheck(a.charAt(0),a.charAt(1),a.charAt(2))){
                if(n%2==0)return 1;
                else return 2;
            }
            a.delete(0,a.length());


        return 0;
    }

    private boolean seriesCheck(char a, char b, char c){
        return (a==b && b==c) && (a=='X' || a=='O');
    }

    @Override
    public boolean boxAlreadyPlayed(int row, int column){
        return (vBoard[row][column].value =='O' || vBoard[row][column].value =='X');

    }
}
