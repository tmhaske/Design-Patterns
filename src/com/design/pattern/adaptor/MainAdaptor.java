package com.design.pattern.adaptor;

public class MainAdaptor {
    public static void main(String[] args) {
         Xpay xpay = new XpayImpl();
         xpay.setCVVNo(123);
         xpay.setAmount(1000.00);
         xpay.setCustomerName("Xpay Dummy Customer");
         xpay.setCreditCardNo("1234-2345-3456-4567");

         PayD payd = new XpayToPayDAdapter(xpay);

        System.out.println("CVV :: "+payd.getCVVNo());
        System.out.println("Amount :: "+payd.getTotalAmount());
        System.out.println("Customer Name :: "+payd.getCardOwnerName());
        System.out.println("Card No :: "+payd.getCustCardNo());
    }
}
