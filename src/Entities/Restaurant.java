package Entities;

import java.util.Objects;

public class Restaurant {
    private String password;
    public String restaurantName;
    private int posX;
    private int posY;

    public Restaurant(String username, String password, int posX, int posY) {
        this.setRestaurantName(username);
        this.setPassword(password);
        this.posX = posX;
        this.posY = posY;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return password.equals(that.password) && restaurantName.equals(that.restaurantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, restaurantName);
    }
}
