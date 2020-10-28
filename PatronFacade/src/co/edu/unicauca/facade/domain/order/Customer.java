/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.facade.domain.order;

/**
 * representa un cliente
 * @author Edynson Muñoz Jimenez, Juan Camilo Gonzales Mulato
 */
public class Customer {
    /**
     * identificador del cliente
     */
    private int id;
    /**
     * nombre del cliente
     */
    private String name;
    /**
     * direccion del cliente
     */
    private String address;
    /**
     * telefono mobile del cliente, numero
     */
    private String mobile;
    /**
     * ciudad en la que habita
     */
    private String city;
    /**
     * constructor por defecto
     */
    public Customer() {
    }
    //SET AND GET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
}
