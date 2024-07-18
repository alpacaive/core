package alpacaive.core.discount;

import alpacaive.core.member.Grade;
import alpacaive.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountFolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }
        return 0;
    }
}
