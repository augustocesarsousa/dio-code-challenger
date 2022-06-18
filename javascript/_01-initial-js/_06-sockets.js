function sockets() {
  const prompt = require("prompt-sync")({ sigint: true });
  let lines = prompt().split("\n");

  let line = lines.shift().split(" ");
  let soma = 0;

  for (i = 0; i < line.length; i++) {
    let transfor = parseInt(line[i]);
    soma = soma + transfor;
  }
  console.log(soma - 3);
}

sockets();
