package com.design.pattern.adaptor;

/**
 * This Interface is from party 1 having below methods
 */

public interface Xpay {
    public String getCreditCardNo();
    public String getCustomerName();
    public Integer getCVVNo();
    public Double getAmount();
    public void setCreditCardNo(String creditCardNo);
    public void setCustomerName(String customerName);
    public void setCVVNo(Integer cvvNo);
    public void setAmount(Double amount);

}
