package org.burgers.groovy.example.intro.pattern

import org.junit.Test

import java.util.regex.Matcher
import java.util.regex.Pattern

class PatternTest {
    String words = "onefootfour"

    @Test
    void matcher_java(){
        Pattern pattern = Pattern.compile('.*?(f.*t).*?')
        Matcher matcher = pattern.matcher(words)

        assert matcher.matches()
        assert matcher.group(1) == "foot"
    }

    @Test
    void matcher_groovy(){
        Matcher result = words =~ /.*?(f.*t).*?/
        assert result[0][1] == "foot"
    }

    @Test
    void check_matches(){
        Boolean result = words ==~ /.*?(f.*t).*?/
        assert result
    }

}
