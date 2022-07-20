package com;

/**
 * @author songchao
 * @date 2022/6/17 8:31
 */
public class PeopleDTO {
    private String name;
    private String age;

    public PeopleDTO() {
    }


    public PeopleDTO(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
