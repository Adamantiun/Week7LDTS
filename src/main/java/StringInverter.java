public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String res = "";
        for(int i = drink.getText().length(); i > 0; i--) {
            res += drink.getText().charAt(i-1);
        }
        drink.setText(res);
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
