function rest() {
  const prompt = require("prompt-sync")({ sigint: true });
  let N = parseInt(prompt());

  for (let i = 1; i < 10000; i++) {
    if (i % N == 2) console.log(i);
  }
}

rest();
