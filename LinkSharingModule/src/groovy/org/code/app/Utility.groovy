package org.code.app

import com.src.main.resource.Topic

/**
 * Created by mj on 26/1/16.
 */
class Utility {
    static Map getSortedMapByValue(Map trendingTopics) {
        List mapKeys = new ArrayList(trendingTopics.keySet());
        List mapValues = new ArrayList(trendingTopics.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap sortedMap = new LinkedHashMap();

        Iterator valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Object val = valueIt.next();
            Iterator keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                Object key = keyIt.next();
                String comp1 = trendingTopics.get(key).toString();
                String comp2 = val.toString();

                if (comp1.equals(comp2)) {
                    trendingTopics.remove(key);
                    mapKeys.remove(key);
                    sortedMap.put((String) key, (Double) val);
                    break;
                }

            }
        }
        return sortedMap;
    }

    static Map getSortedUncomparableMapByValue(Map passedMap) {
        for (def key : passedMap.keySet()) {
            int index = passedMap.findIndexOf { key };
            for (int value : passedMap.values()) {

            }
        }
    }
}
