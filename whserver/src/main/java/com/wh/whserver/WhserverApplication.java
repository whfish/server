package com.wh.whserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wh.whserver.mybatis.dao")
public class WhserverApplication {
	// 在某配置类中添加如下内容
	// 监听的http请求的端口,需要在application配置中添加http.port=端口号 如80
	@Value("${http.port}")
	Integer httpPort;

	// 正常启用的https端口 如443
	@Value("${server.port}")
	Integer httpsPort;

	public static void main(String[] args) {
		SpringApplication.run(WhserverApplication.class, args);
	}

	/**
	 * it's for set http url auto change to https
	 */

	// springboot2 写法
	// @Bean
	// public TomcatServletWebServerFactory servletContainer() {
	// TomcatServletWebServerFactory tomcat = new
	// TomcatServletWebServerFactory() {
	// @Override
	// protected void postProcessContext(Context context) {
	// SecurityConstraint constraint = new SecurityConstraint();
	// constraint.setUserConstraint("CONFIDENTIAL");
	// SecurityCollection collection = new SecurityCollection();
	// collection.addPattern("/*");
	// constraint.addCollection(collection);
	// context.addConstraint(constraint);
	// }
	// };
	// tomcat.addAdditionalTomcatConnectors(httpConnector());
	// return tomcat;
	// }
	//
	// @Bean
	// public Connector httpConnector() {
	// Connector connector = new
	// Connector("org.apache.coyote.http11.Http11NioProtocol");
	// connector.setScheme("http");
	// connector.setPort(httpPort);
	// connector.setSecure(false);
	// connector.setRedirectPort(httpsPort);
	// return connector;
	// }

}
