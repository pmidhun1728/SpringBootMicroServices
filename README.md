
## Key Features

- **Microservices**: Modular services handling different domains
- **Eureka Server**: For service registration and discovery
- **Spring Cloud Gateway**: For routing and request handling
- **REST APIs**: Each service exposes REST endpoints
- **Modular Structure**: Easy to extend or plug in additional services

## Getting Started

1. Clone the repository.
2. Open in IntelliJ or your preferred IDE.
3. Run `Eureka Server` first to enable service discovery.
4. Start other microservices (`DayOfWeek`, `MonthAndYear`, etc.).
5. Run `Gateway` to handle API routing.

## Technologies Used

- Java
- Spring Boot
- Spring Cloud (Eureka, Gateway)
- Maven or Gradle (depending on individual service setup)

## Notes

- Avoid duplicating services (e.g., consider removing or merging `Gateway 2.36.05 PM`)
- Each microservice should have its own `application.properties` or `application.yml` file with unique port configurations.
- Make sure all dependencies are resolved for smooth execution.

## License

This project is for educational purposes. Use freely with attribution.

