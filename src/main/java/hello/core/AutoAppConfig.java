package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
    // 스프링 빈에 컴포넌트 스캔으로 등록을 했는데 또 수동으로 등록해서 오류남 -> 주석 처리
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository MemoryMemberRepository(){
//        return new MemoryMemberRepository();
//    }
}
