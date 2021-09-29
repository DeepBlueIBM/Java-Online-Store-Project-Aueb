public class Order{

    private int code;
	private String device;
	private String name;
	private String phone;
	private String orderDate;
	private String arrivalDate;
	private double cost;
	private boolean done;
	
	
	public Order(int code,String device,String name,String phone,String orderDate,String arrivalDate,double cost,boolean done){
        this.code=code;
        this.device=device;
        this.name=name;
        this.phone=phone;
        this.orderDate=orderDate;
        this.arrivalDate=arrivalDate;
        this.cost=cost;
        this.done=done;
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
    
    public String getOrderDate(){
		return orderDate;
    }

    public String getArrivalDate(){
		return arrivalDate;
    }
    
    public double getCost(){
		return cost;
    }
    
    public boolean getDone(){
		return done;
	}
    
	public void setCode(int code){
		this.code=code;
	}
	
	public void setDevice(String device){
		this.device = device;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setOrderDate(String orderDate){
		this.orderDate = orderDate;
	}
	
	public void setArrivalDate(String arrivalDate){
		this.arrivalDate = arrivalDate;
	}
	
	public void setCost(double cost){
		this.cost = cost;
	}
	
	public void setDone(boolean done){
		this.done = done;
	}
	
	public String toString(){
        return "\nCode is: "+getCode()+", Device is : "+getDevice()+", Name is: "+getName()+", Phone is : "+getPhone()+", Order Date is : "+getOrderDate()+", Arrival Date: "+getArrivalDate()+", Cost is : "+getCost()+", Transaction Completed: "+getDone();
    }
	
	
}