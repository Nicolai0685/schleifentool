/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ELschleifentool.util;

/**
 *
 * @author nico
 * @param <T>
 */
public interface Callback<T extends Object> {

    public void accept(T t);
}