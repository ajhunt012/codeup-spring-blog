package models;
import jakarta.persistence.*;

@Entity
@Table(name = "ad_images")
public class AdImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(columnDefinition = "TEXT")
    private String imageURL;

    @ManyToOne
//    @JoinColumn(name = "ad_id")
    private Ad ad;

    public AdImage(){}

    public AdImage(String imageURL, Ad ad) {
        this.imageURL = imageURL;
        this.ad = ad;
    }

    public AdImage(String imageURL) {
        this.imageURL = imageURL;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}