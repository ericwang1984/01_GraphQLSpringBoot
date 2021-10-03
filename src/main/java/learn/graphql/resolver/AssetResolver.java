package learn.graphql.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import learn.graphql.domain.Asset;
import learn.graphql.domain.BankAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AssetResolver implements GraphQLResolver<BankAccount> {

  public List<Asset> assets(BankAccount bankAccount){
    List assets = new ArrayList();
    return assets;
  }
}
