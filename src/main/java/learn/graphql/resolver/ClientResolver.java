package learn.graphql.resolver;

import graphql.execution.DataFetcherResult;
import graphql.kickstart.execution.error.GenericGraphQLError;
import graphql.kickstart.tools.GraphQLResolver;
import java.util.UUID;
import learn.graphql.domain.BankAccount;
import learn.graphql.domain.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {
      public DataFetcherResult<Client> client(BankAccount bankAccount){
        log.info("Retrieving the client data for BankAccount id {}",bankAccount.getId());

        Client client = Client.builder().id(UUID.randomUUID()).firstName("eric").lastName("wang").build();

        DataFetcherResult result = DataFetcherResult.newResult()
                                    .data(client)
                                    .error(new GenericGraphQLError("Can't get all client info"))
                                    .build();
        return result;
      }
}
