const liveToastBtnDOM = document.querySelector('#liveToastBtn');
const liveToastDOM = document.querySelector('#liveToast');

const textDOM = document.querySelector('#task')
const listDOM = document.querySelector('#list')

const allLiDOM = document.querySelectorAll("li")

function newElement() {
    listDOM.innerHTML += textDOM.value 
}