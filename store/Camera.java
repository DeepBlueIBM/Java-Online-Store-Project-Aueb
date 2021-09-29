public class Camera extends Products{

    private String type;
    private String megapixel;
    private String opticalZoom;
    private String digitalZoom;
    private String size;

    public Camera(String code,String modelName,String yearOfModel,String manufacturer,double price, double discount,int quantity,String type,String megapixel,String opticalZoom,String digitalZoom,String size){
        super(code, modelName, yearOfModel, manufacturer, price, 0.25, quantity);
        this.type=type;
        this.megapixel=megapixel;
        this.opticalZoom=opticalZoom;
        this.digitalZoom=digitalZoom;
        this.size=size;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setMegapixel(String megapixel){
        this.megapixel=megapixel;
    }

    public void setOpticalZoom(String opticalZoom){
        this.opticalZoom=opticalZoom;
    }

    public void setDigitalZoom(String digitalZoom){
        this.digitalZoom=digitalZoom;
    }

    public void setSize(String size){
        this.size=size;
    }

    public String getType(){
        return type;
    }

    public String getMegapixel(){
        return megapixel;
    }

    public String getOpticalZoom(){
        return opticalZoom;
    }

    public String getDigitalZoom(){
        return digitalZoom;
    }

    public String getSize(){
        return size;
    }

    public String toString(){
        return super.toString()+", Type is : "+getType()+", Megapixel is: "+getMegapixel()+", Optical Zoom is : "+getOpticalZoom()+", Digital Zoom is: "+getDigitalZoom()+", Screen Size is: "+getSize();
    }
}