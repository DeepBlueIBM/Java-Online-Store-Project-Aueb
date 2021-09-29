public class Products{



    private String code;
    private String modelName;
    private String yearOfModel;
    private String manufacturer;
    private double price;
    private double discount;
    private int quantity;

    public Products(String code, String modelName, String yearOfModel, String manufacturer,double price,double discount,int quantity){
        this.code=code;
        this.modelName= modelName;
        this.yearOfModel=yearOfModel;
        this.manufacturer=manufacturer;
        this.discount=discount;
        this.quantity=quantity;
        this.price=price;
    }

    public String getCode(){
        return code;
    }

    public String getModelName(){
        return modelName;
    }

    public String getYearOfModel(){
        return yearOfModel;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getPrice(){
        return price;
    }

    public double getDiscount(){
        return discount;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setCode(String code){
        this.code=code;
    }

    public void setModelName(String modelName){
        this.modelName=modelName;
    }

    public void setYearOfModel(String yearOfModel){
        this.yearOfModel=yearOfModel;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }

    public void getPrice(double price){
        this.price=price;
    }

    public void getDiscount(int discount){
        this.discount=discount;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public String toString(){
		return "Code is: "+getCode()+", Name: "+getModelName()+", Year is: "+getYearOfModel()+", Manufacturer is : "+getManufacturer()+", Price is :"+getPrice()+", Avaible Quantity is: "+getQuantity();
	}
}