package com.lwm.dao;

import com.lwm.bean.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @ Author guya
 * @ Date 2019/8/30
 * @ Description:
 */
@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {
}
