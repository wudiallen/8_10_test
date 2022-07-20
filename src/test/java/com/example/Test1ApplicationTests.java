package com.example;

import com.People;
import com.TestInterfave;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootTest
class Test1ApplicationTests {

    @Test
    void contextLoads() {
        Object o = Proxy.newProxyInstance(com.Test.class.getClassLoader(), TestInterfave.class.getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });
        People p1 = new People("小明", "18");
        People p21 = new People("胡歌", "32");
        People p22 = new People("胡歌", "32");
        People p31 = new People("彭于晏", "25");
        People p32 = new People("彭于晏", "25");
        People p4 = new People("张三", "34");
        List<People> list1 = new ArrayList<>();
        List<People> list2 = new ArrayList<>();
        list1.add(p1);
        list1.add(p21);
        list2.add(p22);
        list1.add(p31);
        list2.add(p32);
        list2.add(p4);

        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        list1.forEach(e -> list3.add(JSON.toJSONString(e)));
        list2.forEach(e -> list4.add(JSON.toJSONString(e)));

        System.out.println("并集");
        System.out.println(CollectionUtils.union(list1, list2).toString());
        System.out.println(CollectionUtils.union(list1, list2).toString());
        System.out.println("交集");
        System.out.println(CollectionUtils.intersection(list1, list2).toString());
        System.out.println("交集的补集");
        System.out.println(CollectionUtils.disjunction(list1, list2).toString());
        System.out.println("差集list1为主");
        System.out.println(CollectionUtils.subtract(list1, list2).toString());
        System.out.println("差集list2为主");
        System.out.println(CollectionUtils.subtract(list2, list1).toString());

        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("并集");
        Collection<String> union = CollectionUtils.union(list3, list4);
        System.out.println(union);
        System.out.println(union.toString());
        System.out.println(JSONArray.parseArray(union.toString(), People.class));

        System.out.println("交集");
        Collection<String> intersection = CollectionUtils.intersection(list3, list4);
        System.out.println(intersection);
        System.out.println(intersection.toString());
        System.out.println(JSONArray.parseArray(intersection.toString(), People.class));
        System.out.println("交集的补集");
        Collection<String> disjunction = CollectionUtils.disjunction(list3, list4);
        System.out.println(disjunction);
        System.out.println(disjunction.toString());
        System.out.println(JSONArray.parseArray(disjunction.toString(), People.class));
        System.out.println("差集list3为主");
        Collection<String> subtract1 = CollectionUtils.subtract(list3, list4);
        System.out.println(subtract1);
        System.out.println(subtract1.toString());
        System.out.println(JSONArray.parseArray(subtract1.toString(), People.class));
        System.out.println("差集list4为主");
        Collection<String> subtract = CollectionUtils.subtract(list4, list3);
        System.out.println(subtract);
        System.out.println(subtract.toString());
        System.out.println(JSONArray.parseArray(subtract.toString(), People.class));

    }

    @Test
    void t1() {
        List<Integer> list = new ArrayList<>();
        System.out.println(list);
        List<Integer> list1 = new ArrayList<>();
        list.addAll(list1);
        System.out.println(list);
    }

    @Test
    void t2() {
        People people = new People("小王", "19");
        People people1 = new People(people.getName(), people.getAge());

        People innerPeople = new People("小王", "19");
        System.out.println(people);
        System.out.println(people1);

        people.setAge("修改");

        System.out.println(people);
        System.out.println(people1);

    }

    @Test
    void t() {
        List<People> list = new ArrayList<>();
        People people = new People("复制1","19","男");
        People people1 = new People("复制2","23","女");
        People people2 = new People("复制3","31","男");
        list.add(people);
        list.add(people1);
        list.add(people2);
        System.out.println(list);



    }
}
