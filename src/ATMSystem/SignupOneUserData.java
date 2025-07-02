package ATMSystem;

public class SignupOneUserData {

	    private String formno;
	    private String name;
	    private String fatherName;
	    private String dob;
	    private String gender;
	    private String email;
	    private String maritalStatus;
	    private String address;
	    private String city;
	    private String pincode;
	    private String state;

	    // Constructor
	    public SignupOneUserData(String formno, String name, String fatherName, String dob, String gender,
	                         String email, String maritalStatus, String address, String city,
	                         String pincode, String state) {
	        this.formno = formno;
	        this.name = name;
	        this.fatherName = fatherName;
	        this.dob = dob;
	        this.gender = gender;
	        this.email = email;
	        this.maritalStatus = maritalStatus;
	        this.address = address;
	        this.city = city;
	        this.pincode = pincode;
	        this.state = state;
	    }

	    // Getters (you can also add setters if needed)
	    public String getFormno() { return formno; }
	    public String getName() { return name; }
	    public String getFatherName() { return fatherName; }
	    public String getDob() { return dob; }
	    public String getGender() { return gender; }
	    public String getEmail() { return email; }
	    public String getMaritalStatus() { return maritalStatus; }
	    public String getAddress() { return address; }
	    public String getCity() { return city; }
	    public String getPincode() { return pincode; }
	    public String getState() { return state; }

	    @Override
	    public String toString() {
	        return formno + " | " + name + " | " + fatherName + " | " + dob + " | " + gender + " | " + email +
	               " | " + maritalStatus + " | " + address + " | " + city + " | " + pincode + " | " + state;
	    }
	}

