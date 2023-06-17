package com.TheCoffeeShop.DTO;

public class ImageCoffeeShopDTO {
  private Long idImageCoffeShop;

  private String image;

  private CoffeeShopDTO coffeeShopDTO;

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

  public CoffeeShopDTO getCoffeeShopDTO() {
    return coffeeShopDTO;
  }

  public void setCoffeeShopDTO(CoffeeShopDTO coffeeShopDTO) {
    this.coffeeShopDTO = coffeeShopDTO;
  }
}
