var project1 = document.getElementById("project-1")
var project2 = document.getElementById("project-2")


function openproject(event) {
    var project = event.target;



    if (project === project1) {
        window.open("projects/admin-panel/index.html")

    } else if (project === project2) {
        window.open("projects/project-2/index.html")
    }

}

//set function in your project  variable
project1.addEventListener("click", openproject);
project2.addEventListener("click", openproject);
