tab1btn = document.getElementById('tab1btn');
tab2btn = document.getElementById('tab2btn');
tab3btn = document.getElementById('tab3btn');
tab1 = document.getElementById('tab1');
tab2 = document.getElementById('tab2');
tab3 = document.getElementById('tab3');


let tab1click = false;
let tab2click = false;
let tab3click = false;

tab1btn.addEventListener('click', () => {
    if (tab1click) {
        tab1.style.display = 'none';
    }
    else {
        tab1.style.display = 'block';
        tab2.style.display = 'none';
        tab3.style.display = 'none';
        //button color
        tab1btn.style.color='blue';
        tab2btn.style.color='black';
        tab3btn.style.color='black';
        //click false
        let tab2click = false;
        let tab3click = false;
    }

});
tab2btn.addEventListener('click', () => {
    if (tab2click) {
        tab2.style.display = 'none';
    }
    else {
        tab2.style.display = 'block';
        tab1.style.display = 'none';
        tab3.style.display = 'none';
        // button color */
        tab1btn.style.color='black';
        tab2btn.style.color='blue';
        tab3btn.style.color='black';
        //click false */
        let tab1click = false;
        let tab3click = false;
    }
});
tab3btn.addEventListener('click', () => {
    if (tab3click) {
        tab3.style.display = 'none';
    }
    else {
        tab3.style.display = 'block';
        tab1.style.display = 'none';
        tab2.style.display = 'none';
        // button color */
        tab1btn.style.color='black';
        tab2btn.style.color='black';
        tab3btn.style.color='blue';
        //click false
        let tab2click = false;
        let tab1click = false;
    }
});
