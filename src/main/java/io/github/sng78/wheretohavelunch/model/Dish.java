package io.github.sng78.wheretohavelunch.model;

import java.time.LocalDate;

public class Dish extends AbstractNamedEntity {
    private LocalDate date;
    private int price;
    private Integer restaurantId;

    public Dish() {
    }

    public Dish(Integer id, String name, LocalDate date, int price, Integer restaurantId) {
        super(id, name);
        this.date = date;
        this.price = price;
        this.restaurantId = restaurantId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }
}
