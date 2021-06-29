package cn.cvzhanshi.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cVzhanshi
 * @create 2021-06-27 15:01
 */
@Configuration
public class MyRule {

    @Bean
    public IRule getRule(){
        return new MyRandomRule();
    }
}
