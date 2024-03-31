// JavaScript function for page navigation
function changePage(pageId) {
    // Hide all sections
    var sections = document.querySelectorAll('section');
    sections.forEach(function(section) {
      section.style.display = 'none';
    });
    
    // Show the selected section
    var selectedSection = document.getElementById(pageId);
    selectedSection.style.display = 'block';
}
  
// Initially show the home section
window.addEventListener('DOMContentLoaded', function() {
    changePage('Booking');
});

function Registerform() {
  window.location.href = 'Registerform.html'
}

function SportBooker() {
  window.location.href = 'SportBooker.html'
}

function Check() {
  window.location.href = 'Check.html'
}

function Cancel() {
  window.location.href = 'Cancel.html'
}