document.addEventListener("DOMContentLoaded", function () {
    var generateButton = document.getElementById("generateTopSheet");
    var canvas = document.getElementById("topSheetCanvas");
    var downloadLink = document.getElementById("downloadLink");

    generateButton.addEventListener("click", function () {
        var instituteName = document.getElementById("instituteName").value;
        var subjectName = document.getElementById("subjectName").value;
        var projectTitle = document.getElementById("projectTitle").value;
        var userName = document.getElementById("userName").value;

        var ctx = canvas.getContext("2d");

        // Clear the canvas
        ctx.clearRect(0, 0, canvas.width, canvas.height);

        // Draw the top sheet content
        ctx.fillStyle = "white";
        ctx.fillRect(0, 0, canvas.width, canvas.height);

        ctx.fillStyle = "black";
        ctx.font = "16px Arial";
        ctx.fillText(`Institute Name: ${instituteName}`, 10, 30);
        ctx.fillText(`Subject Name: ${subjectName}`, 10, 60);
        ctx.fillText(`Project Title: ${projectTitle}`, 10, 90);
        ctx.fillText(`Name: ${userName}`, 10, 120);

        // Create a data URL from the canvas
        var dataURL = canvas.toDataURL("image/png");

        // Set the download link
        downloadLink.href = dataURL;
        downloadLink.download = "top_sheet.png";
        downloadLink.style.display = "block";
    });
});
