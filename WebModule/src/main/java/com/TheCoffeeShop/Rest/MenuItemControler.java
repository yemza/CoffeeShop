package com.TheCoffeeShop.Rest;


import com.TheCoffeeShop.DTO.MenuItemDTO;
import com.TheCoffeeShop.Services.MenuItemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SwaggerDefinition(tags = {@Tag(name="Products Controller" , description = "city controller")})
@Api(value = "Products Controller" , tags = {"Products Controller"})
public class MenuItemControler {


  private final MenuItemeService  menuItemeService;

  public MenuItemControler(MenuItemeService menuItemeService){
    this.menuItemeService = menuItemeService;
  }


  @GetMapping("items")
  public MenuItemDTO getAllItems(){
    return this.menuItemeService.getAllItems();
  }

}
