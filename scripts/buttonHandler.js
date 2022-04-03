const writeButton = document.getElementById('write-button');
writeButton.addEventListener('click', function (event) {
    const textInput = document.getElementById("text");
    const buttonDiv = document.getElementsByClassName("button-container")[0];
    writeButton.style.display = "none";
    textInput.style.display = "block";
    buttonDiv.style.display = "block";
})

const closeButton = document.getElementById('close-button');
closeButton.addEventListener('click', function (event) {
    const writeButton = document.getElementById('write-button');
    const textInput = document.getElementById("text");
    const buttonDiv = document.getElementsByClassName("button-container")[0];
    textInput.style.display = "none";
    buttonDiv.style.display = "none";
    writeButton.style.display = "block";  
})