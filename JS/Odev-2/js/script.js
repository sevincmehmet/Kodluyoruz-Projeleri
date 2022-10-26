let arrayList = localStorage.getItem("IsArrayList") ? JSON.parse(localStorage.getItem("IsArrayList")) : [] ;

//DOM ile html etiiketlerine ulaştık
let btnDOM = document.querySelector('#liveToastButton')
let taskDOM = document.querySelector('#task')
let listDOM = document.querySelector('#list')

let liDOM = document.createElement('li'); // Yeni liste elemanları oluşturduk

let data = JSON.parse(localStorage.getItem('IsArrayList'));

data.forEach(IsArrayList => {
    liDOM = document.createElement('li')
    liDOM.textContent = IsArrayList;
    listDOM.appendChild(liDOM)
});


function check() {
    this.classList.toggle("checked"); // toggle aktif pasif durumunu belirtir aktifken checked clasını ekle :)
}
function removeButton() {
    this.parentElement.remove(); //çarpının bulundugu maddeyi silmek için kullanılır    
}
let sayac = 0;

function newElement() {
    if (!(Boolean(task.value.trim())))  {  // input değeri boş girildiğinde ve girilmediğinde 
        $(".error").toast("show"); //error clasını kullanarak 
      } else {
        $(".success").toast("show");
        
        arrayList.push(taskDOM.value); //dizinin içine girilen elemanı ekledik
        localStorage.setItem('IsArrayList', JSON.stringify(arrayList)) // diziyi string ifadeye dönüştürdük ve kaydettik
        

        liDOM = document.createElement('li')
        listDOM.appendChild(liDOM); // Her eklenen liste elemanlarını list imizin en sonuna koydul
        liDOM.textContent = task.value; // Eklenen eleman içine girilen değeri yazdırdık

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