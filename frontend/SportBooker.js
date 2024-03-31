function Gofacility() {
    var SC = document.getElementById("Center");
    var SC_option = SC.value;
    var facility = document.getElementById("SC").children;
    for (var i = 0; i < facility.length; i++) {
      var question = facility[i];
      if (question.id === SC_option) {
        question.style.display = "block";
      } 
      else {
        question.style.display = "none";
      }
    }
}

function Govenue() {
  var SC = document.getElementById("Center");
  var SC_option = SC.value;
  var facility = document.getElementById("SC").children;
  var venue = document.getElementById("SC_f").children;
  for (var i = 0; i < venue.length; i++) {
    var facility_option = facility[i].value
    var facility_venue = venue[i].children
    for (var j = 0; j < facility_venue.length; j++){
      var question = facility_venue[j];
      if (question.id === SC_option +" "+ facility_option) {
        question.style.display = "block";
      }
      else {
        question.style.display = "none";
      }
    }
  }
}

function Payment() {
  window.location.href = 'Payment.html'
}