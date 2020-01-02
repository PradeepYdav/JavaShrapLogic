const app = document.getElementById('root');

const logo = document.createElement('img');
logo.src = 'https://media.licdn.com/dms/image/C5103AQHMQuu8SduPIQ/profile-displayphoto-shrink_100_100/0?e=1582156800&v=beta&t=3hJV0r5_3SIz0UqtTyHF4LAJI6EXtxqt3A9hk4YYqog';

const container = document.createElement('div');
container.setAttribute('class', 'container');

app.appendChild(logo);
app.appendChild(container);

function getAllNotes(){
	


var request = new XMLHttpRequest();
request.open('GET', 'http://localhost:8081/api/notes/3', true);
request.onload = function () {

  // Begin accessing JSON data here
  var data = JSON.parse(this.response);

  if (Array.isArray(data)) {
    if (request.status >= 200 && request.status < 400) {
      data.forEach(movie => {
        const card = document.createElement('div');
        card.setAttribute('class', 'card');

        const h1 = document.createElement('h1');
        h1.textContent = movie.id+" "+movie.title;

        const p = document.createElement('p');
        movie.description = movie.contnet.substring(0, 300);
        p.textContent = `${movie.contnet}...`;

        container.appendChild(card);
        card.appendChild(h1);
        card.appendChild(p);
      });
    } else {
      const errorMessage = document.createElement('marquee');
      errorMessage.textContent = `Gah, it's not working!`;
      app.appendChild(errorMessage);
    }
  } else {
    if (request.status >= 200 && request.status < 400) {
        movie=data
        const card = document.createElement('div');
        card.setAttribute('class', 'card');

        const h1 = document.createElement('h1');
        h1.textContent = movie.title;

        const p = document.createElement('p');
        movie.description = movie.contnet;
        p.textContent = `${movie.contnet}...`;

        container.appendChild(card);
        card.appendChild(h1);
        card.appendChild(p);
     
    } else {
      const errorMessage = document.createElement('marquee');
      errorMessage.textContent = `Gah, it's not working!`;
      app.appendChild(errorMessage);
    }
  }

}

request.send();
}