package com.cleva.hero.model;

import com.cleva.hero.common.Constants;
import com.cleva.hero.common.Utils;
import com.cleva.hero.exception.NotAutorizeMoveException;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Carte {
    private List<String> lines = Utils.readFile(Constants.CARTE_FILE);
    private Person person;
    public Carte(Person person) {
        this.person = person;
    }

    public void walkPerson(String directions) throws NotAutorizeMoveException {
        for (int i=0;i<directions.length();i++) {
            goToDirection(person, directions.charAt(i));
        }
    }

    private void goToDirection(Person person, char d) throws NotAutorizeMoveException {
        int x =person.getX();
        int y =person.getY();
        switch (d) {
            case 'N' : if (--y >=0 && lines.get(y).charAt(x)!='#') { person.setY(y); break;}
            case 'S' :  if (++y < lines.size() && lines.get(y).charAt(x)!='#'){ person.setY(y); break;}
            case 'E' : if (++x < lines.get(y).length() && lines.get(y).charAt(x)!='#') { person.setX(x); break;}
            case 'O' : if (--x >=0  && lines.get(y).charAt(x)!='#') { person.setX(x); break;}
            default: throw new NotAutorizeMoveException("direction :"+d+" Not Allowed or Doesn't exist");
        }
    }

}
