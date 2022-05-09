function overtaking() {
  const ps = require("prompt-sync");
  const prompt = ps;
  let R = parseInt(prompt());
  let V = 0;

  while (true) {
    V = parseInt(prompt());
    if (V > R) {
      break;
    }
  }

  let cont = 1;
  let it = R + 1;

  while (true) {
    cont++;
    R = R + it;
    it++;
    if (R > V) {
      console.log(cont);
      break;
    }
  }
}

overtaking();
