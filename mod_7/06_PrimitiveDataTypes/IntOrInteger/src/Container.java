public class Container {
    private Integer count = 0;

    public Container(){
        this.count = count;
    }
    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }

    public Container setCount(int count){
        return  new Container();
    }

}
