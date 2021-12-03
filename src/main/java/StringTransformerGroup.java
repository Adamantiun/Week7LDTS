import java.util.List;

public class StringTransformerGroup implements StringTransformer{

    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformersList) {
        transformers = transformersList;
    }

    public void execute(StringDrink drink) {
        for(StringTransformer step : transformers)
            step.execute(drink);
    }

    @Override
    public void undo(StringDrink drink) {
        for(int i = transformers.size(); i > 0; i--)
            transformers.get(i-1).undo(drink);
    }
}
