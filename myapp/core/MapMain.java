package myapp.core;

import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class MapMain {
    public static void main(String[] args) {

        BankAccount fred = new BankAccount("fred");
        BankAccount barney = new BankAccount("barney");
        BankAccount wilma = new BankAccount("wilma");
        BankAccount betty = new BankAccount("betty");

        // Create a simple Map
        Map<String, BankAccount> accts = new HashMap<>();
        accts.put(fred.getAccountName(), fred);
        accts.put(barney.getAccountName(), barney);
        accts.put(wilma.getAccountName(), wilma);
        accts.put(betty.getAccountName(), betty);

        System.out.printf("size: %d\n", accts.size());
        System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountName()));
        System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

        Set<String> keys = accts.keySet();
        Collection<BankAccount> values = accts.values();

        BankAccount acct;
        for (String acctId: keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s, name = %s\n", acctId, acct.getAccountName());
        }
    }
}

