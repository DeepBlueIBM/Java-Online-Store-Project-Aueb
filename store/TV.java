public class TV extends Products{
    


    private String type;
    private String resolution;
    private String dimension;
    private String ports;


    public TV(String code,String modelName,String yearOfModel,String manufacturer,double price, double discount,int quantity,String type,String resolution,String dimension,String ports){
        super(code, modelName, yearOfModel, manufacturer, price, 0.25, quantity);
        this.resolution=resolution;
        this.type=type;
        this.ports=ports;
        this.dimension=dimension;
    }

    public String getType(){
        return type;
    }

    public String getResolution(){
        return resolution;
    }

    public String getDimension(){
        return dimension;
    }

    public String getPorts(){
        return ports;
    }
    
    public void setType(String type){
        this.type=type;
    }

    public void setResolution(String resolution){
        this.resolution=resolution;
    }

    public void setDimension(String dimension){
        this.dimension=dimension;
    }

    public void setPorts(String ports){
        this.ports=ports;
    }

    public String toString(){
        return super.toString()+", Type is : "+getType()+", Dimension is : "+getDimension()+", Resolution is : "+getResolution()+", Ports are: "+getPorts();
    }
}