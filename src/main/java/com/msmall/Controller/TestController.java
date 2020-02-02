package com.msmall.Controller;

import com.msmall.DTO.Member;
import com.msmall.Service.TestService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;


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

    @RequestMapping("/serv")
    public String serv(){
        //엔티티 매니저 팩토리 생성

        String id = "id1";
        Member findMember = entityManager.find(Member.class, id);

//        entityManager.persist();
//        testService.logic(entityManager);  //비즈니스 로직

        return "Hello In Controller ";
    }
}
