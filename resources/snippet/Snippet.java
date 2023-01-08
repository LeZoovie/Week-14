package snippet;

public class Snippet {
  # The ${placeholders} are replaced by Flyway with values from environment variables with the same
  # name. The environment variables are set when the container is created by Docker.
  flyway.url=${FLYWAY_URL}
  flyway.schemas=${FLYWAY_SCHEMAS}
  flyway.user=${FLYWAY_USER}
  flyway.password=${FLYWAY_PASSWORD}
  flyway.connectRetries=${FLYWAY_CONNECT_RETRIES}
}

