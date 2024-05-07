
# EmojiLang

Creating my own programming language which involves utilizing an ANTLR parser to generate LLVM code, allowing execution via the "lli" command, which directly runs programs in LLVM bitcode format.

## Sample code written in EmojiLang
```
🌍 luckyNumber = 777;

🤙 int pow( int x, int  index)
👉
    😀 output = x;
    😀 rep = index - 1;
    🔁(rep)👉
        output = output * x;
    👈
    🖨️(output);

    🕸️ message = "You are lucky";
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
```
