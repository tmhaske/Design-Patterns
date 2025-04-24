package com.design.pattern.adaptor;

/**
 * This is 
 */
public class XpayImpl implements Xpay {

    private String creditCardNo;
    private String customerName;
    private Integer cardCVVNo;
    private Double amount;

    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    @Override
    public String getCustomerName() {
        return customerName;
    }
    @Override
    public Integer getCVVNo() {
        return cardCVVNo;
    }
    @Override
    public Double getAmount() {
        return amount;
    }
    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    @Override
    public void setCVVNo(Integer cvvNo) {
        this.cardCVVNo = cvvNo;
    }
    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
