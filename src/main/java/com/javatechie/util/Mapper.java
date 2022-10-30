package com.javatechie.util;

import com.javatechie.dto.ProductDTO;
import com.javatechie.entity.Product;

public class Mapper {

    public static Product convertDTO2Entity(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setProductType(productDTO.getProductType());
        return product;

    }

    public static ProductDTO convertEntity2DTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setDescription(product.getDescription());
        productDTO.setProductType(product.getProductType());
        return productDTO;

    }
}
