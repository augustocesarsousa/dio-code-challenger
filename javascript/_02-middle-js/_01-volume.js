function volume(params) {
  const PI = 3.14159;

  let R = parseFloat(params);

  R = (4.0 / 3) * PI * Math.pow(R, 3);

  console.log("VOLUME = " + R.toFixed(3));
}

volume(1523);
