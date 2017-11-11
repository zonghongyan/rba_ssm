package com.rba.service;

import com.rba.mybatis.model.Person;
import com.rba.results.AddPersonResult;

import java.util.List;

/**
 * Created by 仁伯安 on 2017/11/8.
 */

public interface PersonService {


    Person getById(long id);

    List<Person> getListByName(String name);

    AddPersonResult addPerson(Person person);
}
