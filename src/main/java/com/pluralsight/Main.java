package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Gym Memberships =====");
        Membership henry = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.println(henry.getMemberName() + ", " + henry.getMonths() + " months, $" + henry.getMonthlyPrice() + " per month");

        BasicMembership alice = new BasicMembership("Alice Johnson", 6, new BigDecimal("30.00"), true);
        BasicMembership bob = new BasicMembership("Bob Smith", 2, new BigDecimal("27.50"), false);
        System.out.println(alice.getMemberName() + ", " + alice.getMonths() + " months, $" + alice.getMonthlyPrice() + " per month");
        System.out.println(bob.getMemberName() + ", " + bob.getMonths() + " months, $" + bob.getMonthlyPrice() + " per month");

        PremiumMembership carol = new PremiumMembership("Carol White", 12, new BigDecimal("30.00"), 2);
        PremiumMembership frank = new PremiumMembership("Frank Miller", 3, new BigDecimal("30.00"), 0);
        System.out.println(carol.getMemberName() + ", " + carol.getMonths() + " months, $" + carol.getMonthlyPrice() + " per month");
        System.out.println(frank.getMemberName() + ", " + frank.getMonths() + " months, $" + frank.getMonthlyPrice() + " per month");

        FamilyMembership grace = new FamilyMembership("Grace Lee", 12, new BigDecimal("30.00"), 3);
        FamilyMembership emma = new FamilyMembership("Emma Wilson", 6, new BigDecimal("30.00"), 1);
        System.out.println(grace.getMemberName() + ", " + grace.getMonths() + " months, $" + grace.getMonthlyPrice() + " per month");
        System.out.println(emma.getMemberName() + ", " + emma.getMonths() + " months, $" + emma.getMonthlyPrice() + " per month");

        System.out.println("===== Guest passes =====");
        carol.useGuestPass();
        carol.useGuestPass();
        carol.useGuestPass();
        frank.useGuestPass();


    }
}
