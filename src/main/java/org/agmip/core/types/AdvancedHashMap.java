package org.agmip.core.types;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class AdvancedHashMap<K, V> extends HashMap<K,V> {

  public AdvancedHashMap(int initialCapacity, float loadFactor) {
    super(initialCapacity, loadFactor);
  }
  
  public AdvancedHashMap(int initialCapacity) {
    super(initialCapacity);
  }
  
  public AdvancedHashMap(Map map) {
    super(map);
  }
  
  public AdvancedHashMap() {
    super();
  }  

  public V getOr(K key, V defaultValue) {
    V realValue = super.get(key);
    return (realValue == null) ? defaultValue : realValue;
  }

  public void put(Map t) {
    super.putAll(t);
  }
}
