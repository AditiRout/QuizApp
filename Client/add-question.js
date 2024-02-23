document.getElementById("addQuestionForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent the form from submitting normally
    
    // Get form values
    const questionTitle = document.getElementById("questionTitle").value;
    const option1 = document.getElementById("option1").value;
    const option2 = document.getElementById("option2").value;
    const option3 = document.getElementById("option3").value;
    const option4 = document.getElementById("option4").value;
    const rightAnswer = document.getElementById("rightAnswer").value;
    const difficultyLevel = document.getElementById("difficultyLevel").value;
    const category = document.getElementById("category").value;
  
    // Construct question object
    const question = {
      questionTitle: questionTitle,
      option1: option1,
      option2: option2,
      option3: option3,
      option4: option4,
      rightAnswer: rightAnswer,
      difficultyLevel: difficultyLevel,
      category: category
    };
  
    // Send POST request to add question
    fetch("http://localhost:8080/question/save", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(question)
    })
    .then(response => {
      if (response.ok) {
        alert("Question added successfully!");
        // Clear form fields if needed
        document.getElementById("addQuestionForm").reset();
      } else {
        alert("Failed to add question. Please try again.");
      }
    })
    .catch(error => {
      console.error("Error:", error);
      alert("An error occurred while adding the question");
    });
  });
  