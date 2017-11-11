package com.rba.service.impl;

import com.rba.dao.PersonDao;
import com.rba.mybatis.model.Person;
import com.rba.results.AddPersonResult;
import com.rba.service.PersonService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 仁伯安 on 2017/11/8.
 */
@Service
public class PersonServiceImpl implements PersonService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonDao personDao;

    @Override
    public Person getById(long id) {
        Person person = null;
        try {
            person = personDao.queryById(id);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            e.getStackTrace();
        } finally {
        }
        return person;
    }

    @Override
    public List<Person> getListByName(String name) {

        List<Person> personList = null;
        try {
            personList = personDao.queryByName(name);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            // 所有编译期异常转换为运行期异常
            e.getStackTrace();
        } finally {
        }
        return personList;
    }

    @Override
    @Transactional
    public AddPersonResult addPerson(Person person) {

        AddPersonResult addPersonResult = new AddPersonResult();
        try {
            personDao.addPerson(person);
            addPersonResult.setMessage("添加成功");
            addPersonResult.setCode("200");
            addPersonResult.setPerson(person);
        } catch (Exception e) {

            addPersonResult.setMessage("添加失败");
            addPersonResult.setCode("500");
            addPersonResult.setPerson(person);

            logger.error(e.getMessage(), e);

            // 所有编译期异常转换为运行期异常
            e.getStackTrace();
        } finally {

        }

        return addPersonResult;
    }
}
