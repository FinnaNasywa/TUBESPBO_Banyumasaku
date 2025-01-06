/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import banyumasakuu.Ulasan;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface UlasanInter {

    void addUlasan(Ulasan ulasan);

    List<Ulasan> showUlasan(int idKuliner);
}
