public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String res = "";
        String c;
        for(int i = 0; i < drink.getText().length(); i++) {
            c = String.valueOf(drink.getText().charAt(i));
            if(c == c.toLowerCase())
                res += c.toUpperCase();
            else
                res += c.toLowerCase();
        }
        drink.setText(res);
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
