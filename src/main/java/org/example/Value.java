package org.example;

public class Value<T>{

    private T data;

//    Value()
//    {
//        this.data=data;
//    }

    public <T> Value(T value) {
        this.data=data;
    }

    public  T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data=data;
    }
}
