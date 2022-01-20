package com.jonathan.back.end.shoppingapi.model;

import org.modelmapper.ModelMapper;

import javax.persistence.Embeddable;

@Embeddable
public class Item {
    private String productIdentifier;
    private Float price;
}
