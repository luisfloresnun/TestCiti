
package com.citi.cititest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.citi.cititest.conf.SwaggerConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
/**
 *
 * @author luis
 */

@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
        
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
               registry.addResourceHandler("swagger-ui.html")
                        .addResourceLocations("classpath:/META-INF/resources/");
        }
}
