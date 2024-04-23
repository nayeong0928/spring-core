package hello.core.discount;

import hello.core.member.Member;

/**
 * The interface Discount policy.
 */
public interface DiscountPolicy  {

    /**
     * Discount int.
     *
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
