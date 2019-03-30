package Model;

public class Package {
    private int id;
    private String name;
    private String description;
    private int rating;
    private int cost;
    private String urlAlbum;
    private String discountInfo;

    public Package(int id, String name, String description, int rating, int cost, String urlAlbum, String discountInfo) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.cost = cost;
        this.urlAlbum = urlAlbum;
        this.discountInfo = discountInfo;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getUrlAlbum() {
        return urlAlbum;
    }

    public void setUrlAlbum(String urlAlbum) {
        this.urlAlbum = urlAlbum;
    }

    public String getDiscountInfo() {
        return discountInfo;
    }

    public void setDiscountInfo(String discountInfo) {
        this.discountInfo = discountInfo;
    }
}
