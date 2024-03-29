ANTLR=./antlr.jar

generate:
	java -jar $(ANTLR) -package generated -o src/generated src/EmojiLang.g4