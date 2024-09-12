package com.ota.exam.notes_api;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

// import springfox.documentation.builders.PathSelectors; 
// import springfox.documentation.builders.RequestHandlerSelectors; 
// import springfox.documentation.spi.DocumentationType; 
// import springfox.documentation.spring.web.plugins.Docket; 
  
@Configuration
//@EnableWebMvc
public class NotesApiConfig { 
   
//   @Bean
//    public Docket api() { 
//        return new Docket(DocumentationType.SWAGGER_2) 
//                .select() 
//                .apis(RequestHandlerSelectors.any()) 
//                .paths(PathSelectors.any()) 
//                .build(); 
//    }
  @Bean
      public OpenAPI apiInfo() {
          return new OpenAPI().info(new Info().title("后端接口文档").version("1.0.0"));
      }

      @Bean
      public GroupedOpenApi httpApi() {
          return GroupedOpenApi.builder()
                  .group("http")
                  .pathsToMatch("/**")
                  .build();
      }
}