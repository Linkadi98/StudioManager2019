package Model;

public class OrderDetail {
    private int id;
    private int formOfPayment;
    private String statusOfPayment;
    private String preferences;

    public OrderDetail(int id, int formOfPayment, String statusOfPayment, String preferences) {
        this.id = id;
        this.formOfPayment = formOfPayment;
        this.statusOfPayment = statusOfPayment;
        this.preferences = preferences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFormOfPayment() {
        return formOfPayment;
    }

    public void setFormOfPayment(int formOfPayment) {
        this.formOfPayment = formOfPayment;
    }

    public String getStatusOfPayment() {
        return statusOfPayment;
    }

    public void setStatusOfPayment(String statusOfPayment) {
        this.statusOfPayment = statusOfPayment;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}
