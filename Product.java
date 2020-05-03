class Product{
    private String strName;
    private double dCost;
   
    Product(){
        this.strName=" ";
        this.dCost=0.0;
    }  
    Product(String name, double cost){
        this.strName=name;
        this.dCost=cost;
    }  

    public void setProductName(String name) { this.strName=name; }
    public void setProductCost(double cost) { this.dCost=cost; }
    public String getPoductName() { return this.strName; }
    public double getProductCost() { return this.dCost; }
    
}
