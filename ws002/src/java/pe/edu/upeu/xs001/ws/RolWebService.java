/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.xs001.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.xs001.dao.RolDao;
import pe.edu.upeu.xs001.daoImpl.RolDaoImpl;
import pe.edu.upeu.xs001.model.Rol;

/**
 *
 * @author alvar
 */
@WebService(serviceName = "RolwEBService")
public class RolWebService {
    RolDao rolDao=new RolDaoImpl();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") final int id) {
        //TODO write your implementation code here:
        return rolDao.delete(id);
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "readall")
    public List<Rol> readall() {
        //TODO write your implementation code here:
        return rolDao.readAll();
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return rolDao.update(new Rol(id,nombre));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertar")
    public int insertar(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return rolDao.create(new Rol(0,nombre));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "read")
    public Rol read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return rolDao.read(id);
    }

}
