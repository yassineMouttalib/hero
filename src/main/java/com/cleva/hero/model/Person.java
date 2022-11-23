package com.cleva.hero.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "(" +x + "," + y + ')';
    }

}
