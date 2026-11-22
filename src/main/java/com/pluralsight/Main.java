package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Gym Memberships =====");
        Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.println(henry);

        BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
        System.out.println(alice);
        System.out.println(bob);

        PremiumMembership carol = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);
        PremiumMembership frank = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);
        System.out.println(carol);
        System.out.println(frank);

        FamilyMembership grace = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3);
        FamilyMembership emma = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1);
        System.out.println(grace.getMemberName() + ", " + grace.getMonths() + " months, $" + grace.getMonthlyPrice() + " per month");
        System.out.println(emma.getMemberName() + ", " + emma.getMonths() + " months, $" + emma.getMonthlyPrice() + " per month");


        System.out.println("--- Guest passes ---");
        carol.useGuestPass();
        carol.useGuestPass();
        carol.useGuestPass();
        frank.useGuestPass();


        System.out.println("--- Sign-up fee and contract total ---");
        System.out.println(henry.getMemberName() + ": fee $" + henry.getSignUpFee() + ", total $" + henry.getContractTotal());
        System.out.println(carol.getMemberName() + ": fee $" + carol.getSignUpFee() + ", total $" + carol.getContractTotal());
        System.out.println(frank.getMemberName() + ": fee $" + frank.getSignUpFee() + ", total $" + frank.getContractTotal());
        System.out.println(grace.getMemberName() + ": fee $" + grace.getSignUpFee() + ", total $" + grace.getContractTotal());
    }
}
