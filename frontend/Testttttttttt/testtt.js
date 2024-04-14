const userBaseUrl = "http://34.92.41.227:8080/api/user/";

function submitForm(event) {
    event.preventDefault(); // Prevent default form submission
  
    var formData = new FormData($("#myForm")[0]);
  
    return $.ajax({
      url: userBaseUrl + "add",
      type: "POST",
      data: formData,
      processData: false,
      contentType: "application/json",
      success: function(response) {
        getAllUsers();
        $("#myForm")[0].reset(); // Reset the form after successful submission
      },
      error: function(xhr, status, error) {
        console.error("Error:", error);
      }
    });
  }

  /*--------------------------------------
  function addUser(user) {
    return $.ajax({
        url: userBaseUrl + "add",
        type: "POST",
        data: JSON.stringify(user),
        contentType: "application/json"
    });
}

*/




function getAllUsers() {
  $.ajax({
    url: userBaseUrl + "all",
    type: "GET",
    success: function(response) {
      displayUsers(response);
    },
    error: function(xhr, status, error) {
      console.error("Error:", error);
    }
  });
}

function displayUsers(users) {
  var resultDiv = document.getElementById("result");
  resultDiv.innerHTML = ""; // Clear previous results

  for (var i = 0; i < users.length; i++) {
    var user = users[i];
    var userElement = document.createElement("div");
    userElement.textContent = "Name: " + user.name + ", Phone No: " + user.phoneNumber;
    resultDiv.appendChild(userElement);
  }
}


$(document).ready(function() {
    getAllUsers();
    
  });

