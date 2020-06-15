package mx.uv.aerolinea;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@ComponentScan
public class Configuracion extends WsConfigurerAdapter {
	
	@Bean
	public XsdSchema aerolineaSchema() {
		return new SimpleXsdSchema(new ClassPathResource("Aerolinea.xsd"));
	}
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext){
		  MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		  servlet.setApplicationContext(applicationContext);
		  servlet.setTransformWsdlLocations(true);
		  return new ServletRegistrationBean<MessageDispatcherServlet>(servlet, "/*");
	}
	  @Bean(name = "aerolinea")
	  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema aerolineaSchema)
	  {
		  DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		  wsdl11Definition.setPortTypeName("AerolineaPort");
		  wsdl11Definition.setLocationUri("/Aerolinea");
		  wsdl11Definition.setTargetNamespace("http://www.example.org/Aerolinea");
		  wsdl11Definition.setSchema(aerolineaSchema);
		  return wsdl11Definition;
	  }

}
