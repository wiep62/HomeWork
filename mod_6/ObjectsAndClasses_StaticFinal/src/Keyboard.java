public class Keyboard {
    private final String keyBoard;
    private final int  backlight;
    private final int   weight;

    Keyboard(String keyBoard , int backlight, int weight) {
        this.keyBoard = keyBoard;
        this.backlight = backlight;
        this.weight = weight;
    }

    Keyboard() {
        keyBoard = "keyboardType";
        backlight = 0;
        weight = 0;
    }

    public Keyboard setKeyboardType(String keyBoard){
        return  new  Keyboard(keyBoard , backlight, weight);
    }
    public Keyboard setBacklight(int backlight){
        return  new  Keyboard(keyBoard , backlight, weight);
    }
    public Keyboard setWeight(int weight){
        return  new  Keyboard(keyBoard , backlight, weight);
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    public int getBacklight() {
        return backlight;
    }

    public int getWeight() {
        return weight;
    }
}
