document.addEventListener('DOMContentLoaded', () => {
    fetchQuizzes();
});

async function fetchQuizzes() {
    try {
        const response = await fetch('http://localhost:8080/quiz/all');

        if (!response.ok) {
            throw new Error('Failed to fetch quizzes.');
        }

        const quizzes = await response.json();
        displayQuizzes(quizzes);
    } catch (error) {
        console.error('Error:', error);
        alert('An error occurred while fetching quizzes.');
    }
}

function displayQuizzes(quizzes) {
    const quizList = document.getElementById('quizList');
    quizList.innerHTML = '';

    quizzes.forEach(quiz => {
        const quizElement = document.createElement('div');
        quizElement.classList.add('quiz');

        const titleElement = document.createElement('h2');
        titleElement.textContent = quiz.title;
        quizElement.appendChild(titleElement);

        const questionsElement = document.createElement('ul');
        quiz.questions.forEach(question => {
            const questionElement = document.createElement('li');
            questionElement.textContent = question.questionTitle;
            questionsElement.appendChild(questionElement);
        });
        quizElement.appendChild(questionsElement);

        quizList.appendChild(quizElement);
    });
}
