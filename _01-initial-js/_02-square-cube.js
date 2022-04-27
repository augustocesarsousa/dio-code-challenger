function square(number) {
    let limit = parseInt(number);

    for (let i = 1; i <= limit; i++) {
        let X =(   i * i   );
        let Y = (  X * i   );

        console.log(i + ' ' + X + ' ' + Y);
    }
}

square(5);