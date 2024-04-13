package com.example.stylescanner.item.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.URL;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Item {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer item_id;

    @Column(nullable = false)
    private URL feed_url;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private URL item_url;

}