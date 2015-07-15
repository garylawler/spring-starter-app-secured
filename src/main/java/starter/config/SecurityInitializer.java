package starter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

@Configuration
@Order(value = 1)
public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer
{
    // Implicit no-arg constructor will use any preexisting ContextLoaderListener.
    // Providing a default constructor will require a config class and an attempt
    // will be made to register a new ContextLoaderListener. This will result in
    // a fatal error on startup as a ContextLoaderListener will already be present,
    // having been created by AppInitializer
}
