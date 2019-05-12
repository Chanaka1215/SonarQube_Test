import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private Address address;  //Address isn't serializable

    Person(){
        address =  new Address();
    }

    public void printIt(){
        System.out.println(address.name);
    }
}
