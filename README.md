
# Group 5 - Jenkins CD Pipeline

## Aim
To create a Jenkins pipeline that checks out, builds and tests
an application and sends an email notification with the result
of each build.

## Technologies Used
- Java 17
- IntelliJ IDEA
- Maven
- JUnit 5
- Git and GitHub
- Jenkins
- Ubuntu Linux
- Docker
- MailHog

## Model Questions

### Experiment 15 - Multiplication Table
Generate the multiplication table of a given number from 1 to 10.

### Experiment 16 - Sum of Five Integers
Read five integers into an array and calculate their sum.

### Experiment 17 - Largest of Three Numbers
Read three numbers and find the largest.

### Experiment 18 - Celsius to Fahrenheit
Convert Celsius temperature into Fahrenheit using:
F = (C * 9/5) + 32

## Project Structure

src/main/java/org/example/Main.java
src/test/java/org/example/MainTest.java
pom.xml
Jenkinsfile
README.md
.gitignore

## Local Testing

Run all JUnit tests:

mvn clean test

## Jenkins Pipeline Stages

1. Checkout - retrieves code from GitHub.
2. Build - compiles the Maven project.
3. Test - executes JUnit test cases.
4. Post Actions - sends email notifications on success or failure.

## Email Notification

Install the Jenkins Email Extension Plugin and configure
SMTP using localhost and port 1025 as in the lab procedure.

Run MailHog:

sudo docker run -d -p 1025:1025 -p 8025:8025 mailhog/mailhog

Open:

http://localhost:8025

## Expected Results

All JUnit tests should pass.

Jenkins should display:

Finished: SUCCESS

MailHog should receive the successful build notification.

## Result

Thus, the Jenkins CD pipeline was created and executed,
and email notification was verified using MailHog.
