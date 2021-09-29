public class BlueOrDVDPlayers extends Products{
    
    private String type;
    private String resolution;
    private String format;
    
    public BlueOrDVDPlayers(String code,String modelName,String yearOfModel,String manufacturer,double price, double discount,int quantity,String type,String resolution,String format){
        super(code, modelName, yearOfModel, manufacturer, price, 0.25, quantity);
        this.format=format;
        this.resolution=resolution;
        this.type=type;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setResolution(String resolution){
        this.resolution=resolution;
    }

    public void setFormat(String format){
        this.format=format;
    }

    public String getType(){
        return type;
    }

    public String getResolution(){
        return resolution;
    }

    public String getFormat(){
        return format;
    }

    public String toString(){
        return super.toString()+", Type is : "+getType()+", Resolution is: "+getResolution()+", Format is: "+getFormat();
    }
}