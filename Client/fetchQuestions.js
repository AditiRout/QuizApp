fetch("http://localhost:8080/question/allQuestions")
  .then((response) => response.json())
  .then((questions) => {
    console.log(response);
    const questionList = document.getElementById("questionList");
    questions.forEach((question) => {
      const li = document.createElement("li");
      li.textContent = question.questionTitle;
      questionList.appendChild(li);
    });
  })
  .catch((error) => {
    console.error("Error fetching questions:", error);
    alert("An error occurred while fetching questions.");
  });
