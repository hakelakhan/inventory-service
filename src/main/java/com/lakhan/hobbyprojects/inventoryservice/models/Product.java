package com.lakhan.hobbyprojects.inventoryservice.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Document(collection = "products")
public class Product {
    @Id
    private ObjectId _id;
    private String title;
    private String description;
    @Field("image_link")
    private String imageLink;
    private Set<String> tags;
    private List<Variant> variants;
    private List<Option> options;
    @Data
    private class Variant {
        double price;
        @Field("currency_code")
        String currencyCode;
    }

    @Data
    private class Option {
        String name;
        List<String> values;
        @Field("image_links")
        List<String> imageLinks;
    }
}
