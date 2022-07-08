function calc() {
  const prompt = require("prompt-sync")({ sigint: true });
  let line = prompt().split(" ");
  const a = line[0];
  const b = line[1];
  console.log(a * b);
}

calc();
