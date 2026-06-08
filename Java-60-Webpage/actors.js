let actors, info;

async function init(){
  let link = "https://literate-fortnight-p77pr9q57w6frv44-8500.app.github.dev"; //replace with your Dev URL
  let route= "/actors";

  info = await fetch(link+route);
  actors = await info.json();

  generateCards(actors);
}

function generateCards(actors){  
  let mainpanel = document.getElementById("centerpanel");
  let build ="";
   
  for(let i=0; i<actors.length; i++){
    let actor = actors[i]
    build += `<div class="card" >`
    build += `<h3> Actor ID : ${actor.ActorID}</h3>`;
    build += `<div> Name : ${actor.Name}</div>`;
    build += `<div> Age : ${actor.Age}</div>`;
    build += `<img src="actors/${actor.Name}.png">`;
    build += `</div>`;
  }
  mainpanel.innerHTML = build;  
}

function filter(){
  let name = document.getElementById("name").value;
  console.log(name);

  let newActors = []; //create a list of songs searched for
  
  for(let i=0; i<actors.length;i++){
    let actor = actors[i] //get each sog
    //make sure the list is no
    if( actor.Name == name ) {
          //add to the new list
          newActors.push(actor);
       }
  }
  console.log(`number found ${newActors.length}`)
  generateCards(newActors);  
}