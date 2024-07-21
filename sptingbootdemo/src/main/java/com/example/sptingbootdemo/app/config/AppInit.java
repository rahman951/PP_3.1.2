package com.example.sptingbootdemo.app.config;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public abstract class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//	    return new Class<?>[]{
//			    HibernateConfig.class
//	    };
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[]{
//                WebConfig.class
//        };
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//	@Override
//	public void onStartup(ServletContext aServletContext) throws ServletException {
//		super.onStartup(aServletContext);
//		registerHiddenFieldFilter(aServletContext);
//	}
	
	private void registerHiddenFieldFilter(ServletContext aContext) {
		aContext.addFilter("hiddenHttpMethodFilter",
				new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null, true, "/*");
	}
	
}
