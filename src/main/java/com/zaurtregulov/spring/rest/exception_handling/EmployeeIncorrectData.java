package com.zaurtregulov.spring.rest.exception_handling;

import com.zaurtregulov.spring.rest.entity.Employee;

public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData(){}

    public String getInfo(){
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
