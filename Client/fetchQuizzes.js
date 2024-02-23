fetch('http://localhost:8080/quiz/all')
    .then(response => response.json())
    .then(quizzes => {
        const quizList = document.getElementById('quizList');
        quizzes.forEach(quiz => {
            const li = document.createElement('li');
            li.textContent = quiz.title;
            quizList.appendChild(li);
        });
    })
    .catch(error => {
        console.error('Error fetching quizzes:', error);
        alert('An error occurred while fetching quizzes.');
    });
