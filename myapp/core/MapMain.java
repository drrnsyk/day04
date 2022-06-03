package myapp.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        names.add("fred");
        names.add("barney");
        names.add("wilma");
        names.add("betty");

        Map<String, BankAccount> accts = new HashMap<>();
        BankAccount acct = new BankAccount();

        for (int i = 0; i < names.size(); i++) {

            BankAccount acctId = new BankAccount();
            accts.put(acct.getAccountNumber(), acct);
        }

        
        // BankAccount barney = new BankAccount("barney");
        // BankAccount wilma = new BankAccount("wilma");
        // BankAccount betty = new BankAccount("betty");

        // create a simple map
        
        // accts.put(fred.getAccountNumber(), fred);
        // accts.put(barney.getAccountNumber(), barney);

        System.out.printf("the size of the map: %d\n" , accts.size());
        //System.out.printf("has fred account number: %b\n" , accts.containsKey(acctId.getAccountNumber()));

        Set<String> acctNums = accts.keySet();
        Collection<BankAccount> values = accts.values();

        
        //for each loop use to iterate collections and keys
        for (String acctId: acctNums) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s, name = %s\n" , acctId, acct.getAccountName());
        }




    }
}

