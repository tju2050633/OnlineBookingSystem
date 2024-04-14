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
      Govenue()
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


function resetf1(){
  document.getElementById("SC2").value = "";
  document.getElementById("SC3").value = "";
  document.getElementById("SC4").value = "";
}

function resetf2(){
  document.getElementById("SC1").value = "";
  document.getElementById("SC3").value = "";
  document.getElementById("SC4").value = "";
}

function resetf3(){
  document.getElementById("SC2").value = "";
  document.getElementById("SC1").value = "";
  document.getElementById("SC4").value = "";
}

function resetf4(){
  document.getElementById("SC2").value = "";
  document.getElementById("SC3").value = "";
  document.getElementById("SC1").value = "";
}

function resetf1_v1(){
  document.getElementById("SC1 Badminton court").value = "";
  document.getElementById("SC1 Bowling alley").value = "";
  document.getElementById("SC1 Pool table").value = "";
}

function resetf1_v2(){
  document.getElementById("SC1 Table tennis table").value = "";
  document.getElementById("SC1 Bowling alley").value = "";
  document.getElementById("SC1 Pool table").value = "";
}

function resetf1_v3(){
  document.getElementById("SC1 Badminton court").value = "";
  document.getElementById("SC1 Table tennis table").value = "";
  document.getElementById("SC1 Pool table").value = "";
}

function resetf1_v4(){
  document.getElementById("SC1 Badminton court").value = "";
  document.getElementById("SC1 Bowling alley").value = "";
  document.getElementById("SC1 Table tennis table").value = "";
}

function resetf2_v1(){
  document.getElementById("SC2 Volleyball court").value = "";
  document.getElementById("SC2 Squash court").value = "";
  document.getElementById("SC2 Tennis court").value = "";
}

function resetf2_v2(){
  document.getElementById("SC2 Basketball court").value = "";
  document.getElementById("SC2 Squash court").value = "";
  document.getElementById("SC2 Tennis court").value = "";
}

function resetf2_v3(){
  document.getElementById("SC2 Volleyball court").value = "";
  document.getElementById("SC2 Basketball court").value = "";
  document.getElementById("SC2 Tennis court").value = "";
}

function resetf2_v4(){
  document.getElementById("SC2 Volleyball court").value = "";
  document.getElementById("SC2 Squash court").value = "";
  document.getElementById("SC2 Basketball court").value = "";
}

function resetf3_v1(){
  document.getElementById("SC3 Basketball court").value = "";
  document.getElementById("SC3 Squash court").value = "";
  document.getElementById("SC3 Tennis court").value = "";
}

function resetf3_v2(){
  document.getElementById("SC3 Badminton court").value = "";
  document.getElementById("SC3 Squash court").value = "";
  document.getElementById("SC3 Tennis court").value = "";
}

function resetf3_v3(){
  document.getElementById("SC3 Basketball court").value = "";
  document.getElementById("SC3 Badminton court").value = "";
  document.getElementById("SC3 Tennis court").value = "";
}

function resetf3_v4(){
  document.getElementById("SC3 Basketball court").value = "";
  document.getElementById("SC3 Squash court").value = "";
  document.getElementById("SC3 Badminton court").value = "";
}

function resetf4_v1(){
  document.getElementById("SC4 Volleyball court").value = "";
  document.getElementById("SC4 Bowling alley").value = "";
  document.getElementById("SC4 Pool table").value = "";
}

function resetf4_v2(){
  document.getElementById("SC4 Table tennis table").value = "";
  document.getElementById("SC4 Bowling alley").value = "";
  document.getElementById("SC4 Pool table").value = "";
}

function resetf4_v3(){
  document.getElementById("SC4 Volleyball court").value = "";
  document.getElementById("SC4 Table tennis table").value = "";
  document.getElementById("SC4 Pool table").value = "";
}

function resetf4_v4(){
  document.getElementById("SC4 Volleyball court").value = "";
  document.getElementById("SC4 Bowling alley").value = "";
  document.getElementById("SC4 Table tennis table").value = "";
}