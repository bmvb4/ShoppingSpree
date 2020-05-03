import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Main {

 public static void main(String[] args) throws IOException {
	 	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] FirstSlice = new String[20];
        FirstSlice = in.readLine().split(";");
        String[] SecondSlice = new String[2];
        List<Person> listOfPersons = new ArrayList<Person>();
        List<Product> ListOfProducts = new ArrayList<Product>();
        for (int i = 0; i < FirstSlice.length; i++) {
        	SecondSlice = FirstSlice[i].split("=");
            Person person = new Person();
            person.setPersonName(SecondSlice[0]);
            person.setPersonMoney(Integer.parseInt(SecondSlice[1]));
            listOfPersons.add(person);
        }
        FirstSlice = in.readLine().split(";");
        SecondSlice = new String[2];
        for (int i = 0; i < FirstSlice.length; i++) {
        	SecondSlice = FirstSlice[i].split("=");
            Product product = new Product();
            product.setProductName(SecondSlice[0]);
            product.setProductCost(Integer.parseInt(SecondSlice[1]));
            ListOfProducts.add(product);
        }
        while (true) {
        	FirstSlice = in.readLine().split(" ");
            if (!FirstSlice[0].equals("END")) {
            	Person person = new Person();
            	Product product = new Product();
                for (int i = 0; i < listOfPersons.size(); i++)
                    if (listOfPersons.get(i).getPersonName().equals(FirstSlice[0])) {
                        person = listOfPersons.get(i);
                        break;
                    }
                for (int i = 0; i < ListOfProducts.size(); i++) 
                    if (ListOfProducts.get(i).getPoductName().equals(FirstSlice[1])) {
                        product = ListOfProducts.get(i);
                        break;
                    }
                person.checkPurchase(product);
            } else {
                for (int i = 0; i < listOfPersons.size(); i++)
                	listOfPersons.get(i).print();
                break;
            }
        }     
    }
}
