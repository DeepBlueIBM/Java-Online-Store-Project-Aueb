public class Fridges extends Products{
    
    private String type;
    private String energyClass;
    private String spaceConservation;
    private String spaceRefrigaration;

    public Fridges(String code,String modelName,String yearOfModel,String manufacturer,double price, double discount,int quantity, String type,String energyClass,String spaceConservation,String spaceRefrigaration){
        super(code, modelName, yearOfModel, manufacturer, price, 0.20,quantity);
        this.type=type;
        this.energyClass=energyClass;
        this.spaceConservation=spaceConservation;
        this.spaceRefrigaration=spaceRefrigaration;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setEnergyClass(String energyClass){
        this.energyClass=energyClass;
    }

    public void setSpaceConservation(String spaceConcervation){
        this.spaceConservation=spaceConcervation;
    }

    public void setSpaceRefrigaration(String spaceRefrigaration){
        this.spaceRefrigaration=spaceRefrigaration;
    }

    public String getType(){
        return type;
    }

    public String getEnergyClass(){
        return energyClass;
    }

    public String getSpaceConservation(){
        return spaceConservation;
    }

    public String getSpaceRefrigaration(){
        return spaceRefrigaration;
    }

    public String toString(){
        return super.toString()+", Type is : "+getType()+", Energy Class is : "+getEnergyClass()+", Space Conservation is : "+getSpaceConservation()+", Space Refrigaration is : "+getSpaceRefrigaration();
    }
}