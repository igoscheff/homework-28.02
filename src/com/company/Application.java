package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Application {

/*

    Первое задание.

    IntSupplier suppler = () -> 3;
    Consumer<String> consumer = System.out::println;
    BiPredicate<Integer, Integer> predicate = (x, y) -> x % 2 == 0 && y % 2 == 0;
    DoubleUnaryOperator duo = Math::sin;
    Function<Double, String> toString = (x) -> String.valueOf(x);

*/

    public static void main(String[] args) {
        //Второе задание.

        Account account1 = new Account("001", 0, true);
        Account account2 = new Account("002", 1000, false);
        Account account3 = new Account("003", 20000, true);
        Account account4 = new Account("004", 500000, false);
        Account account5 = new Account("005", 1000000, true);

        List<Account> accountList = Arrays.asList(account1,account2,account3,account4,account5);

        Predicate<Account> notZeroBalance = account -> account.getBalance() > 0;

        Predicate<Account> isBalancePositive = account -> account.getBalance() > 100000;
        Predicate<Account> isLocked = account -> account.isLocked() == false;

        Predicate<Account> balanceGreaterAndNotLocked = isBalancePositive.and(isLocked);

        AccFilter filter = new AccFilter();
        List<Account> filteredList1 = filter.filter(accountList, notZeroBalance);
        List<Account> filteredList2 = filter.filter(accountList, balanceGreaterAndNotLocked);

        System.out.println("Accounts with not zero balance:");
        filteredList1.forEach(account -> System.out.println("Account " + account.getNumber()));
        System.out.println();
        System.out.println("Accounts greeter 100000 and not locked:");
        filteredList2.forEach(account -> System.out.println("Account " + account.getNumber()));

    }
}

