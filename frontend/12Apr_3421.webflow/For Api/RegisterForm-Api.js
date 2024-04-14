const userBaseUrl = "http://34.92.41.227:8080/api/user/";

function submitForm(event) {
    event.preventDefault(); // Prevent default form submission
  

  var formElement = $("#RegisterForm")[0];
  var formData = new FormData(formElement);

  var object = {};
  formData.forEach(function(value, key){
      object[key] = value;
  });
//   var user = {
//     "userId": 6,
//     "membershipId": 2,
//     "name": "Jane Smith",
//     "password": "janepassword",
//     "gender": "Female",
//     "email": "jane.smith@example.com",
//     "phoneNumber": "87654321",
//     "hkid": "B2345679",
//     "birthday": "1990-02-02",
//     "address": "456 Secondary St",
//     "dateRegistered": "2023-05-08"
// };

object['MemberName'] = 'Chan Tai'
object['gender'] = 'Female';
object['email'] = '666@example.com';
object['password'] = "password";  
object['hkid'] = 'B1234567';
object['birthday'] = '1990-02-02';
object['address'] = '123 Main St';
var json = JSON.stringify(object);
/*
  object['userId'] = 10;
  object['membershipId'] = 2;
  object['password'] = "password";  
  object['gender'] = 'Female';
  object['email'] = '666@example.com';
  object['hkid'] = 'B1234567';
  object['birthday'] = '1990-02-02';
  object['address'] = '123 Main St';
  object['dateRegistered'] = '2023-05-08';
  var json = JSON.stringify(object);
 */ 
  console.log("formData", json);
  
    return $.ajax({
      url: userBaseUrl + "add",
      type: "POST",
      data: json,
      processData: false,
      contentType: "application/json",
      success: function(response) {
        getAllUsers();
        console.log("SSSSSSSSSSSSSS")
        $("#RegisterForm")[0].reset(); // Reset the form after successful submission
      },
      error: function(xhr, status, error) {
        console.error("Error:", error);
        console.log("EEEEEEEEEEEEE")
      }
    });
  }




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

