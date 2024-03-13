public class CargoInformation {
    public final int dimensions; //габариты
    public final int weight; //вес
    public final String address; //адрес
    public  boolean property; //свойство
    public final String registrationNumber;
    public boolean cargoFragile; //хрупкий груз

    /*  Реализуйте в классе методы, дающие возможность изменять адрес доставки,
    габариты и массу груза без изменения исходного объекта путём создания его копии.*/
public CargoInformation( int dimensions,
                        int weight,
                        String address,
                        String registrationNumber,
                        boolean cargoFragile,
                        boolean property){
    this.dimensions = dimensions;
    this.weight = weight;
    this.address = address;
    this.registrationNumber = registrationNumber;
    this.cargoFragile = cargoFragile;
    this.property = property;
}
    public CargoInformation( ){
      dimensions = 0;
        weight = 0;
        address = "address";
        registrationNumber = "registrationNumber";
        cargoFragile = true;
        property = true;
    }


public CargoInformation setDimensions(int dimensions){
    return new CargoInformation( dimensions, weight, address, registrationNumber, cargoFragile, property);
}
    public CargoInformation setWeight(int weight){
        return new CargoInformation(  dimensions, weight, address, registrationNumber, cargoFragile, property);
    }
    public CargoInformation setAddress(String address){
        return new CargoInformation(  dimensions, weight, address, registrationNumber, cargoFragile, property);
    }
    public CargoInformation setRegistrationNumber(String registrationNumber){
        return new CargoInformation( dimensions, weight, address, registrationNumber, cargoFragile, property);
    }

    public CargoInformation setIsCargoFragile(boolean cargoFragile){
        return new CargoInformation( dimensions, weight, address, registrationNumber, cargoFragile, property);
    }
    public CargoInformation setProperty(boolean property){
        return new CargoInformation( dimensions, weight, address, registrationNumber, cargoFragile, property);
    }

    public boolean isCargoFragile() {
        return cargoFragile;
    }

    public boolean isProperty() {
        return property;
    }

 public int getDimensions() {
        return dimensions;
    }
    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }






}
