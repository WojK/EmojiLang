🌍 globalTwo = 2;
🌍 globalOne = 5.1;

🤙 real funcOne( real x )
👉
    🖨️(x);
    ret: x;
👈

🤙 real funcTwo()
👉
    😀 arg = 1.1;
    😀 argTwo = 2.2;
    😀 argThree = globalOne + argTwo;
    😀 argFour = argThree + 1.0;

    🧨funcOne(argFour);
    ret: arg;
👈

🧨funcTwo();