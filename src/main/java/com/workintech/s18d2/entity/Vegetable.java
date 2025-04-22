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
@Table(name = "vegetable" , schema = "fsweb")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotNull(message = "All vegetables needs a name")
    @Size(min=3,max=20)
    @Column(name="name")
    private String name;

    @Column(name="price")
    @NotNull(message = "Price can not be blank")
    private Double price;

    @Column(name="is_grown_on_tree")
    private Boolean isGrownOnTree;

    public void setGrownOnTree(Boolean grownOnTree) {
        isGrownOnTree = grownOnTree;
    }

    public Boolean isGrownOnTree() {
        return isGrownOnTree;
    }
}
