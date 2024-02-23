function createQuiz() {
  const title = document.getElementById("title").value;
  const category = document.getElementById("category").value;
  const numQ = document.getElementById("numQ").value;

  const url = `http://localhost:8080/quiz/create?category=${encodeURIComponent(category)}&numQ=${encodeURIComponent(numQ)}&title=${encodeURIComponent(title)}`;

  fetch(url, {
    method: "POST",
  })
    .then((response) => {
      if (response.ok) {
        alert("Quiz created successfully!");
        window.location.href = "all-quizzes.html";
      } else {
        alert("Failed to create quiz. Please try again.");
      }
    })
    .catch((error) => {
      console.error("Error:", error);
      alert("An error occurred while creating the quiz");
    });
}
