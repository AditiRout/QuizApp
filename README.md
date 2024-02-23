# QuizApp
# Quiz App

The Quiz App is a web application that allows users to create quizzes, add questions to the quizzes, and take quizzes.

## Features

- **Create Quizzes**: Users can create new quizzes by specifying the title, category, and number of questions.
- **Add Questions**: Users can add questions to a quiz by providing the question title, options, correct answer, difficulty level, and category.
- **Display Quizzes**: Users can view all the quizzes available.

## Technologies Used

- **Backend**: Java with Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL (or any other supported by Spring Data JPA)

## Setup

1. **Clone the Repository**:
2. **Backend Setup**:
- Import the backend project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
- Ensure that CORS is enabled by adding `@CrossOrigin(origins = "(http://127.0.0.1:5500)")` above each controller method in the backend. Change `(http://127.0.0.1:5500)` to match the origin of your frontend if it's different.
- Configure the database connection in the `application.properties` file.
- Run the Spring Boot application.

3. **Frontend Setup**:
- Open the `index.html` file in a web browser or deploy it to a web server.
- Update the CORS origin in the backend if the frontend is hosted on a different domain or port.

## Usage

1. **Create a Quiz**:
- Navigate to the "Create Quiz" section.
- Enter the title, category, and number of questions for the quiz.
- Click on the "Create Quiz" button.

2. **Add a Question**:
- Navigate to the "Add Question" section.
- Enter the question title, options, correct answer, difficulty level, and category.
- Click on the "Add Question" button.

3. **Display Quizzes**:
- Navigate to the "All Quizzes" section to view all available quizzes.

4. **Take a Quiz**:
- Click on a quiz from the list to start taking the quiz.
- Answer the questions and submit your answers.

## API Endpoints

- **POST /quiz/create**: Create a new quiz.
- **GET /quiz/all**: Get all quizzes.
- **GET /quiz/{id}**: Get a quiz by ID.
- **POST /question/save**: Add a new question.

## Contributing

Contributions are welcome! Please feel free to submit any bug fixes or enhancements.





