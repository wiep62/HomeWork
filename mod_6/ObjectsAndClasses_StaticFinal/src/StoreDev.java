public class StoreDev {
    private final String storeDevice;
    private final int  volume;
    private final int  weight;

    public StoreDev(String storeDevice, int volume, int weight) {
        this.storeDevice = storeDevice;
        this.volume = volume;
        this.weight = weight;
    }

    public StoreDev() {
        storeDevice = "SSD or HDD";
        volume = 0;
        weight = 0;
    }
    public StoreDev setStoreDevice(String storeDevice){
        return new StoreDev(storeDevice, volume, weight);
    }
    public StoreDev setVolume(int  volume){
        return new StoreDev(storeDevice, volume, weight);
    }


    public StoreDev setWeight(int weight){
        return new StoreDev(storeDevice, volume, weight);
    }

    public String getStoreDevice() {
        return storeDevice;
    }

    public int getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }
}
