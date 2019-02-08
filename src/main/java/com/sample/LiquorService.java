package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kasun on 5/24/17.
 */
public class LiquorService {

    public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Cavalinho branco");
            brands.add(("Cachaça"));

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Ipioca");
            brands.add("Do seu zé");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corete");

        }else {
            brands.add("Não temos");
        }
        return brands;
    }
}