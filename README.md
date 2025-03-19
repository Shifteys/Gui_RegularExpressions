Task desc.:
Write a program that finds paired quotes (both single '...' and double "...") along with their contents, with the condition that the opening and closing quotes match in type.

Use capturing groups and a backreference, for instance ( ['"] ) [^'"]* \1.
Print all matched occurrences (including the quote marks themselves).
Hint:

Notice the sequence (['"]), which matches either ' or ", and the final \\1 that enforces the same type of quote for closing.
