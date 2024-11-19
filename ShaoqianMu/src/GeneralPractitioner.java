public class GeneralPractitioner extends HealthProfessional {
    private String specialty;   // 专科领域
    private String phoneNumber; // 医生的电话号码

    // Default constructor
    public GeneralPractitioner() {
        super(0, "", "General Practitioner"); // 调用父类的构造方法
        this.specialty = "";
        this.phoneNumber = "";
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String specialty, String phoneNumber) {
        super(id, name, "General Practitioner"); // 调用父类的构造方法并设置职位为"General Practitioner"
        if (specialty == null || specialty.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialty cannot be null or empty");
        }
        this.specialty = specialty;
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter for specialty and phoneNumber
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Override the toString method to include phone number instead of hospital
    @Override
    public String toString() {
        return super.toString() + "Specialty: " + specialty + "\nPhone Number: " + phoneNumber + "\n";
    }
}
