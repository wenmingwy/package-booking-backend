package tws.entity;
import java.io.Serializable;
public class ToPackage implements Serializable {
    private int id;
    private String recipient;
    private String phone;
    private String weight;


    public ToPackage() {

    }
    public ToPackage(int id, String recipient, String phone,String weight) {
        this.id = id;
        this.recipient = recipient;
        this.phone = phone; 
        this.weight = weight ;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return recipient;
	}

	public void setName(String recipient) {
		this.recipient = recipient;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

}
