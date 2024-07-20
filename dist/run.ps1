# Make sure the oidc_check-1.0-SNAPSHOT.jar and a configured application.yaml file exists in the directory from where this is run

java -jar oidc_check-1.0-SNAPSHOT.jar --spring.config.name=application --spring.config.location=file:./