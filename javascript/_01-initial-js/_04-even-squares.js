function evenSquares() {
  const prompt = require("prompt-sync")({ sigint: true });
  var N = parseInt(prompt());

  for (let i = 1; i <= N; i++) {
    if (i % 2 === 0) console.log(`${i}^2 = ${i ** 2}`);
  }
}

evenSquares();
