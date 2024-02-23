function createQuiz() {
  const title = document.getElementById("title").value;
  const category = document.getElementById("category").value;
  const numQ = document.getElementById("numQ").value;

  fetch(
    "/quiz/create?category=" + category + "&numQ=" + numQ + "&title=" + title,
    {
      method: "POST",
    }
  )
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
