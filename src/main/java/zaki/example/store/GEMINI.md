# Spring Boot Store Example

## Project Overview
This project is a Java Spring Boot application located in `zaki.example.store`. It demonstrates core Spring concepts including Dependency Injection (DI), Inversion of Control (IoC), and Spring MVC Web Controllers. The application simulates a simple store order processing system with pluggable payment services.

## Key Components

### Application Entry Point
*   **`StoreApplication.java`**: The main class annotated with `@SpringBootApplication`. It bootstraps the Spring context and demonstrates retrieving a bean (`OrderService`) manually from the context to execute logic on startup.

### Web Layer
*   **`HomeController.java`**: A `@Controller` that handles web requests.
    *   `GET /`: Returns `index.html`.
    *   `GET /settings`: Returns `settings.html`.

### Business Logic (Services)
*   **`OrderService.java`**: A `@Component` that handles order processing. It depends on a `PaymentService` to process payments, demonstrating Dependency Injection via its constructor (`@Autowired`).
*   **`PaymentService.java`**: An interface defining the contract for payment processing (`process(double amount)`).
*   **`StripePaymentService.java`** / **`PaypalPaymentService.java`**: Concrete implementations of `PaymentService`, annotated with `@Component` to be managed by the Spring container.

## Building and Running

Since this appears to be a Maven project (indicated by the standard directory structure), use the following commands from the project root (where the `pom.xml` is located):

### Prerequisites
*   Java Development Kit (JDK) 17 or higher (recommended).
*   Maven.

### Commands
1.  **Build the project:**
    ```bash
    mvn clean install
    ```

2.  **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

## Development Conventions
*   **Dependency Injection:** The project prefers Constructor Injection (as seen in `OrderService`).
*   **Components:** Logic classes are annotated with `@Component` or specific stereotypes like `@Controller`.
*   **Package Structure:** All source code is contained within the `zaki.example.store` package.
