package com.pluralsight;

import java.math.BigDecimal;

public class FamilyMembership extends Membership{
    private int extraMembers;

    public FamilyMembership(String memberName, int months, BigDecimal baseRate, int extraMembers) {
        super(memberName, months, baseRate);
        this.extraMembers = extraMembers;
    }

    public int getExtraMembers() {
        return extraMembers;
    }

    public void setExtraMembers(int extraMembers) {
        this.extraMembers = extraMembers;
    }
    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal price = getBaseRate().add(new BigDecimal("12.50").multiply(new BigDecimal(extraMembers)));
        if (extraMembers >= 3) {
            price = price.multiply(new BigDecimal("0.90"));
        }
        return price;
    }

    @Override
    public String toString() {
        return "Family | " + getMemberName() + " | " + getMonths() + " months | extra members: " + extraMembers;
    }
}
