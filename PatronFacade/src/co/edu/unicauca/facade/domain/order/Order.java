/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * representa...
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzalez Mulato
 */
public class Order {
    /**
     * cantidad de ...
     */
    private int despatch;
    /**
     * cliente
     */
    private Customer customer;
    /**
     * fecha
     */
    private LocalDate date;
    /**
     * estado de la orden
     */
    private State state;
    /**
     * lista de items "platos"
     */
    private List<Item> list;

    /**
     * constructor por defecto
     */
    public Order() {
    }

    /**
     * constructor parametrizado
     * @param customer cliente
     */
    public Order(Customer customer) {
        list = new ArrayList<Item>();
        this.customer = customer;
    }
    
    /**
     * agrega un nuevo item a la orden
     * @param dish plato.
     * @param amount cantidad de platos
     */
    public void addDish(Dish dish, int amount){
        Item auxiliar = new Item(dish, amount);
        list.add(auxiliar);
    }
    
    /**
     * AUN NO IMPLEMENTADO calcula el costo total de la orden
     * @return total de la orden.
     */
    public int calculateTotal(){
        return 0;
    }
    //SET AND GET
    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }
    
    
}
