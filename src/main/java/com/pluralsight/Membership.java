package com.pluralsight;

import java.math.BigDecimal;

public abstract class Membership {
    private String memberName;
    private int months;
    private BigDecimal baseRate;

    public Membership(String memberName, int months, BigDecimal baseRate) {
        this.memberName = memberName;
        this.months = months;
        this.baseRate = baseRate;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String membership) {
        memberName = membership;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public BigDecimal getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(BigDecimal baseRate) {
        this.baseRate = baseRate;
    }
    // retuns monthly price
    public abstract BigDecimal getMonthlyPrice();

    @Override
    public String toString() {
        return "Membership | " + memberName + " | " + months + " months";
    }

    public BigDecimal getSignUpFee() {

        return new BigDecimal("49.00");
    }

    public BigDecimal getContractTotal() {
        return getMonthlyPrice().multiply(new BigDecimal(months)).add(getSignUpFee());

    }
}
