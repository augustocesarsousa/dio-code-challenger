function calc() {
  const prompt = require("prompt-sync")({ sigint: true });
  let N = parseInt(prompt());
  let result = ((N - 3) * N) / 2;
  console.log(result);
}

calc();
