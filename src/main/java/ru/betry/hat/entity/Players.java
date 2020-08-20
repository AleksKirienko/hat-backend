package ru.betry.hat.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Players {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<Words> wordsList;

}
