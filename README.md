# QuizApp
## Quiz App Backend

This project serves as the backend for a Quiz App. It provides APIs to manage quizzes and questions.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Maven

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven

### Installation

1. Clone the repository: git clone <repository-url>
2. Navigate to the project directory:cd quizapp
3. Build the project using Maven
4. Run the application
### Fill the application.properties
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/<tablename>
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect





The application will start running on port 8080 by default.

## Endpoints

### Quiz Controller

#### Create Quiz

- **Endpoint:** `POST /quiz/create`
- **Description:** Creates a new quiz based on the provided category, number of questions, and title.

### Question Controller

#### Get All Questions

- **Endpoint:** `GET /question/allQuestions`
- **Description:** Retrieves all questions available in the database.

#### Get Questions by Category

- **Endpoint:** `GET /question/category/{category}`
- **Description:** Retrieves questions belonging to the specified category.

#### Add Question

- **Endpoint:** `POST /question/save`
- **Description:** Adds a new question to the database.

### Request Parameters

- **`category`:** Specifies the category of the quiz or questions.
- **`numQ`:** Specifies the number of questions to be included in the quiz.
- **`title`:** Specifies the title of the quiz.

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any bugs or feature requests.



