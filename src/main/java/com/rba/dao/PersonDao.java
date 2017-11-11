package com.rba.dao;

import com.rba.mybatis.model.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 仁伯安 on 2017/11/8.
 */
public interface PersonDao {

    Person queryById(long personId);

    List<Person> queryByName(@Param("name") String name);

    void addPerson(Person person);
}
