package kot.mybatis.kotmybatis.config;


import kot.bootstarter.kotmybatis.common.id.IdGenerator;
import org.apache.commons.lang3.RandomUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "kot.mybatis.kotmybatis.biz.mapper")
public class KotConfig {

    @Bean("idGenerator")
    public IdGenerator idGenerator() {
        return RandomUtils::nextLong;
    }
}
