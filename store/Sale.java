public class Sale{
    

    private int code;
	private String device;
	private String name;
	private String phone;
	private String date;
    private double cost;
    
    public Sale(int code, String device, String name, String phone, String date, double cost){
        this.code=code;
        this.device=device;
        this.name=name;
        this.phone=phone;
        this.date=date;
        this.cost=cost;
    }

    public void setCode(int code){
        this.code=code;
    }

    public void setDevice(String device){
        this.device=device;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public void setDate(String date){
        this.date=date;
    }

    public void setCost(double cost){
        this.cost=cost;
    }

    public int getCode(){
        return code;
    }

    public String getDevice(){
        return device;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getDate(){
        return date;
    }

    public double getCost(){
        return cost;
    }

    public String toString(){
        return "\nCode is: "+getCode()+", Device is : "+getDevice()+", Name is : "+getName()+", Phone is : "+getPhone()+", Sale Date was : "+getDate()+", Cost is : "+getCost();
    }
}