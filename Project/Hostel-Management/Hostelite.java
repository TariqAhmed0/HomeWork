package ConcreteClasses;

public class Hostelite extends Person {

    private String hostelID; // unique for each hostelite
    private String password; // password for each hostelite
    private Room room;  
    private Laundry laundry; // hostelite will add extra garmets for sending to Laundry
    private Parking parking; // hostelite will select parking facility 
    private Mess mess;       // hostelite will select to add Visitors to Mess
    private double totalBill;
    private RegistrationDateAndTime registrationDateAndTime;
    private String complain;


    public Hostelite() {
    }

    public Hostelite(String firstName, String lastName, String email , String phoneNo, String hostelID, String password, Room room, Laundry laundry, Parking parking, Mess mess, RegistrationDateAndTime registrationDateAndTime) {
        super(firstName, lastName, email, phoneNo);
        System.out.println(firstName);
        this.hostelID = hostelID;
        this.password = password;
        this.room = room;
        this.laundry = laundry;
        this.parking = parking;
        this.mess = mess;
        this.registrationDateAndTime = registrationDateAndTime;
        this.complain = "";
    }

    public String getHostelID() {
        return this.hostelID;
    }

    public void setHostelID(String hostelID) {
        this.hostelID = hostelID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Laundry getLaundry() {
        return this.laundry;
    }

    public void setLaundry(Laundry laundry) {
        this.laundry = laundry;
    }

    public Parking getParking() {
        return this.parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    public Mess getMess() {
        return this.mess;
    }

    public void setMess(Mess mess) {
        this.mess = mess;
    }

    public double getTotalBill() {
        return this.totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public RegistrationDateAndTime getRegistrationDateAndTime() {
        return this.registrationDateAndTime;
    }

    public void setRegistrationDateAndTime(RegistrationDateAndTime registrationDateAndTime) {
        this.registrationDateAndTime = registrationDateAndTime;
    }



    // add complains if you want to do
    public void setComplain(String complain) {
        this.complain = complain;
    }

    // get that complain
    public String getComplain() {
        if(this.complain.equals("")) {
            return "";
        }
        return "Name : " + this.getFirstName() + " " + this.getLastName() + "\n"
            + "Hostel ID : " + this.getHostelID() + "\n"
            + "Complain : " + this.complain + "\n";

    }

    public double totalBillOfHostelite() {
        return this.getRoom().getRoomRent() + this.getLaundry().getLaundryBill() + this.getParking().getParkingBill() + this.getMess().getMessBill();
    }


    @Override
    public String toString() {
        return
            "----------------------------------------------------------\n"+
            super.toString() +
            "Hostel ID = " + getHostelID() + "\n" +
            getRoom().toString() + "\n" +
            getLaundry().toString() + "\n" +
            getParking().toString() + "\n" +
            getMess().toString() + "\n" +
            "Total Bill " + this.totalBillOfHostelite() + "\n" +
            getRegistrationDateAndTime().toString() + "\n" +
            "----------------------------------------------------------\n";
    }



    


    


    
}
