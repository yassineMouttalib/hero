package com.cleva.hero;

import com.cleva.hero.common.Constants;
import com.cleva.hero.common.Utils;
import com.cleva.hero.model.Carte;
import com.cleva.hero.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Commands implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
       List<String> test1 = Utils.readFile(Constants.TEST1);
       String expectedTest1 = test1.get(0);
       int x1= Character.getNumericValue(test1.get(0).charAt(0));
       int y1= Character.getNumericValue(test1.get(0).charAt(2));
        Person person = new Person(x1,y1);
        Carte carte = new Carte(person);
        carte.walkPerson(test1.get(1));
        System.out.println(person);
    }
}
