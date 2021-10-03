package learn.graphql.resolver;

import graphql.GraphQLException;
import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.UUID;
import learn.graphql.domain.BankAccount;
import learn.graphql.domain.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ExceptionSampleResolver implements GraphQLQueryResolver {

  public BankAccount bankAccountGraphQLException(UUID id){
    log.info("retrieve bank account ,id {}",id);

    throw new GraphQLException("GraphQLException  DB connect error !" );
  }

  public BankAccount bankAccountRuntimeException(UUID id){
    log.info("retrieve bank account ,id {}",id);

    throw new RuntimeException(" RuntimeException error !" );
  }
}
