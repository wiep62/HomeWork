public class Dimensions {
    private final int width;
    private final int height;
    private final int length;

    /*
     * Габариты — ширина, высота и длина — должны храниться в отдельном
     * иммутабельном классе Dimensions. Создайте класс Dimensions с соответствующими
     *  полями и реализуйте в нём метод вычисления объёма груза (название метода придумайте самостоятельно).
     * */
public Dimensions(int width, int height, int length){
    this.width = width;
    this.height = height;
    this.length = length;
}

    public Dimensions setWidth(int width){
        return new  Dimensions(width, height, length);
    }
    public Dimensions setHeight(int height){
        return new  Dimensions(width, height, length);
    }
    public Dimensions setLength(int length){
        return new  Dimensions(width, height, length);
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int getLength() {
        return length;
    }



    public int volume(){
      return width * height * length;
    }

}
