/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeling;

import java.sql.ResultSet;

/**
 *
 * @author radwa
 */
public interface Database_Operation {

    /**
     *
     * @param Query
     * @param fname
     * @param lname
     * @param email
     * @param password
     * @param checking
     * @return
     */
    public abstract boolean employee_data (String Query,String fname,String lname , String email,String password,boolean checking);
}
