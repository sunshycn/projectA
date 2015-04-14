package org.huamuzhen.gui.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * replacement of web.xml
 * 
 * */
public class TheWebApplicationInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[]{"/"};
	}

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        ConfigurableApplicationContext applicationContext = (ConfigurableApplicationContext) super.createRootApplicationContext();
        ApplicationContextInitializer initializer= new MyApplicationContextInitializer();
        initializer.initialize(applicationContext);

        return super.createRootApplicationContext();
    }
}
