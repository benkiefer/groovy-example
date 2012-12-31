package org.burgers.groovy.example.intro.dynamic

import org.junit.Test
import org.junit.Ignore

class BehaviorModificationTest {

    @Test
    void adding_behavior_at_runtime(){
        String.metaClass.backwards = { ->
            delegate.reverse()
        }

        assert "potato" == "otatop".backwards()
    }

    @Ignore("Run this with adding_behavior_at_runtime")
    @Test
    void how_long_does_it_last(){
        assert "potato" == "otatop".backwards()
    }


}
