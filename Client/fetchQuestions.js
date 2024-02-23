fetch("http://localhost:8080/question/allQuestions")
  .then((response) => response.json())
  .then((questions) => {
    const questionList = document.getElementById("questionList");
    questions.forEach((question) => {
      const li = document.createElement("li");
      li.classList.add('question');
      li.innerHTML = `
            <div class="question">
                <h2>${question.questionTitle}</h2>
                <p><strong>Category:</strong> ${question.category}</p>
                <p><strong>Difficulty Level:</strong> ${question.difficultyLevel}</p>
            </div>
        `;
      questionList.appendChild(li);
    });
  })
  .catch((error) => {
    console.error("Error fetching questions:", error);
    alert("An error occurred while fetching questions.");
  });
