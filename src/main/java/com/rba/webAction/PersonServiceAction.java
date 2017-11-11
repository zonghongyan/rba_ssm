package com.rba.webAction;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rba.basebeans.BaseResult;
import com.rba.basebeans.BaseResultEnum;
import com.rba.mybatis.model.Person;
import com.rba.results.AddPersonResult;
import com.rba.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 仁伯安 on 2017/11/8.
 */
@Controller
public class PersonServiceAction {

    @Autowired
    PersonService personService;


    @RequestMapping(value = "person.html", produces ="text/html;charset=UTF-8")
    public String getUserInfoById(Model model, long id){

        Person person = personService.getById(id);
        model.addAttribute("personInfo", person);

        return "person";
    }


    @RequestMapping(value = "personlist.html", produces ="text/html;charset=UTF-8")
    public String getUserInfoByUserName(Model model, String name){

        List<Person> list = personService.getListByName(name);
        model.addAttribute("personlist", list);

        return "personList";
    }


    @RequestMapping(value = "addperson.json")
    public @ResponseBody String addPerson(Model model, Person person){

        AddPersonResult addPersonResult = null;
        Gson gson = new GsonBuilder().create();
        if (StringUtils.isEmpty(person.getId())){
            addPersonResult = this.idIsNullResult();
            return gson.toJson(addPersonResult);
        }
        addPersonResult = personService.addPerson(person);

        return gson.toJson(addPersonResult);
    }

    /**
     * 判断手机号是否为空
     */
    private AddPersonResult idIsNullResult() {
        AddPersonResult result = new AddPersonResult();
        result.setCode(BaseResultEnum.ERROR.getId());
        result.setMessage("id为空");
//        result.setPerson(null);
        return result;
    }

}
