package progect.exceprions;

public class NullCharactersException extends NullPointerException{

    public NullCharactersException() {
        super("Отсутствуют характеристики оружия");
    }

    public NullCharactersException(String s) {
        super(s);
    }



}
