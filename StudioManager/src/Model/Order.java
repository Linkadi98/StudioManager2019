package Model;

import java.util.Date;

public class Order {
    private int id;
    private String customerName;
    private String customerAddress;
    private int customerPhoneNumber;
    private String photoPackage;
    private Date shootingDate;
    private String shootingAdress;
    private int totalAmount;

    public Order(int id, String customerName, String customerAddress, int customerPhoneNumber, String photoPackage, Date shootingDate, String shootingAdress, int totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhoneNumber = customerPhoneNumber;
        this.photoPackage = photoPackage;
        this.shootingDate = shootingDate;
        this.shootingAdress = shootingAdress;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getPhotoPackage() {
        return photoPackage;
    }

    public void setPhotoPackage(String photoPackage) {
        this.photoPackage = photoPackage;
    }

    public Date getShootingDate() {
        return shootingDate;
    }

    public void setShootingDate(Date shootingDate) {
        this.shootingDate = shootingDate;
    }

    public String getShootingAdress() {
        return shootingAdress;
    }

    public void setShootingAdress(String shootingAdress) {
        this.shootingAdress = shootingAdress;
    }
}
