let directors, info;

async function init(){
  let link = "https://literate-fortnight-p77pr9q57w6frv44-8500.app.github.dev"; //replace with your Dev URL
  let route= "/directors";

  info = await fetch(link+route);
  directors = await info.json();

  generateCards(directors);
}

function generateCards(directors){  
  let mainpanel = document.getElementById("centerpanel");
  let build ="";
   
  for(let i=0; i<directors.length; i++){
    let director = directors[i]
    build += `<div class="card" >`
    build += `<h3> Director ID : ${director.DirectorID}</h3>`;
    build += `<div> Name : ${director.Name}</div>`;
    build += `<div> Nationality : ${director.Nationality}</div>`;
    build += `<img src="directors/${director.Name}.png">`;
    build += `<hr>`;
    build += `</div>`;
  }
  mainpanel.innerHTML = build;  
}
function filter(){
  let name = document.getElementById("name").value;
  console.log(name);

  let newDirectors = []; //create a list of songs searched for
  
  for(let i=0; i<directors.length;i++){
    let director = directors[i] //get each sog
    //make sure the list is no
    if( director.Name == name ) {
          //add to the new list
          newDirectors.push(director);
       }
  }

  
  console.log(`number found ${newDirectors.length}`)
  generateCards(newDirectors);  
  }
