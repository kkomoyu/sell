package com.lwm.service;

import com.lwm.bean.ProductCategory;

import java.util.List;

/**
 * @ Author guya
 * @ Date 2019/8/30
 * @ Description:
 */
public interface CategoryService {

   ProductCategory fingOne(String categoryIdd);
   List <ProductCategory> findAll();

}