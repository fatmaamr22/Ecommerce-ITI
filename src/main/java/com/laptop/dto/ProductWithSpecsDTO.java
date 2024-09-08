package com.laptop.dto;

import com.laptop.entity.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductWithSpecsDTO {
    private Integer id;
    private String name;
    private int price;
    private String description;
    private int stock;
    private String image;
    private String brandName;
    private ProductSpecsDTO specs;
    private CategoryDTO category;

    public ProductWithSpecsDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.stock = product.getStock();
        this.image = product.getImage();
        this.brandName = product.getBrandName();
        this.specs = new ProductSpecsDTO(product.getSpecs());
        this.category = new CategoryDTO(product.getCategory());
    }
}
