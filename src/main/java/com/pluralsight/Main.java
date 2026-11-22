package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Gym Memberships =====");
        Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
        PremiumMembership carol = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);
        PremiumMembership frank = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);
        FamilyMembership grace = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3);
        FamilyMembership emma = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1);

        ArrayList<Membership> memberships = new ArrayList<>();
        memberships.add(henry);
        memberships.add(alice);
        memberships.add(bob);
        memberships.add(carol);
        memberships.add(frank);
        memberships.add(grace);
        memberships.add(emma);
        BigDecimal monthlyIncome = BigDecimal.ZERO;
        BigDecimal allContracts = BigDecimal.ZERO;
        for (Membership membership : memberships) {
            System.out.println(membership);
            printCosts(membership);
            monthlyIncome = monthlyIncome.add(membership.getMonthlyPrice());
            allContracts = allContracts.add(membership.getContractTotal());

        }
        System.out.println("--- Totals ---");
        System.out.println("Memberships: " + memberships.size());
        System.out.println("Monthly income: $" + monthlyIncome);
        System.out.println("All contracts: $" + allContracts);


    }

    public static void printCosts(Membership membership) {
        System.out.println("  Monthly price: $" + membership.getMonthlyPrice() + ", sign-up fee: $" + membership.getSignUpFee() + ", contract total: $" + membership.getContractTotal());
    }
}
