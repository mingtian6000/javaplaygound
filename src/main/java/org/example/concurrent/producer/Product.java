package org.example.concurrent.producer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String brand;
    private String name;
    private boolean is_consumed = false;
}
