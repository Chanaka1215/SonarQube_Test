import java.io.Serializable;

public class Person implements Serializable {
    String name;
    Address address;  //Address isn't serializable

    Person(){
        address =  new Address();
    }

    public void printIt(){
        System.out.println(address.name);
    }
}
