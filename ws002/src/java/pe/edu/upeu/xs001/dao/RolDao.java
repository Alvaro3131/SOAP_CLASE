/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.xs001.dao;

import java.util.List;
import pe.edu.upeu.xs001.model.Rol;

/**
 *
 * @author alvar
 */
public interface RolDao {
    int create(Rol rol);
    int update(Rol rol);
    int delete(int id);
    Rol read(int id);
    List<Rol> readAll();
    
}
