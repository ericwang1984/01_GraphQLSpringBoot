package learn.graphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.UUID;
import learn.graphql.domain.BankAccount;
import org.springframework.stereotype.Component;

@Component
public class BankAccountResolver implements GraphQLQueryResolver {

  public BankAccount bankAccount(UUID id){

    return null;
  }

}
