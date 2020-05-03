import java.util.ArrayList;
import java.util.List;

class Person{
    private String strName;
    private double dMoney;
    private List<Product> bag = new ArrayList<Product>();
   
    Person(){
        this.strName=" ";
        this.dMoney=0.0;
    }
    Person(String name, double money){
        this.strName=name;
        this.dMoney=money;
    }
    public void setPersonName(String name) {
        if (name.equals(null)||name.equals(""))
            System.out.println("Name cannot be an empty!");
        else 
        	this.strName=name;
    }  
    public void setPersonMoney(double money) {
        if (money<0) 
            System.out.println("Money cannot be a negative number!"); 
        else 
        	this.dMoney=money;
    }
    public String getPersonName() { return this.strName; }
    public double getPersonMoney() { return this.dMoney; }
    private void addProduct(Product product) { bag.add(product); }

    public void checkPurchase(Product product) {
        if(this.getPersonMoney() >= product.getProductCost()) {
            this.setPersonMoney(this.getPersonMoney()-product.getProductCost());
            addProduct(product);
            System.out.println(this.strName +" bought "+product.getPoductName());
        }
        else 
            System.out.println(this.strName+" can't afford "+product.getPoductName());
    }
    public void print() {
	       System.out.print(this.strName+" - ");
	       if(bag.size()==0)
	    	   System.out.print("Nothing bought");
	       else 
	    	   for (int i = 0; i < bag.size(); i++)
	    		   System.out.print(bag.get(i).getPoductName()+" ");
	       
	       System.out.println();
	   }
   
}
 
