package cn.emac.demo.petstore.configs;

import cn.emac.demo.petstore.services.security.MyPermissionEvaluator;
import cn.emac.demo.petstore.services.security.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.AbstractSecurityExpressionHandler;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Emac
 * @since 2016-02-11
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsService detailsService;

    @Autowired
    private MyPermissionEvaluator permissionEvaluator;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .and().formLogin().loginPage("/login").permitAll().defaultSuccessUrl("/", true)
                .and().logout().logoutUrl("/logout")
                .and().sessionManagement().maximumSessions(1).expiredUrl("/expired")
                .and()
                .and().exceptionHandling().accessDeniedPage("/accessDenied")
                .and().csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**", "/**/favicon.ico").antMatchers("/druid/**");
        ((AbstractSecurityExpressionHandler)web.getExpressionHandler()).setPermissionEvaluator(permissionEvaluator);
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(detailsService);//.passwordEncoder(new BCryptPasswordEncoder());
    }

}
