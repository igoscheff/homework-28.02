package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AccFilter {

    public List<Account> filter (List<Account> list, Predicate<Account> predicate) {
        List<Account> filteredList = new ArrayList<>();

        list.forEach(account -> {
            if(predicate.test(account) == true) {
                filteredList.add(account);
            }
        });

        return filteredList;
    }
}
