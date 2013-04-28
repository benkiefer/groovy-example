package org.burgers.groovy.solutions

import org.burgers.groovy.GroovyHomework
import org.junit.Test

class UrlTest extends GroovyHomework {
    String ben = "https://github.com/benkiefer"
    String spencer = "https://github.com/sherzberg"


    @Test
    void when_did_we_start_on_github(){
        assert "Oct 20, 2010" == startDate(spencer)
        assert "Mar 26, 2012" == startDate(ben)
    }

    private startDate(String url) {
        (new URL(url).text =~ /<span class="join-date">(.*?)<\/span>/)[0][1]
    }

}
