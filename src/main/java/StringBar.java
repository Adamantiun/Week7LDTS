public class StringBar extends Bar{

    public StringBar(){
        inHappyHour = false;

    }

    public boolean isHappyHour() {
        return inHappyHour;
    };

    public void startHappyHour() {
        inHappyHour = true;
    };

    public void endHappyHour() {
        inHappyHour = false;
    };
}
