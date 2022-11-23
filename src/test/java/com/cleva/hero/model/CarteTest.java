package com.cleva.hero.model;

import com.cleva.hero.common.Constants;
import com.cleva.hero.common.Utils;
import com.cleva.hero.exception.NotAutorizeMoveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarteTest {

    @Test
    void walkPerson() throws NotAutorizeMoveException {
        List<String> test1 = Utils.readFile(Constants.TEST1);
        // couldn't test test2 because its throw exception because of provided card has '#' in position 6,9
        //List<String> test2 = Utils.readFile(Constants.TEST2);
        String expectedTest1 = "(9,2)";
        int x1= Character.getNumericValue(test1.get(0).charAt(0));
        int y1= Character.getNumericValue(test1.get(0).charAt(2));
        Person person = new Person(x1,y1);
        Carte carte = new Carte(person);
        carte.walkPerson(test1.get(1));

        Assertions.assertEquals(expectedTest1, person.toString());
    }
}