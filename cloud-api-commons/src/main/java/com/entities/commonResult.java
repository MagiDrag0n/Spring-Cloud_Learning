package com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class commonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public commonResult(Integer code,String message){
        this(code,message,null);
    }
}
