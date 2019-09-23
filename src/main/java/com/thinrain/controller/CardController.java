package com.thinrain.controller;

import com.thinrain.pojo.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 卡牌Restful
 */

@Controller
@RequestMapping("/card")
public class CardController {

    @RequestMapping("/cardForm")
    public String cardForm() {
        System.out.println("卡牌管理");
        return "cardForm";
    }
    //根据cardNo查询card
    @GetMapping("/{cardNo}")
    @ResponseBody
    public Card getCard(@PathVariable Integer cardNo) {
        System.out.println("get cardNo " + cardNo);
        Card card = new Card();
        card.setCardNo(cardNo);
        return card;
    }

    //根据cardNo删除card
    @DeleteMapping("/{cardNo}")
    @ResponseBody
    public Card delCard(@PathVariable Integer cardNo) {
        System.out.println("post add card " + cardNo);
        Card card = new Card();
        card.setCardNo(cardNo);
        return card;
    }

    //增加card
    @PostMapping("/addCard")
    @ResponseBody
    public Card addCard(Card card) {
        System.out.println("addCard:" + card.getCardNo());
        return card;
    }

    //更新card
    @RequestMapping(value = "/updateCard", method = RequestMethod.PUT)
    @ResponseBody
    public Card updateCard(Card card) {
        System.out.println("updateCard:" + card);
        return card;
    }
}
