package com.example.sportshop.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="baskets")
@Data
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "amount")
    private int amount = 0;

    @Column(name = "productId")
    private Long productId;

    @ManyToOne
    @JoinColumn()
    private Product curr_product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Product getCurr_product() {
        return curr_product;
    }

    public void setCurr_product(Product curr_product) {
        this.curr_product = curr_product;
    }
}