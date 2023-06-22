package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/random-quote")
    public String randomQuote(Model model) {
        String[] quotes = {
                "행복은 습관이다. 그것을 몸에 지니라. " +
                        "-허버드-",
                "고개 숙이지 마십시오. 세상을 똑바로 정면으로 " +
                        "바라보십시오. -헬렌 켈러-",
                "고난의 시기에 동요하지 않는 것, 이것은 진정 " +
                        "칭찬받을 만한 뛰어난 인물의 증거다. -베토벤-",
                "당신이 할 수 있다고 믿든 할 수 없다고 믿든 " +
                        "믿는 대로 될 것이다. -헨리 포드-",
                "작은 기회로부터 종종 위대한 업적이 시작된다. " +
                        "-데모스테네스-"
        };
        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "quote";
    }
}
