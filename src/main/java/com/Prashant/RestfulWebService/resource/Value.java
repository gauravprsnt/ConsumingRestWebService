package com.Prashant.RestfulWebService.resource;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Value {
    private Long id;
    private String quote;

    public Value(){

    }

    @Override
    public String toString() {
        return "Value{"+"id="+id+"" +
                ",quote='"+quote+'\''+'}';
    }
}
