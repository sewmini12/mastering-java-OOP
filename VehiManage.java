class VehiManage{
    String brand;
    int year;

    VehiManage(String brand,int year){
          this.brand=brand;
          this.year=year;
    }
    public void displayInfo(){
    System.out.println(brand);
    System.out.println(year);
    }
    public static  void main(String[]args){
        Cars c1=new Cars("toyota", "ABC");
        Cars c2=new Cars("axiata",2033,"XYZ");

        c1.displayInfo();
        c2.displayInfo(); 
    }
}
class Cars extends VehiManage{
    String model;

    Cars(String brand,int year,String model){
        super(brand,year);  
        this.model=model;
    }
    Cars(String brand,String model){
        this(brand,2025,model);
       
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(model);
    }
}
