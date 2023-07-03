package TicTacToe.Test;

import TicTacToe.Model.Utilities;

public class validNameChecker_tester {
    public static void main(String[] args) {
        System.out.println( Utilities.checkIfNameValid("Joel"));
        System.out.println(Utilities.checkIfNameValid("   "));
    }
}
