public class Screen {
    ;
    private final double diagonal;
    private final String screene; //(IPS, TN, VA)
    private final int weight;

    Screen(double diagonal, String screene, int weight) {
        this.diagonal = diagonal;
        this.screene = screene;
        this.weight = weight;
    }

    Screen() {
        diagonal = 0;
        screene = "I dont NO";
        weight = 0;
    }


    public Screen setDiagonal(double diagonal){
        return new Screen(diagonal, screene, weight);
    }
    public Screen setScreene(String screene){
        return new Screen(diagonal, screene, weight);
    }
    public Screen setWeight(int weight){
        return new Screen(diagonal, screene, weight);
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String  getScreene() {
        return screene;
    }

    public int getWeight() {
        return weight;
    }
}
