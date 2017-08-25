package ru.moex.api;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

@RunWith(SpringRunner.class)
public class DateFormatTest {

    @Test
    public void test() throws ParseException {
        DateFormat df = new ISO8601DateFormat();
        Date parse = df.parse("2017-08-25T11:16:43.752Z");
        System.out.println(parse);
    }

}
