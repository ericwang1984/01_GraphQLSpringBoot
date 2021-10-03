package learn.graphql.resolver;

import graphql.kickstart.tools.GraphQLResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import learn.graphql.domain.Asset;
import learn.graphql.domain.BankAccount;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AssetResolver implements GraphQLResolver<BankAccount> {
  private final ExecutorService executorService = Executors.newFixedThreadPool(
      Runtime.getRuntime().availableProcessors()
  );
//
  public CompletableFuture<List<Asset>> assets(BankAccount bankAccount) {
    return CompletableFuture.supplyAsync(
        () -> {
          log.info("Getting assets for bank account id {}", bankAccount.getId());
          List assets = new ArrayList();
          return assets;
          },
        executorService
    );
  }

  public CompletableFuture<List<Asset>> getAssets(BankAccount bankAccount){
    return CompletableFuture.supplyAsync(
        ()->{
          log.info("Getting getAssets for bank account id {}", bankAccount.getId());
          List assets = new ArrayList();
          return assets;
        },
                executorService
    );
  }
}
