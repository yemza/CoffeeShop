package com.TheCoffeeShop.Services.Impl;

import com.TheCoffeeShop.DTO.MenuItemDTO;
import com.TheCoffeeShop.Mappers.MenuItemMapper;
import com.TheCoffeeShop.Repositories.MenuItemRepository;
import com.TheCoffeeShop.Services.MenuItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuItemServiceImpl implements MenuItemService {

 private final MenuItemRepository menuItemRepository;
 private final MenuItemMapper menuItemMapper;

  MenuItemServiceImpl(MenuItemRepository menuItemRepository, MenuItemMapper menuItemMapper){
    this.menuItemRepository = menuItemRepository;
    this.menuItemMapper = menuItemMapper;
  }

  @Override
  @Transactional
  public List<MenuItemDTO> getAllItems() {
    return menuItemRepository.findAll().stream().map(menuItemMapper::toDTO).collect(Collectors.toList());
  }
}
