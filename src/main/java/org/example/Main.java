package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        DataStore db =new DataStore();
        db.setDataRedis("key1", "amit");
     //   db.setDataRedis("key2", 29);
        //String op2="";
        Value<String> s;
        Value<String> s = db.getDataRedis("key1");
        System.out.println(s.getData());
       // boolean b = db.deleteData("key1");
//        if(b==true) {
//            System.out.println(op1);
//        }



    }
}

/*

1. In-Memory Key Value (KV) Store

Design and implement an in-memory key value datastore. This datastore should be able to support some basic operations such as Get, Set and Delete for string keys and values.

I would like to see test cases as well as implementation code.

You can assume that the input operations are always valid, but the key to operate on may be non-existent. We won’t worry about concurrent access to the database. You can handle errors however you think is best.

Let’s start with the data structure of this key value store. Implement methods for Get, Set and Delete.

 */