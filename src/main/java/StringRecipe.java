import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> steps) {
        transformers = steps;
    }

    public void mix(StringDrink drink) {
        for(StringTransformer step : transformers){
            step.execute(drink);
        }
    }
}
