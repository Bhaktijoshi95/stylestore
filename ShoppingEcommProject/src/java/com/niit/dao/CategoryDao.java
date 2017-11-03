/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.dao;

import com.niit.domain.Category;
import java.util.List;

/**
 *
 * @author Mohammed Shahrukh
 */
public interface CategoryDao {
    void save(Category u);
    void delete(Category u);
    List<Category> list();
    void update();
     List<Category> listByName(String name );
}
