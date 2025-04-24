package com.design.pattern.adaptor;

/**
 * This Interface is from party 2 having below methods
 */
public interface PayD {
    public String getCustCardNo();
    public String getCardOwnerName();
    public Integer getCVVNo();
    public Double getTotalAmount();
    public void setCustCardNo(String custCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCVVNo(Integer cVVNo);
    public void setTotalAmount(Double totalAmount);
}
