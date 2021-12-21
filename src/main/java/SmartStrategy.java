public class SmartStrategy implements OrderingStrategy{
    private StringDrink drink;
    private StringRecipe recipe;
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.drink=drink;
        this.recipe=recipe;
        if(bar.isHappyHour())
            bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        wants(drink,recipe,(StringBar)bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {}
}
