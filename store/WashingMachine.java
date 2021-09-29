public class WashingMachine extends Products {

    private String energyClass;
    private String capacity;
    private String rotations;

    public WashingMachine(String code,String modelName,String yearOfModel,String manufacturer,double price, double discount,int quantity, String energyClass,String capacity,String rotations){
        super(code, modelName, yearOfModel, manufacturer, price, 0.20, quantity);
        this.energyClass=energyClass;
        this.capacity=capacity;
        this.rotations=rotations;
    }

    public void setEnergyClass(String energyClass){
        this.energyClass=energyClass;
    }

    public void setCapacity(String capacity){
        this.capacity=capacity;
    }

    public void setRotations(String rotations){
        this.rotations=rotations;
    }

    public String getEnergyClass(){
        return energyClass;
    }

    public String getCapacity(){
        return capacity;
    }

    public String getRotations(){
        return rotations;
    }

    public String toString(){
        return super.toString()+", Energy CLass is : "+getEnergyClass()+", Capacity is : "+getCapacity()+", Rotations are: "+getRotations();
    }
}