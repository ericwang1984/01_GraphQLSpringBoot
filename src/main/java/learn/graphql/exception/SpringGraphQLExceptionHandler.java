package learn.graphql.exception;

import graphql.GraphQLException;
import graphql.kickstart.spring.error.ThrowableGraphQLError;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
//会根据application.yml中的设置，来启用
@Component
public class SpringGraphQLExceptionHandler {

  @ExceptionHandler(GraphQLException.class)
  public ThrowableGraphQLError handle(GraphQLException e) {
    return new ThrowableGraphQLError(e);
  }

  @ExceptionHandler(RuntimeException.class)
  public ThrowableGraphQLError handle(RuntimeException e) {
    return new ThrowableGraphQLError(e, "Internal Server Error");
  }

}
