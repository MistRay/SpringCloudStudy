package com.example.streamserver;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class StreamServerApplicationTests {

	@Test
	public void contextLoads() {
        Map<Integer, BigDecimal> hashMap = new HashMap<>();
        BigDecimal bigDecimal = hashMap.get(0) == null ? new BigDecimal(0.0) : hashMap.get(0);
        BigDecimal decimal = new BigDecimal(1.0).add(bigDecimal);
        System.out.println(decimal.doubleValue());
    }

}
