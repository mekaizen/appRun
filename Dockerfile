# Use the official Jenkins LTS image as the base
FROM jenkins/jenkins:lts

# Install dependencies if required
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    curl \
    && apt-get clean

# Copy chromedriver from local system into the Docker container
COPY /home/cyber/Documents/practice/selenium/selenium-web-test-framework/src/test/resources/driver/chromedriver /usr/local/bin/chromedriver

# Make sure chromedriver is executable
RUN chmod +x /usr/local/bin/chromedriver

# (Optional) Test if chromedriver is working
RUN chromedriver --version

# Expose Jenkins port
EXPOSE 8888
