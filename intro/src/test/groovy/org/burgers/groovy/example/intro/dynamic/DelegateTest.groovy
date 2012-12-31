package org.burgers.groovy.example.intro.dynamic

import org.junit.Test

class DelegateTest {
    class MyString {
        @Delegate
        String value = "potato"
    }

    @Test
    void delegation_with_at_delegate(){
        assert "otatop" == new MyString().reverse()
    }

}
