# SpringBoot---PROXIES

## Overview

**SpringBoot---PROXIES** is a Spring Boot application that demonstrates the use of **Dynamic Proxies** and **AOP (Aspect-Oriented Programming)**. The project focuses on building a backend system using Spring Boot’s powerful proxy mechanisms and AOP features to handle cross-cutting concerns like logging, transactions, and security.

## Project Structure

- **app/**: Contains the main application logic and proxy configurations.
- **gradle/**: Manages dependencies and builds the project.
- **gradlew/gradlew.bat**: Scripts to run Gradle tasks without explicitly installing Gradle.
- **settings.gradle**: Contains settings for the Gradle project.

## Key Features

- **Dynamic Proxies**: Implements dynamic proxies to manage method calls at runtime.
- **Aspect-Oriented Programming (AOP)**: Uses AOP to separate business logic from cross-cutting concerns like logging and transactions.
- **Bean Management**: Leverages Spring’s `@Bean` and `@Autowired` annotations for managing and injecting dependencies.
- **Custom Annotations**: Demonstrates the use of custom annotations to trigger proxy behavior.

## How to Run

### Prerequisites

- **Java 17** or above installed.
- **Gradle** (or use the included wrapper `./gradlew`).
- An IDE such as **IntelliJ IDEA** or **VS Code**.

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/LavishVaishnav/SpringBoot---PROXIES.git
   cd SpringBoot---PROXIES
   ```

2. Build and run the project using Gradle:
   ```bash
   ./gradlew build
   ./gradlew bootRun
   ```

3. The application should now be running at:
   ```
   http://localhost:8080
   ```

## Examples of Proxies and AOP

The project includes examples of:

- **Dynamic Proxies**: Uses Java's `Proxy` class to implement runtime method interception.
- **AOP**: Demonstrates how to use Spring AOP with `@Aspect` and `@Around` to handle cross-cutting concerns.
- **Logging with Proxies**: Intercepts method calls for logging before and after method execution.

## Project Highlights

- **Custom Annotations**: Implements annotations to mark methods that should be intercepted by proxies.
- **Proxy Patterns**: Shows how proxy patterns can be used to add functionality dynamically without modifying the core logic.

## Contributing

Feel free to submit issues or pull requests if you find bugs or want to add features!


## Contact

For any inquiries, please contact **vaishnavlavish27@.com**.

---
