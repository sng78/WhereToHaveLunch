package io.github.sng78.wheretohavelunch.model;

import java.time.LocalDate;

public class Vote extends AbstractNamedEntity {
    private Integer userId;
    private Integer restaurantId;
    private LocalDate date;

    public Vote() {
    }

    public Vote(Integer userId, Integer restaurantId, LocalDate date) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.date = date;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
