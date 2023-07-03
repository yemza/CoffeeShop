package com.TheCoffeeShop.Rest;


import com.TheCoffeeShop.DTO.MenuItemDTO;
import com.TheCoffeeShop.Services.MenuItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SwaggerDefinition(tags = {@Tag(name="Products Controller" , description = "city controller")})
@Api(value = "Products Controller" , tags = {"Products Controller"})
public class MenuItemControler {


  private final MenuItemService menuItemeService;

  public MenuItemControler(MenuItemService menuItemeService){
    this.menuItemeService = menuItemeService;
  }


  @GetMapping("items")
  public List<MenuItemDTO> getAllItems(){
    return this.menuItemeService.getAllItems();
  }

}
