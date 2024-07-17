package org.example;

import java.util.HashMap;
import java.util.*;

public class DataStore implements Transactions {

    Map<String,Value<?>> redisDb = new HashMap<>();

    public DataStore()
    {

    }

    DataStore(String key, String val){
        setDataRedis(key,val);
    };

    <T> void setDataRedis(String key, T value)
    {
        Value<T> val = new Value<>(value);
        redisDb.put(key,val);
    }

    public Value getDataRedis(String key)
    {
        if(redisDb.containsKey(key)) {
            Value<?> val = redisDb.get(key);
            return val;
            //return r;
        }
      //  return "key not found";
    }
    //get,set,delete

    boolean deleteData(String key)
    {
        if(redisDb.containsKey(key))
        {
            redisDb.remove(key);
            return  true;
        }
        else
            return false;
    }
}

/*
inferface Transactions
{
  void begin();
  void commit();
  void rollback;

 */