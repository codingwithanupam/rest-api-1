package com.bookticket.swagger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;


@Configuration
public class SwaggerConfig {
	List<Server> serverList= Arrays.asList(new Server().url("http://localhost:8080/").description("dev server"),new Server().url("www.abc.com/").description("prod server"));
	@Bean
	public OpenAPI getOpenApiSwager() {
		 return new OpenAPI().
		  info(new Info()
				  .title("E-rail-system")
				   .version("1.0.0")
				    .description("E-Rrail-System project")
			   ).servers(serverList)
		         .tags(Arrays
		        		 .asList(
		        				 new Tag().name("ticket-apis"),
		        				 new Tag().name("public-apis-erail")
		        				 )
                         );
		  
	}

}
