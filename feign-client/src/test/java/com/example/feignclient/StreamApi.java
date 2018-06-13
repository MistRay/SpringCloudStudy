package com.example.feignclient;

import com.example.feignclient.domain.Human;
import com.google.gson.JsonObject;
import org.json.JSONObject;
import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author MistLight
 * @create 2018-04-10 9:45
 * @desc StreamApiTest
 */
public class StreamApi {

    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("a", "10", "man"));
        humanList.add(new Human("b", "11", "man"));
        humanList.add(new Human("c", "12", "man"));

        /**
         * 使用lambda表达式执行foreach
         */
        humanList.forEach(e ->{
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println(e.getSex());
                }
        );

    }

    /**
     * 使用lambda表达式表示匿名内部类
     */
    @Test
    public void listSortTest() throws  Exception{
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("a", "10", "man"));
        humanList.add(new Human("b", "11", "man"));
        humanList.add(new Human("c", "12", "man"));

        // lambda表达式的两种使用方式
        humanList.sort((e1,e2) -> e1.getAge().compareTo(e2.getAge()));
        humanList.sort(Comparator.comparing(Human::getAge));
        // 使用
    }

    /**
     * 使用lambda表达式表示foreach的两种方式
     */
    @Test
    public void forechTest(){
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("a", "10", "man"));
        humanList.add(new Human("b", "11", "man"));
        humanList.add(new Human("c", "12", "man"));
        // foreach的两种写法
        humanList.forEach(e-> System.out.println(e.getName()));
        humanList.forEach(System.out::println);
    }

    /**
     * 测试Optional对象
     */
    @Test
    public void optionalTest(){
        // 创建一个空的optional
        Optional<Object> optional = Optional.empty();
        System.out.println(optional);
        // 创建一个非空的optional对象
        Human human = new Human("a", "10", "man");
        Optional<Human> humanOptional = Optional.of(human);
        System.out.println(humanOptional);
        // 判断对象是否存在
        System.out.println(humanOptional.isPresent());
        System.out.println(optional.isPresent());

    }

    /**
     * 测试intStream
     */
    @Test
    public void intStreamTest(){
        IntStream.range(0,10).forEach(e -> {
            System.out.println(e);
        });
        System.out.println(IntStream.range(0,10).sum());
    }


    /**
     * 测试Stream(排序)
     */
    @Test
    public void StreamTest(){
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("j", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        unsortMap.entrySet().stream().forEach(x-> System.out.println(x.getKey()+x.getValue()));
        // 定义LinkedHashMap接收数据
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // 使用并行parallelStream,提升效率
        unsortMap.entrySet().parallelStream()
                .sorted((a,b) -> (a.getValue()).compareTo(b.getValue()))
                .forEachOrdered(x -> linkedHashMap.put(x.getKey(),x.getValue()));
        System.out.println(linkedHashMap);

    }

    /**
     * stream处理list里的json数据
     */
    @Test
    public void jsonInListTest() throws  Exception{
        List<Object> list = new ArrayList<>();
        JSONObject data1 = new JSONObject();
        data1.put("type", "支出");
        data1.put("money", 500);
        JSONObject data2 = new JSONObject();
        data2.put("type", "收入");
        data2.put("money", 1000);
        JSONObject data3 = new JSONObject();
        data3.put("type", "借贷");
        data3.put("money", 100);
        list.add(data1);
        list.add(data2);
        list.add(data3);

        //按money来排列json


    }



}
