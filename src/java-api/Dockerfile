FROM openjdk:8-slim as builder

WORKDIR /app

# COPY ["mvnw", "./"]
COPY mvnw mvnw
RUN chmod +x mvnw
RUN ./mvnw clean package

FROM openjdk:8-slim

# Download Stackdriver Profiler Java agent
# RUN apt-get -y update && apt-get install -qqy \
#     wget \
#     && rm -rf /var/lib/apt/lists/*
# RUN mkdir -p /opt/cprof && \
#     wget -q -O- https://storage.googleapis.com/cloud-profiler/java/latest/profiler_java_agent.tar.gz \
#     | tar xzv -C /opt/cprof && \
#     rm -rf profiler_java_agent.tar.gz

# RUN GRPC_HEALTH_PROBE_VERSION=v0.4.11 && \
#     wget -qO/bin/grpc_health_probe https://github.com/grpc-ecosystem/grpc-health-probe/releases/download/${GRPC_HEALTH_PROBE_VERSION}/grpc_health_probe-linux-amd64 && \
#     chmod +x /bin/grpc_health_probe

WORKDIR /app
COPY --from=builder /app .

EXPOSE 9555
ENTRYPOINT ["/app/java-api-1.0.0.jar"]