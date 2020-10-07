package com.userregistration;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserEmailSampleTest {

    private String emailTest;
    private boolean expectedResult;

    public UserEmailSampleTest( String emailTest, boolean expectedResult) {
      super();
      this.emailTest = emailTest;
      this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", false},
                {"abc-100@yahoo.com", false},
                {"abc.100@yahoo.com", false},
                {"abc111@abc.com", false},
                {"abc-100@abc.net", false},
                {"abc.100@abc.com.au", false},
                {"abc@1.com", false},
                {"abc@gmail.com.com", false},
                {"abc+100@gmail.com", false},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }


    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTure()
    {
        UserEmailSample emailSample = new UserEmailSample();
        boolean result = emailSample.emailSampleEmailTest(this.emailTest);
        Assert.assertEquals(this.expectedResult,result);
    }
}
