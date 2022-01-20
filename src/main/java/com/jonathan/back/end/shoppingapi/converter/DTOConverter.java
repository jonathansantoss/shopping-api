package com.jonathan.back.end.shoppingapi.converter;

import com.jonathan.back.end.shoppingapi.model.Item;
import com.jonathan.back.end.shoppingapi.model.Shop;
import dto.ItemDTO;
import dto.ShopDTO;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class DTOConverter {

    public static ItemDTO convert(Item item) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(item, ItemDTO.class);
    }

    public static ShopDTO convert(Shop shop) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(shop, ShopDTO.class);
    }

    public static List<ShopDTO> convertToList(List<Shop> shops) {
        return shops.stream().map(DTOConverter::convert).collect(Collectors.toList());
    }

    public static Item convert(ItemDTO itemDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(itemDTO, Item.class);
    }

    public static Shop convert(ShopDTO shopDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(shopDTO, Shop.class);
    }
}
