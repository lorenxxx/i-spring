package com.us.improve.spring.conditional;

/**
 * Created by Loren on 2018/10/30.
 */
public class MacListService implements ListService {

    @Override
    public String showListCmd() {
        return "ll";
    }

}
