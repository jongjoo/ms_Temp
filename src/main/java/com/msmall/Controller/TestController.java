package com.msmall.controller;

import com.msmall.dto.Member;
import com.msmall.service.TestService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import javax.transaction.Transactional;


@RestController
@RequestMapping("/Test/*")
public class TestController {

    @PersistenceContext
    EntityManager entityManager;

    TestService testService;

    @RequestMapping("/hello")
    public String TestHello(){
        return "Hello In Controller";
    }

    @Transactional
    @RequestMapping("/serv")
    public String serv(){
        //엔티티 매니저 팩토리 생성

//        String id = "id1";
//        Member findMember = entityManager.find(Member.class, id);

//        entityManager.persist();
//        testService.logic(entityManager);  //비즈니스 로직


        String id = "id1";
        Member member = new Member();
        member.setId(id);
        member.setUsername("지한");
        member.setAge(2);

        //등록

//        EntityTransaction tx = entityManager.getTransaction();
//        tx.begin();
        entityManager.persist(member);
//        tx.commit();

        //수정
//        member.setAge(20);

        return "Hello In Controller ";
    }
}
