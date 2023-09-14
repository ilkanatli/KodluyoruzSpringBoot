package com.ilkanatli.bean;
import com.ilkanatli.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton") //proje ile başlayıp proje ile ölüyor
    // @Scope("requset") //sadece bir istek boyunca çalışıyor
    // @Scope("session") //bir oturum boyunca çalışan

    public BeanDto beanDto(){

        return BeanDto
                .builder()
                    .id(0L).beanName("bean Adi").beanData("bean Data")
                .build();
    }
}
