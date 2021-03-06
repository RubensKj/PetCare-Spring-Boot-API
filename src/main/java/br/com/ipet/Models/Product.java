package br.com.ipet.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@DynamicUpdate
@DynamicInsert
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @NotNull
    @Size(max = 65)
    private String name;

    @Size(max = 650)
    private String description;

    @NotNull
    private BigDecimal price;

    private String weight;

    @Size(max = 100)
    private String indicationPet;

    private String porte;

    private String age;

    @Size(max = 120)
    private String transgenic;
    @Size(max = 650)
    private String composition;

    @Size(max = 1000)
    private String avatar;

    @NotNull
    private int quantityStore;

    @CreationTimestamp
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private Date createdAt;

    public Product() {
    }

    public Product(@NotNull @Size(max = 65) String name, @NotNull BigDecimal price, String weight, @Size(max = 35) String indicationPet, @Size(max = 35) String porte, String age, @Size(max = 120) String transgenic, @Size(max = 250) String composition, @NotNull int quantityStore) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.indicationPet = indicationPet;
        this.porte = porte;
        this.age = age;
        this.transgenic = transgenic;
        this.composition = composition;
        this.quantityStore = quantityStore;
    }

    public long getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getQuantityStore() {
        return quantityStore;
    }

    public void setQuantityStore(int quantityStore) {
        this.quantityStore = quantityStore;
    }
}
