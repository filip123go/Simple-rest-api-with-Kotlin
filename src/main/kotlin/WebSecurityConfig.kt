//uncomment these for auth0 authentication


//import com.auth0.spring.security.api.JwtWebSecurityConfigurer
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Configuration
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
//
//@Configuration
//@EnableWebSecurity
//open class WebSecurity : WebSecurityConfigurerAdapter() {
//	@Value("\${auth0.audience}")
//
//	private val audience: String? = null
//
//	@Value("\${auth0.issuer}")
//	private val issuer: String? = null
//
//	@Throws(Exception::class)
//	override fun configure(http: HttpSecurity){
//		http.authorizeRequests()
//			.anyRequest().authenticated()
//
//
//		JwtWebSecurityConfigurer
//			.forRS256(audience, issuer!!)
//			.configure(http)
//	}
//}
