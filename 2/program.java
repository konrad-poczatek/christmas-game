import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Program {
  private static Map<Character, Character> complementMap = new HashMap<>(){{put('{','}');put('(',')');put('[',']');}};
  public boolean areBracketsValid(String brackets) {
    Stack<Character> characterStack = new Stack<>();
    for(Character character : brackets.toCharArray()) {
      if(complementMap.containsKey(character)) {
        characterStack.push(character);
      } else if (characterStack.size() > 0 && complementMap.get(characterStack.peek()).equals(character)) {
        characterStack.pop();
      }
    }
    if(characterStack.isEmpty()) {
      return true;
    }
    return false;
  }
}
