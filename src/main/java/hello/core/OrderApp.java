package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderSerivce = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.BASIC);
        memberService.join(member);

        Order order = orderSerivce.crateOrder(memberId,"itemA",10000);

        System.out.println("order = " + order);
    }
}
