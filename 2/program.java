class Program {
  public boolean areBracketsValid(String brackets) {
    char[] chars = brackets.toCharArray();

    Stack<Character> stack = new Stack<>();
    int i = 0;
    while (i < chars.length) {
      switch (chars[i]) {
        case '{' -> stack.push(chars[i]);
        case '}'-> {
          boolean check = checkBracket(stack, '{');
          if (!check && stack.empty()){
            return false;
          }
        }
        case '(' -> stack.push(chars[i]);
        case ')'-> {
          boolean check = checkBracket(stack, '(');
          if (!check && stack.empty()){
            return false;
          }
        }
        case '[' -> stack.push(chars[i]);
        case ']'-> {
          boolean check = checkBracket(stack, '[');
          if (!check && stack.empty()){
            return false;
          }
        }
      }
      i++;
    }
    return true;
  }

  private boolean checkBracket(Stack<Character> stack, char openBracket){
    while (!stack.empty()){
      Character current =stack.pop();
      if(current == openBracket){
        return true;
      }
    }
    return false;
  }
}
