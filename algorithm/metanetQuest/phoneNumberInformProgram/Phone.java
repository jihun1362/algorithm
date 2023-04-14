package algorithm.metanetQuest.phoneNumberInformProgram;

public class Phone {
    private String name;
    private String address;
    private String phoneNumber;

    public Phone(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "[" + "이름 : " + name + ", 주소 : " +address+", 전화번호 : " +phoneNumber+']';
    }
}
