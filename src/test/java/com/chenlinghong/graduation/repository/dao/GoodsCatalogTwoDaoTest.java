package com.chenlinghong.graduation.repository.dao;


import com.chenlinghong.graduation.repository.domain.GoodsCatalogTwo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsCatalogTwoDaoTest {

    @Autowired
    private GoodsCatalogTwoDao catalogTwoDao;

    @Test
    public void insert() {
        GoodsCatalogTwo catalogTwo = new GoodsCatalogTwo("test1", 2);
        int result = catalogTwoDao.insert(catalogTwo);
        Assert.assertEquals(1, result);
        System.out.println(result);
    }

    @Test
    public void listByCatalogOne(){
        List<GoodsCatalogTwo> catalogTwoList = catalogTwoDao.listByCatalogOne(2,0,10);
        System.out.println(catalogTwoList);
    }

    @Test
    public void listByGoodsCatalogOneId(){
        int count = catalogTwoDao.countByCatalogOne(1);
        List<GoodsCatalogTwo> goodsCatalogTwos = catalogTwoDao.listByCatalogOne(1, 0, count);
        System.out.println(goodsCatalogTwos);
    }
}