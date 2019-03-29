package Model;

import java.util.Date;

public class Provider {
    private int id;
    private String name;
    private String address;
    private String contact;
    private Date dateOfEntry;
    private int totalOrder;
    private int costOfGoods;
    private int outstandingDebt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(int totalOrder) {
        this.totalOrder = totalOrder;
    }

    public int getCostOfGoods() {
        return costOfGoods;
    }

    public void setCostOfGoods(int costOfGoods) {
        this.costOfGoods = costOfGoods;
    }

    public int getOutstandingDebt() {
        return outstandingDebt;
    }

    public void setOutstandingDebt(int outstandingDebt) {
        this.outstandingDebt = outstandingDebt;
    }
}
