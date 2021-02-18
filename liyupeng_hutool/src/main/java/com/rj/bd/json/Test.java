package com.rj.bd.json;
/**
 * @desc   JSON转XML
 * @author LYP
 * @time   2021-02-15
 */
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

public class Test {
	public static void main(String[] args) {
		String jsonStr = "{\n" +
                "    \"DayFlowInfoQryReq\": {\n" +
                "        \"IDItemRange\": 13567895432,\n" +
                "        \"BizType\": \"01\",\n" +
                "        \"POCont\": {\n" +
                "            \"OprTime\": 20210103161025,\n" +
                "            \"BooleanTest\": true\n" +
                "        },\n" +
                "        \"IDType\": 12,\n" +
                "        \"IdentCode\": \"3240ad5b9b43a\"\n" +
                "    }\n" +
                "}";
        String xmlStr = JSONUtil.toXmlStr(new JSONObject(jsonStr));
        System.out.println(xmlStr);
	}
}
