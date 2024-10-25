package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Airport {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("activo")
    private Boolean active;
    @JsonProperty("balance")
    private String balance;
    @JsonProperty("imagen")
    private String image;
    @JsonProperty("capacidad")
    private Integer capacity;
    @JsonProperty("nombre")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("direccion")
    private String adress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getDateInit() {
        return dateInit;
    }

    public void setDateInit(String dateInit) {
        this.dateInit = dateInit;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    @JsonProperty("acerca")
    private String about;
    @JsonProperty("fecha_inicio")
    private String dateInit;
    @JsonProperty("latitud")
    private Double latitude;
    @JsonProperty("longitud")
    private Double longitude;
    @JsonProperty("etiquetas")
    private List<String> tags;
    @JsonProperty("aviones")
    private List<Plane> planes;

    public Airport() {

    }

    public Airport(String id, List<Plane> planes, List<String> tags, Double longitude, Double latitude, String dateInit, String about, String adress, String phone, String email, String name, Integer capacity, Boolean active, String balance, String image) {
        this.id = id;
        this.planes = planes;
        this.tags = tags;
        this.longitude = longitude;
        this.latitude = latitude;
        this.dateInit = dateInit;
        this.about = about;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.capacity = capacity;
        this.active = active;
        this.balance = balance;
        this.image = image;
    }



    @Override
    public String toString() {
        return "model.Airport{" +
                "id='" + id + '\'' +
                ", active=" + active +
                ", balance='" + balance + '\'' +
                ", image='" + image + '\'' +
                ", capacity=" + capacity +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'' +
                ", about='" + about + '\'' +
                ", dateInit='" + dateInit + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tags=" + tags +
                ", planes=" + planes +
                '}';
    }


}
