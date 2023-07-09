package com.TheCoffeeShop.Mappers;

import com.TheCoffeeShop.DAOEntities.MenuCategory;
import com.TheCoffeeShop.DAOEntities.MenuItem;
import com.TheCoffeeShop.DAOEntities.MenuItemDetails;
import com.TheCoffeeShop.DAOEntities.OrderDetails;
import com.TheCoffeeShop.DTO.MenuCategoryDTO;
import com.TheCoffeeShop.DTO.MenuItemDTO;
import com.TheCoffeeShop.DTO.MenuItemDetailsDTO;
import com.TheCoffeeShop.DTO.OrderDetailsDTO;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-09T11:05:30+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.2 (Oracle Corporation)"
)
@Component
public class MenuItemMapperImpl implements MenuItemMapper {

    @Override
    public MenuItemDTO toDTO(MenuItem menuItem) {
        if ( menuItem == null ) {
            return null;
        }

        MenuItemDTO menuItemDTO = new MenuItemDTO();

        menuItemDTO.setIdMenuItem( menuItem.getIdMenuItem() );
        menuItemDTO.setName( menuItem.getName() );
        menuItemDTO.setItemImage( menuItem.getItemImage() );
        menuItemDTO.setIngredient( menuItem.getIngredient() );
        menuItemDTO.setMenuItemDetailsDTO( menuItemDetailsSetToMenuItemDetailsDTOSet( menuItem.getMenuItemDetails() ) );
        menuItemDTO.setMenuCategoryDTO( menuCategoryToMenuCategoryDTO( menuItem.getMenuCategory() ) );
        menuItemDTO.setOrderDetailsDTO( orderDetailsSetToOrderDetailsDTOSet( menuItem.getOrderDetails() ) );

        return menuItemDTO;
    }

    @Override
    public MenuItem toEntity(MenuItemDTO menuItemDTO) {
        if ( menuItemDTO == null ) {
            return null;
        }

        MenuItem menuItem = new MenuItem();

        menuItem.setIdMenuItem( menuItemDTO.getIdMenuItem() );
        menuItem.setName( menuItemDTO.getName() );
        menuItem.setIngredient( menuItemDTO.getIngredient() );
        menuItem.setMenuItemDetails( menuItemDetailsDTOSetToMenuItemDetailsSet( menuItemDTO.getMenuItemDetailsDTO() ) );
        menuItem.setMenuCategory( menuCategoryDTOToMenuCategory( menuItemDTO.getMenuCategoryDTO() ) );
        menuItem.setOrderDetails( orderDetailsDTOSetToOrderDetailsSet( menuItemDTO.getOrderDetailsDTO() ) );
        menuItem.setItemImage( menuItemDTO.getItemImage() );

        return menuItem;
    }

    protected MenuItemDetailsDTO menuItemDetailsToMenuItemDetailsDTO(MenuItemDetails menuItemDetails) {
        if ( menuItemDetails == null ) {
            return null;
        }

        MenuItemDetailsDTO menuItemDetailsDTO = new MenuItemDetailsDTO();

        menuItemDetailsDTO.setIdMenuItemDetails( menuItemDetails.getIdMenuItemDetails() );
        menuItemDetailsDTO.setSize( menuItemDetails.getSize() );
        menuItemDetailsDTO.setPrice( menuItemDetails.getPrice() );

        return menuItemDetailsDTO;
    }

    protected Set<MenuItemDetailsDTO> menuItemDetailsSetToMenuItemDetailsDTOSet(Set<MenuItemDetails> set) {
        if ( set == null ) {
            return null;
        }

        Set<MenuItemDetailsDTO> set1 = new HashSet<MenuItemDetailsDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( MenuItemDetails menuItemDetails : set ) {
            set1.add( menuItemDetailsToMenuItemDetailsDTO( menuItemDetails ) );
        }

        return set1;
    }

    protected MenuCategoryDTO menuCategoryToMenuCategoryDTO(MenuCategory menuCategory) {
        if ( menuCategory == null ) {
            return null;
        }

        MenuCategoryDTO menuCategoryDTO = new MenuCategoryDTO();

        menuCategoryDTO.setIdMenuCategory( menuCategory.getIdMenuCategory() );
        menuCategoryDTO.setNameMenuCategory( menuCategory.getNameMenuCategory() );

        return menuCategoryDTO;
    }

    protected OrderDetailsDTO orderDetailsToOrderDetailsDTO(OrderDetails orderDetails) {
        if ( orderDetails == null ) {
            return null;
        }

        OrderDetailsDTO orderDetailsDTO = new OrderDetailsDTO();

        orderDetailsDTO.setIdOrderDetails( orderDetails.getIdOrderDetails() );
        orderDetailsDTO.setQuantity( orderDetails.getQuantity() );

        return orderDetailsDTO;
    }

    protected Set<OrderDetailsDTO> orderDetailsSetToOrderDetailsDTOSet(Set<OrderDetails> set) {
        if ( set == null ) {
            return null;
        }

        Set<OrderDetailsDTO> set1 = new HashSet<OrderDetailsDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( OrderDetails orderDetails : set ) {
            set1.add( orderDetailsToOrderDetailsDTO( orderDetails ) );
        }

        return set1;
    }

    protected MenuItemDetails menuItemDetailsDTOToMenuItemDetails(MenuItemDetailsDTO menuItemDetailsDTO) {
        if ( menuItemDetailsDTO == null ) {
            return null;
        }

        MenuItemDetails menuItemDetails = new MenuItemDetails();

        menuItemDetails.setIdMenuItemDetails( menuItemDetailsDTO.getIdMenuItemDetails() );
        menuItemDetails.setSize( menuItemDetailsDTO.getSize() );
        menuItemDetails.setPrice( menuItemDetailsDTO.getPrice() );

        return menuItemDetails;
    }

    protected Set<MenuItemDetails> menuItemDetailsDTOSetToMenuItemDetailsSet(Set<MenuItemDetailsDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<MenuItemDetails> set1 = new HashSet<MenuItemDetails>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( MenuItemDetailsDTO menuItemDetailsDTO : set ) {
            set1.add( menuItemDetailsDTOToMenuItemDetails( menuItemDetailsDTO ) );
        }

        return set1;
    }

    protected MenuCategory menuCategoryDTOToMenuCategory(MenuCategoryDTO menuCategoryDTO) {
        if ( menuCategoryDTO == null ) {
            return null;
        }

        MenuCategory menuCategory = new MenuCategory();

        menuCategory.setIdMenuCategory( menuCategoryDTO.getIdMenuCategory() );
        menuCategory.setNameMenuCategory( menuCategoryDTO.getNameMenuCategory() );

        return menuCategory;
    }

    protected OrderDetails orderDetailsDTOToOrderDetails(OrderDetailsDTO orderDetailsDTO) {
        if ( orderDetailsDTO == null ) {
            return null;
        }

        OrderDetails orderDetails = new OrderDetails();

        orderDetails.setIdOrderDetails( orderDetailsDTO.getIdOrderDetails() );
        orderDetails.setQuantity( orderDetailsDTO.getQuantity() );

        return orderDetails;
    }

    protected Set<OrderDetails> orderDetailsDTOSetToOrderDetailsSet(Set<OrderDetailsDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<OrderDetails> set1 = new HashSet<OrderDetails>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( OrderDetailsDTO orderDetailsDTO : set ) {
            set1.add( orderDetailsDTOToOrderDetails( orderDetailsDTO ) );
        }

        return set1;
    }
}
