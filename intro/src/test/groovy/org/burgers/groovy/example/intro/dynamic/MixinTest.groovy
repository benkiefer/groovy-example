package org.burgers.groovy.example.intro.dynamic

import org.junit.Test

@Category(MyString) class Reversable {
    def flipIt() {
        getValue().reverse()
    }
}

interface MyString {
    String getValue()
}

@Mixin(Reversable)
class MySpecialString implements MyString {
    String value = "potato"
}

class MixinTest {
    @Test
    void behavior_addition() {
        assert "otatop" == new MySpecialString().flipIt()
    }

}
