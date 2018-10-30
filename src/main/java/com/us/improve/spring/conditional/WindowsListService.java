package com.us.improve.spring.conditional;

/**
 * Created by Loren on 2018/10/30.
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
