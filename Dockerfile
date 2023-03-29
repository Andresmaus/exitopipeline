FROM openjdk:11-jre-slim
WORKDIR /app
COPY . /app
CMD ["gradle",
        "clean",
        "test",
        "-Dwebdriver.remote.url=http://localhost:4444",
        "-Dwebdriver.remote.driver=chrome",
        "-Dcucumber.options=--tags @tag",
        "--info"]
