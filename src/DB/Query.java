/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author khoirul-06990
 */
abstract class Query {
    
    abstract int Insert(String sql);
    abstract int Delete(String sql);
    abstract int Update(String sql);
}
