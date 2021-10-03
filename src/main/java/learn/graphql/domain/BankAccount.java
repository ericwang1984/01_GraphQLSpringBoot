package learn.graphql.domain;

import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BankAccount {
  UUID id;
  Currency currency;
//  Client client;
//  List<Asset> assets;
}
