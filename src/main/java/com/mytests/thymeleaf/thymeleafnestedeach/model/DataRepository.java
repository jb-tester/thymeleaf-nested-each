package com.mytests.thymeleaf.thymeleafnestedeach.model;

import com.mytests.thymeleaf.thymeleafnestedeach.model.MyData;
import com.mytests.thymeleaf.thymeleafnestedeach.model.MyElement;
import com.mytests.thymeleaf.thymeleafnestedeach.model.MyProperty;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * <p>Created by irina on 3/31/2023.</p>
 * <p>Project: thymeleaf-nested-each</p>
 * *
 */
@Repository
public class DataRepository {

    public List<MyData> getAllData(){
        List<MyData> dataList = new ArrayList<>();
        List<MyElement> elementList1 = new ArrayList<>();
        List<MyElement> elementList2 = new ArrayList<>();
        List<MyProperty> propertyList1 = new ArrayList<>();
        List<MyProperty> propertyList2 = new ArrayList<>();
        List<MyProperty> propertyList3 = new ArrayList<>();
        List<MyProperty> propertyList4 = new ArrayList<>();
        propertyList1.add(new MyProperty("p11","v11"));
        propertyList1.add(new MyProperty("p12","v12"));
        propertyList1.add(new MyProperty("p13","v13"));
        propertyList2.add(new MyProperty("p21","v21"));
        propertyList2.add(new MyProperty("p22","v22"));
        propertyList2.add(new MyProperty("p23","v23"));
        propertyList3.add(new MyProperty("p31","v31"));
        propertyList3.add(new MyProperty("p32","v32"));
        propertyList3.add(new MyProperty("p33","v33"));
        propertyList4.add(new MyProperty("p41","v41"));
        propertyList4.add(new MyProperty("p42","v42"));
        propertyList4.add(new MyProperty("p43","v43"));
        elementList1.add(new MyElement("el1",propertyList1));
        elementList1.add(new MyElement("el2",propertyList2));
        elementList2.add(new MyElement("el3",propertyList3));
        elementList2.add(new MyElement("el4",propertyList4));
        dataList.add(new MyData("data1", elementList1));
        dataList.add(new MyData("data2", elementList2));
        return dataList;
    }
}
