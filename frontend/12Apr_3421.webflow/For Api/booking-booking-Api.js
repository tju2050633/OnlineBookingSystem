
////////////////// booking-booking form ///////////////////
document.addEventListener('DOMContentLoaded', function () {
    // Handle form submission
    document.querySelector('form').addEventListener('submit', function (event) {
      event.preventDefault(); // Prevent the default form submission
  
      // Get form data
      var formData = new FormData();
      formData.append('name', document.getElementById('name').value);
      formData.append('PhoneNo', document.getElementById('PhoneNo').value);
      formData.append('Member', document.getElementById('Member').value);
      formData.append('Center', document.getElementById('Center').value);
      formData.append('Facility', document.getElementById('Facility').value);
      formData.append('Venue', document.getElementById('Venue').value);
      formData.append('Date', document.getElementById('Date').value);
      formData.append('Time', document.getElementById('Time').value);
      formData.append('Rent_Equipment', document.getElementById('Rent_Equipment').value);
  
      // Send AJAX request to the API
      var xhr = new XMLHttpRequest();
      xhr.open('POST', 'http://34.92.41.227:8080/api/booking/', true);
      xhr.onload = function () {
        // Handle the response from the API
        if (xhr.status >= 200 && xhr.status < 400) {
          var response = xhr.responseText;
          console.log(response);
          // Display success message or perform other actions
        } else {
          console.error('Error: ' + xhr.status);
          // Display error message or perform other actions
        }
      };
      xhr.onerror = function () {
        console.error('Request failed');
        // Display error message or perform other actions
      };
      xhr.send(formData);
    });
  });
  

////////////////// RegisterForm form ///////////////////






