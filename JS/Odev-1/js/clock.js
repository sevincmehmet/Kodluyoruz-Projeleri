let name = prompt("Lütfen adınızı giriniz.")
document.querySelector('#myName').innerHTML = name;
const days = ["Pazar","Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi"];


function showTime(){
    let d = new Date();
    let day=days[d.getDay()]
    let hrs=d.getHours();
    let min=d.getMinutes();
    let sec=d.getSeconds();
    document.querySelector('#day').innerHTML = day;
    document.querySelector('#hour').innerHTML = hrs+":";
    document.querySelector('#minute').innerHTML = min+":";
    document.querySelector('#seconds').innerHTML = sec+" ";
    
}
setInterval(showTime,20);