package com.TheCoffeeShop.Mappers;


import com.TheCoffeeShop.DAOEntities.MenuCategory;
import com.TheCoffeeShop.DAOEntities.MenuItem;
import com.TheCoffeeShop.DTO.MenuItemDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;



@Mapper(componentModel = "spring")
public interface MenuItemMapper {


  @Mapping(target="idMenuItem", source = "idMenuItem")
  @Mapping(target="name", source = "name")
  @Mapping(target="itemImage", source = "itemImage")
  @Mapping(target="ingredient", source = "ingredient")
  @Mapping(target="menuItemDetailsDTO", source = "menuItemDetails")
  @Mapping(target="menuCategoryDTO", source = "menuCategory")
  @Mapping(target="orderDetailsDTO", source = "orderDetails")
  MenuItemDTO toDTO(MenuItem menuItem);



  @Mapping(target="idMenuItem", source = "idMenuItem")
  @Mapping(target="name", source = "name")
  @Mapping(target="ingredient", source = "ingredient")
  @Mapping(target="menuItemDetails", source = "menuItemDetailsDTO")
  @Mapping(target="menuCategory", source = "menuCategoryDTO")
  @Mapping(target="orderDetails", source = "orderDetailsDTO")
  MenuItem toEntity(MenuItemDTO menuItemDTO);


}
