public class StringReplacer implements StringTransformer{

    private char newChar;
    private char oldChar;

    public StringReplacer(char toBeReplaced, char replacer) {
        newChar = replacer;
        oldChar = toBeReplaced;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(oldChar, newChar));
    }

    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(newChar, oldChar));
    }
}
