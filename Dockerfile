FROM ubuntu
WORKDIR /compnets
# Install OpenJDK-18
RUN apt-get update && \
    apt-get install -y openjdk-18-jdk && \
    apt-get install -y ant && \
    apt-get clean;
    
# Fix certificate issues
RUN apt-get update && \
    apt-get install ca-certificates-java && \
    apt-get clean && \
    update-ca-certificates -f;

# Setup JAVA_HOME -- useful for docker commandline
ENV JAVA_HOME /usr/lib/jvm/java-18-openjdk-amd64/
RUN export JAVA_HOME
CMD ["/bin/bash"]
