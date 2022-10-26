let btnDOM = document.querySelector('#liveToastButton')
let taskDOM = document.querySelector('#task')
let listDOM = document.querySelector('#list')


localStorage.setItem('items', JSON.stringify(listArray));
const data = JSON.parse(localStorage.getItem('items'));

function check() {
    this.classList.toggle("checked"); // toggle aktif pasif durumunu belirtir aktifken checked clasını ekle :)
}
function removeButton() {
    this.parentElement.remove(); //çarpının bulundugu maddeyi silmek için kullanılır    
}

function newElement() {
    if (!(Boolean(task.value.trim())))  {  // input değeri boş girildiğinde ve girilmediğinde 
        $(".error").toast("show"); //error clasını kullanarak 
      } else {
        $(".success").toast("show");

        let liDOM = document.createElement('li'); // Yeni liste elemanları oluşturduk
        listDOM.appendChild(liDOM); // Her eklenen liste elemanlarını list imizin en sonuna koydul
        liDOM.textContent = task.value; // Eklenen eleman içine girilen değeri yadırdık
        taskDOM.value = ""; // Eklendikten sonra task ımınızın içindeki bilgiyi sildirdik
        
        liDOM.onclick = check;

        let closeBtn = document.createElement('span');// span olusturduk
        closeBtn.textContent = "x"; // span içine çarpı işareti ekledik
        closeBtn.classList.add("close"); //çarpı işaretine class ekledik
        closeBtn.onclick = removeButton; // basılınca da removeButton işlevni almasını sağladık

        liDOM.append(closeBtn); // close butonunun yerini ayarladık
        listDOM.append(liDOM);
        
    }
}