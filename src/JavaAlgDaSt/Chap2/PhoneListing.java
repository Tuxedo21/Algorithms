package JavaAlgDaSt.Chap2;

/**
 * Created by tuxedo21 on 11/01/17.
 */
public class PhoneListing implements KeyMode {

    private String name;
    private String address;
    private String number;

    public PhoneListing(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String toString(){
        return ("Name is "+name+"\nAddress is "+address+"\nNumber is "+number+"\n");
    }

    @Override
    public KeyMode deepCopy() {
        PhoneListing clone = new PhoneListing(name,address,number);
        return clone;
    }

    @Override
    public int compareTo(Object targetKey) {
        String tKey = (String) targetKey;
        return(name.compareTo(tKey));
    }// end of compareTo method
}// end of class PhoneListing
