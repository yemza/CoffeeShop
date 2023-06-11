package com.TheCoffeShop.DAOEntities;

import javax.persistence.*;

@Entity()
@Table(name="Country")
public class ImageCoffeeShop {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "image_coffe_shop_id", nullable = false)
  private Long idImageCoffeShop;

  @Column(name = "image")
  private String image;

  @ManyToOne
  @JoinColumn(name = "coffeeShop_id")
  private CoffeeShop coffeeShop;

  public Long getIdImageCoffeShop() {
    return idImageCoffeShop;
  }

  public void setIdImageCoffeShop(Long idImageCoffeShop) {
    this.idImageCoffeShop = idImageCoffeShop;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public CoffeeShop getCoffeeShop() {
    return coffeeShop;
  }

  public void setCoffeeShop(CoffeeShop coffeeShop) {
    this.coffeeShop = coffeeShop;
  }
}
