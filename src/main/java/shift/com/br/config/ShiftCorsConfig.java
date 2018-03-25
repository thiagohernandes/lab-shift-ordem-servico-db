package shift.com.br.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/** 
 * Habilitando CORS para acesso de aplicação front-end
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Configuration
@EnableWebMvc
public class ShiftCorsConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
	registry.addMapping("/api/**")
	.allowedOrigins("http://localhost:4200","http://localhost:8080")
	.allowedMethods("*")
	.allowedHeaders("*")
	.allowCredentials(false)
	.maxAge(3600);
	}
}