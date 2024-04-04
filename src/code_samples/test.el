🌍 luckyNumber = 777;

🤙 int pow( int x, int  index)
👉
    😀 output = x;
    😀 rep = index - 1;
    🔁(rep)👉
        output = output * x;
    👈
    🖨️(output);

    🕸️ message = "Nice";
    🤔(luckyNumber == output)👉
        🖨️(message);
    👈

    ret output;
👈

🤙 int start()
👉
    😀 base = 0;
    😀 idx = 0;
    📖(base);
    📖(idx);

    🧨pow(base, idx);

    ret base;
👈

🧨start();