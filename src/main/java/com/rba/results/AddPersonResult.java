package com.rba.results;

import com.rba.basebeans.BaseResult;
import com.rba.mybatis.model.Person;

/**
 * Created by 仁伯安 on 2017/11/11.
 */
public class AddPersonResult extends BaseResult{

    public AddPersonResult() {
    }

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
