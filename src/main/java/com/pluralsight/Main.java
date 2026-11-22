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
    }
}
