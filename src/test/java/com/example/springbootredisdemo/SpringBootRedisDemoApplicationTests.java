package com.example.springbootredisdemo;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.redisson.Redisson;
import org.redisson.api.RBatch;
import org.redisson.api.RListAsync;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@SpringBootTest
class SpringBootRedisDemoApplicationTests {
    @Resource
    private StringRedisTemplate stringRedisTemplate;

/*    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private RedissonClient redissonClient;*/

    @Test
    void contextLoads() {
        stringRedisTemplate.delete("wang");
        /*JSONObject jsonObject = new JSONObject();
        jsonObject.put("qq","qq");
        jsonObject.put("ww","ww");
        stringRedisTemplate.opsForValue().set("tttt",jsonObject.toJSONString());*/
/*
      stringRedisTemplate.opsForValue().set("wang","qing");
*/
         /* stringRedisTemplate.opsForHash().put("wa","hah","tt");
        stringRedisTemplate.opsForSet().add("nss","111","222","333");
        stringRedisTemplate.opsForList().leftPushAll("ddd","111","222","333");
        stringRedisTemplate.opsForZSet().add("eee","111",555);
        stringRedisTemplate.opsForZSet().add("eee","333",444);*/

        /* stringRedisTemplate.opsForValue().set("wang","1111");*/


/*
        stringRedisTemplate.opsForValue().set("time", "aaa", 1, TimeUnit.MINUTES);
*/


//        stringRedisTemplate.opsForValue().setIfAbsent("time", "fff");

        /*    stringRedisTemplate.opsForHash().delete("wa","sdas");*/
/*
        stringRedisTemplate.opsForHash().put("wa","sdas","tt");


*/
/*
        stringRedisTemplate.opsForSet().remove("nss","222");
*/

        /*       stringRedisTemplate.opsForList().remove("ddd",1,"333");*/

        /*String ddd = stringRedisTemplate.opsForList().rightPop("ddd");

        System.out.println(ddd);

        assert ddd != null;
        stringRedisTemplate.opsForList().rightPush("ddd",ddd);*/

/*        List<String> ddd = stringRedisTemplate.opsForList().range("ddd", 0, 2);
        System.out.println(ddd);
        stringRedisTemplate.opsForList().rightPushAll("ddd",ddd);*/

/*
        RBatch batch = redissonClient.createBatch();
        RListAsync<Object> ddd = batch.getList("ddd");
        System.out.println(ddd);
*/

     /*   List<Object> ddd = stringRedisTemplate.executePipelined(new SessionCallback<List<String>>() {
            @Override
            public <K, V> List<String> execute(RedisOperations<K, V> operations) throws DataAccessException {
                ListOperations<String, Object> stringObjectListOperations =
                        (ListOperations<String, Object>) operations.opsForList();
                for (int i = 0; i < 3; i++) {
                    stringObjectListOperations.leftPop("ddd");
                }
                return null;
            }
        });
        System.out.println(ddd);*/


       /* List<Object> ddd = stringRedisTemplate.executePipelined(new RedisCallback<List<String>>() {
            @Override
            public List<String> doInRedis(RedisConnection connection) throws DataAccessException {
                StringRedisConnection stringRedisConn = (StringRedisConnection) connection;
                for (int i = 0; i < 3; i++) {
                    stringRedisConn.lPop("ddd");
                }
                return null;
            }
        });
        System.out.println(ddd);
        List<String> collect = ddd.stream().map(o -> String.valueOf(o)).collect(Collectors.toList());
        stringRedisTemplate.opsForList().rightPushAll("ddd",collect);*/
    }

}
