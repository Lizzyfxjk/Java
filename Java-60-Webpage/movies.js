let movies, info;

async function init(){
  let link = "https://literate-fortnight-p77pr9q57w6frv44-8500.app.github.dev"; //replace with your Dev URL
  let route= "/movies";

  info = await fetch(link+route);
  movies = await info.json();

  generateCards(movies);
}

function generateCards(movies){  
  let mainpanel = document.getElementById("centerpanel");
  let build ="";
   
  for(let i=0; i<movies.length; i++){
    let movie = movies[i]
    build += `<div class="card" >`
    build += `<h3> Movie ID : ${movie.MovieID}</h3>`;
    build += `<div> Title : ${movie.Title}</div>`;
    build += `<div> Release Year : ${movie.ReleaseYear}</div>`;
    build += `<div> Rating : ${movie.Rating}</div>`;
    build += `<img src="movies/${movie.Title}.png">`;
    build += `</div>`;
  }
  mainpanel.innerHTML = build;  
}

function filter(){
  let title = document.getElementById("title").value;
  console.log(title);

  let newMovies = []; //create a list of songs searched for
  
  for(let i=0; i<movies.length;i++){
    let movie = movies[i] //get each sog
    //make sure the list is no
    if( movie.Title == title ) {
          //add to the new list
          newMovies.push(movie);
       }
  }
  console.log(`number found ${newMovies.length}`)
  generateCards(newMovies);  
}