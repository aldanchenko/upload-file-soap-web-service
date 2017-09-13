package ua.examples.cxf.server;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Spring configuration class for endpoints.
 */
@Configuration
public class WebServicesConfiguration {

    @Bean
    public UploadService uploadService() {
        return new UploadServiceEndpointImpl();
    }

    @Bean
    public javax.xml.ws.Endpoint endpoint() {
        Endpoint endpoint = new EndpointImpl(springBus(), uploadService());

        endpoint.publish("/UploadWS");

        return endpoint;
    }

    @Bean
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
}
