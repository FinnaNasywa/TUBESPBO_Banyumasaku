/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import banyumasakuu.Kuliner;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface KulinerInter {

    void tambahKuliner(Kuliner kuliner);

    void updateKuliner(Kuliner kuliner, int kulinerId);

    void deleteKuliner(int kulinerId);

    List<Kuliner> showKuliner();

    Kuliner showKulinerById(int idKuliner);
}
