package chapter6;

import org.junit.Assert;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author LitheLight
 * @date 2019/6/1
 */
public class TestConcurrentHashMap{
    public static void main(String[] args){
        //初始化ConcurrentHashMap
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap();
        //新增个人信息
        map.put("id","1");
        map.put("name","andy");
        map.put("sex","男");
        //获取姓名
        String name = map.get("name");
        Assert.assertEquals(name,"andy");
        //计算大小
        int size = map.size();
        Assert.assertEquals(size,3);
    }
}
