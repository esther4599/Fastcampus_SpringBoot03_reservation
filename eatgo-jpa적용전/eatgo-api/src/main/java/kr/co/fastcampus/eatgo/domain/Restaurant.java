package kr.co.fastcampus.eatgo.domain;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Restaurant {

    private Long id;
    private String name;
    private String address;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){ return address; }

    public String getInformation() {
        return name + " in " + address;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getId() { return id; }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void setMenuItem(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems){
            addMenuItem(menuItem);
        }
    }
}
