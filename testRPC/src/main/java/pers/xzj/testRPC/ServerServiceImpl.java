package pers.xzj.testRPC;

import java.util.HashMap;
import java.util.Map;

public class ServerServiceImpl implements ServerService {
    private static Map<String,Object> map = new HashMap<>();
    static {
        map.put("aaa","111");
        map.put("bbb","222");
        map.put("ccc","333");
    }

    public String get(String key) {
        Object obj = map.get(key);
        if(null == obj){
            return null;
        }
        if(obj instanceof String){
            return (String)obj;
        }
        return obj.toString();
    }
}

