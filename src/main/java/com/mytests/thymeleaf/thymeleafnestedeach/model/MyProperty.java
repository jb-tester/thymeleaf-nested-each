package com.mytests.thymeleaf.thymeleafnestedeach.model;

/**
 * *
 * <p>Created by irina on 3/31/2023.</p>
 * <p>Project: thymeleaf-nested-each</p>
 * *
 */
public class MyProperty {
    String pname;
    String pvalue;

    public MyProperty(String pname, String pvalue) {
        this.pname = pname;
        this.pvalue = pvalue;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPvalue() {
        return pvalue;
    }

    public void setPvalue(String pvalue) {
        this.pvalue = pvalue;
    }
}
