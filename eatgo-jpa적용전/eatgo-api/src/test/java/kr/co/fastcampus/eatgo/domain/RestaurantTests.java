package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");
        Assertions.assertEquals(1004L, restaurant.getId());
        Assertions.assertEquals("Bob zip", restaurant.getName());
        Assertions.assertEquals("Seoul", restaurant.getAddress());
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");
        Assertions.assertEquals("Bob zip in Seoul", restaurant.getInformation());
    }
}