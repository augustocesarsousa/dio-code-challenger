function sorting() {
  const prompt = require("prompt-sync")({ sigint: true });
  let totalItems = parseInt(prompt());
  let pares = [];
  let impares = [];

  for (let i = 0; i < totalItems; i++) {
    let number = parseInt(prompt());
    if (number % 2 === 0) {
      pares.push(number);
    } else {
      impares.push(number);
    }
  }

  pares.sort((a, b) => a - b);
  impares.sort((a, b) => b - a);

  for (let i = 0; i < pares.length; i++) {
    console.log(pares[i]);
  }

  for (let i = 0; i < impares.length; i++) {
    console.log(impares[i]);
  }
}

sorting();
