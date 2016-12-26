package com.example;

import static springfox.documentation.builders.PathSelectors.regex;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class SwaggerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerdemoApplication.class, args);
	}	
	
    @Bean
    public Docket swaggerSpringMvcPlugin() {
    	Contact contact = new Contact("温宽如", "http://my.oschina.net/wangnian", "2251181679@qq.com");
        ApiInfo apiInfo = new ApiInfo("某API接口",//大标题
                "REST风格API",//小标题
                "0.1",//版本
                "www.baidu.com",
                contact,//作者
                "主页",//链接显示文字
                ""//网站链接
        );
        Docket docket = new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/user/.*")).build()
            .apiInfo(apiInfo).useDefaultResponseMessages(false);
        return docket;
    }
}
