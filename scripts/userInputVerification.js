function isValidEmail(input) {
  var validRegex =
    /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
  if (input.value.match(validRegex)) {
    return true;
  } else {
    return false;
  }
}

function isValidPassword(input) {
  var min = 0;
  var maj = 0;
  var digits = 0;
  var specs = 0;
  for (char of input.value) {
    if ("abcdefghijklmnopqrstuvwxyz".indexOf(char) != -1) {
      min++;
    }
    if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(char) != -1) {
      maj++;
    }
    if ("0123456789".indexOf(char) != -1) {
      digits++;
    }
    if ("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".indexOf(char) != -1) {
      specs++;
    }
  }
  if (
    min > 0 &&
    maj > 0 &&
    digits > 0 &&
    specs > 0 &&
    password.value.length > 7
  ) {
    return true;
  } else return false;
}

const form = document.getElementsByTagName("form")[0];

form.addEventListener('submit', function (event){

  const mail = document.getElementById("mail");
  const password = document.getElementById("password");

  if (!isValidEmail(mail)) {
    mail.placeholder = "Email ou mot de passe incorrect";
    mail.style.outline="3px solid red";
    event.preventDefault();
  }

  if (!isValidPassword(password)) {
    password.style.outline="3px solid red";
    event.preventDefault();
  }
});
