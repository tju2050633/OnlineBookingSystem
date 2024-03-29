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

}
