package configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by pipe on 2/19/17.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"domain"})
@EnableJpaRepositories(basePackages = {"repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}