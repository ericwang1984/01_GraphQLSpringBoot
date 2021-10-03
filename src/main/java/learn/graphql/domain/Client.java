package learn.graphql.domain;

import java.util.UUID;
import lombok.Builder;
import lombok.Setter;


@Setter
@Builder
public class Client {
      UUID id;
      String firstName;
      String lastName;
      Client client;
}
