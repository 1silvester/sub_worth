package com.sub_worth.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@NoArgsConstructor
@Getter
public class HoursOnSub {
    // TODO Need to find a way to make this dynamic
    // TODO initial idea is to have an empty string and an int where a user can type in the name of the sub
    // and how long they want to spend on that sub
    //this might be the way i carryout the dynamic list, then create a hashmap of key(subs) value(how long they want to spend on it) pairs
//    private List<Subscript> subs;
    private int netflix;
    private int disneyplus;
    private int amazonprime;
    private int roku;
    private int cineworld;

}
