package learn.graphql.domain;

import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BankAccount {
  UUID id;
  Client client;
  Currency currency;

}
