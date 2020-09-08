package com.ev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableOpenApi  //开启Swagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                // 定义是否开启swagger，false为关闭，可以通过变量控制
                .enable(true)
                .groupName("EV")
                // 将api的元信息设置为包含在json ResourceListing响应中。
                .apiInfo(apiInfo())
                // 选择哪些接口作为swagger的doc发布
                .select()
                    .apis(RequestHandlerSelectors.any())  //basePackage("com.ev.controller"):指定要扫描的包
                    .paths(PathSelectors.any())  //ant("/ev/**"):指定要扫描的路径
                .build();
    }

    //自定义信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("EV的SwaggerAPI文档")
                .description("不忘初心，方得始终")
                .contact(new Contact("EV","https://ev98.github.io","1301493116@qq.com"))
                .version("v1.0")
                .build();
    }

}
