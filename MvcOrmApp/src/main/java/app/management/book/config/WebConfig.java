package app.management.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import app.management.book.dao.BookDaoImpl;

@Configuration
@ComponentScan("app.management.book")
@EnableWebMvc
public class WebConfig {
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_demo");
		ds.setUsername("root");
		ds.setPassword("root@39");
		return ds;
	}

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDriverManagerDataSource());
	}

	@Bean
	public NamedParameterJdbcTemplate geNamedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(getDriverManagerDataSource());
	}

	@Bean
	public BookDaoImpl getBookDaoImpl() {
		BookDaoImpl daoImpl = new BookDaoImpl();
		daoImpl.setJdbcTemplate(getJdbcTemplate());
		daoImpl.setNamedParameterJdbcTemplate(geNamedParameterJdbcTemplate());
		return daoImpl;
	}

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
