package com.thinrain.pojo;

public class Card {
    private Integer cardNo;

    public Integer getCardNo() {
        return cardNo;
    }

    public void setCardNo(Integer cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNo=" + cardNo +
                '}';
    }
}
