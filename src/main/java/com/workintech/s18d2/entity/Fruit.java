package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fruit" , schema = "fsweb")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotNull(message = "All fruits needs a name")
    @Size(min=3, max=20)
    @Column(name="name")
    private String name;

    @NotNull(message = "Price can not be blank")
    @Column(name="price")
    private Double price;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Fruit type can not be blank")
    @Column(name="fruit_type")
    private FruitType fruitType;
}
