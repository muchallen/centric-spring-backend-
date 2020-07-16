package com.example.demo.config.Products;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//public class Config {
//    @Bean
//    public WebMvcConfigurer corsConfigure(){
//        return  new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedMethods("*")
//                        .allowedHeaders("*")
//                        .allowedOrigins("*");
//            }
//        };
//    }}
@Configuration
@EnableWebMvc
public class Config implements WebMvcConfigurer {


/*@Bean
public WebSecurityConfigurerAdapter webSecurity() {
return new WebSecurityConfigurerAdapter() {
@Override
protected void configure(HttpSecurity http) throws Exception {
http.headers().addHeaderWriter( new StaticHeadersWriter("Access-Control-Allow-Origin", "*"));
}
};
}*/

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*","POST")
                .maxAge(3600L)
                .allowedHeaders("*")
                .exposedHeaders("Authorization", "header1", "header2");

                //.allowCredentials(true);
    }
}