Task desc.:
Write a program that reads a single line of text and splits it (using the split method) into tokens (words), assuming that the separator is either:

One or more whitespace characters (space, tab, etc.), or
One or more punctuation characters (e.g., comma, period, exclamation mark, colon, semicolon).
Print all resulting tokens in separate lines.

Hint:

A suitable expression might be \\s+|\\p{P}+ (where \\p{P} matches punctuation characters).
Remember that in String.split(), the pattern specifies the delimiter.
