public class Consoles extends Products{

    private String type;
    private String cpu;
    private String gpu;
    private String sound;
    private String capacity;

    public Consoles(String code,String modelName,String yearOfModel,String manufacturer,double price, double discount,int quantity,String type,String cpu,String gpu,String sound,String capacity){
        super(code, modelName, yearOfModel, manufacturer, price, 0.10,quantity);
        this.type=type;
        this.cpu=cpu;
        this.gpu=gpu;
        this.sound=sound;
        this.capacity=capacity;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setCpu(String cpu){
        this.cpu=cpu;
    }

    public void setGpu(String gpu){
        this.gpu=gpu;
    }

    public void setSound(String sound){
        this.sound=sound;
    }

    public void setCapacity(String capacity){
        this.capacity=capacity;
    }

    public String getType(){
        return type;
    }

    public String getCpu(){
        return cpu;
    }

    public String getGpu(){
        return gpu;
    }

    public String getSound(){
        return sound;
    }

    public String getCapacity(){
        return capacity;
    }

    public String toString(){
        return super.toString()+", Type is : "+getType()+", Cpu is: "+getCpu()+"| Gpu: "+getGpu()+", Sound is : "+getSound()+", Capacity is : "+getCapacity();
    }
}