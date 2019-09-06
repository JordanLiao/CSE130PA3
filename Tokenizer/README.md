1. My Tokenizer is written in Java.
2. I am tokenizing Lambda Calculus, and it is written in a way that every
symbol is seperated by a white space.
e ::=    v
|        \ v . e
|        ( e e )
3. To run the Tokenizer, run command "java Tokenizer [text file name]"
4. The output is a text file that has all the tokens printed out in order,
and it would be named "tokenized_[input file name].txt".
5. This tokenizer can tell if the input file does not exist, and it would 
prompt the user to enter a correct file.
