package TicTacToe.Model.Obj;

public class Val {
    public final String name;

    public char value;
    public Val(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setValue(char s){
        this.value = s;
    }

    public char getValue(){
        return this.value;
    }

}
