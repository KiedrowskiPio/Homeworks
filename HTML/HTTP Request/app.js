let list;
let person = {
    name: '',
    lat: 0,
    lng: 0,
}

var r= new XMLHttpRequest();
r.open('GET','https://jsonplaceholder.typicode.com/users');
r.onload=function(){
    
var data=JSON.parse(r.responseText);

let i = 0;
let x;
let y;

while(i < 10){
        x = parseFloat(data[i].address.geo.lat);
        y = parseFloat(data[i].address.geo.lng);
        person[i]={
            name: data[i].name,
            lat: x,
            lng: y,
        };
        L.marker([person[i].lng, person[i].lat]).addTo(mymap)
        .bindPopup(person[i].name);
        i++;
    }
}
r.send();

var mymap = L.map('mapa').setView([1, 1], 1,5);
L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw', {
maxZoom: 16,

attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, ' +
    '<a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, ' +
    'Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
    id: 'mapbox.streets'
}).addTo(mymap);

var popup = L.popup();