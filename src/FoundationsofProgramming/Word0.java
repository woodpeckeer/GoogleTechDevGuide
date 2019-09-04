package FoundationsofProgramming;

import java.util.HashMap;
import java.util.Map;

public class Word0 {

  public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> responseMap = new HashMap<>();
    for (String str : strings) {
      if (!responseMap.containsKey(str)) {
        responseMap.put(str, 0);
      }
    }
    return responseMap;
  }
}
