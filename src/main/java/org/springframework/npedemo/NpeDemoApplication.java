package org.springframework.npedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext}
 * In the Line [98,99]
 * ServletWebServerFactory factory = this.getWebServerFactory();
 * When i change ServletWebServerFactory from {@link org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory}
 * to the {@link org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory}
 * the factory.getWebServer... will throw the NPE , the exception stacktrace was post on https://github.com/spring-projects/spring-boot/pull/17778
 * this.webServer = factory.getWebServer(new ServletContextInitializer[]{this.getSelfInitializer()});
 *
 * If your OS was Windows , running this Application by spring.profiles.active=windows
 * else if your OS was Linux, running this Application by spring.profiles.active=linux
 * the default setting was linux.
 */
@SpringBootApplication
public class NpeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NpeDemoApplication.class, args);
    }

}
