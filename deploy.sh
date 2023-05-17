mvn deploy:deploy-file \
 --settings=settings.xml \
 -DgroupId=nl.topicus.superset \
 -DartifactId=superset-swagger-client \
 -Dfile=target/superset-swagger-client-1.2.0.jar \
 -Dsources=target/superset-swagger-client-1.2.0-sources.jar \
 -Djavadoc=target/superset-swagger-client-1.2.0-javadoc.jar \
 -DpomFile=pom.xml \
 -DrepositoryId=nexus \
 -Durl=https://nexus.topicusfinance.nl/repository/maven-releases \

