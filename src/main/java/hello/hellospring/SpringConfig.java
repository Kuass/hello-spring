package hello.hellospring;

import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {
/*
    private EntityManager em;
    private DataSource dataSource;*/
    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*  @Autowired
        public SpringConfig(DataSource dataSource, EntityManager em) {
            this.dataSource = dataSource;
            this.em = em;
        }
    */
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

 /*   @Bean
    public MemberRepository memberRepository() {
//        return new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
    }*/
}
