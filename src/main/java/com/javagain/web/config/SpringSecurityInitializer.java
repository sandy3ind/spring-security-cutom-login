package com.javagain.web.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 
 * @author Sandeep.Sharma
 * 
 * This will be blank as we are using Spring Security with 
 * existing Spring configuration. As we are using Spring elsewhere
 * in our application we probably already had a WebApplicationInitializer 
 * that is loading our Spring Configuration
 *
 */
public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	// This registers the springSecurityFilterChain filter
}
