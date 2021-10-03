package learn.graphql.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import java.util.UUID;
import learn.graphql.domain.BankAccount;
import learn.graphql.domain.Client;
import learn.graphql.domain.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

  public BankAccount bankAccount(UUID id){
    log.info("retrieve bank account ,id {}",id);

    Client clientA = Client.builder().id(UUID.randomUUID()).firstName("eric").lastName("wang").build();
    BankAccount account = BankAccount.builder().id(id).client(clientA).currency(Currency.RMB).build();
    return account;
  }

}
