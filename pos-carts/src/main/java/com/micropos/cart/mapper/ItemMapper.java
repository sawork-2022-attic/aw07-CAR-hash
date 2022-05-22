package com.micropos.cart.mapper;

import com.micropos.cart.dto.ItemDto;
import com.micropos.datatype.cart.Item;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper
public interface ItemMapper {
    Collection<ItemDto> toProductsDto(Collection<Item> products);

    Collection<Item> toProducts(Collection<ItemDto> products);

    Item toProduct(ItemDto productDto);

    ItemDto toProductDto(Item pet);
}
