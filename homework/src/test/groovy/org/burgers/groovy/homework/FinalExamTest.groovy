package org.burgers.groovy.homework

import org.junit.Ignore
import org.junit.Test

class FinalExamTest {
    @Ignore
    @Test
    public void makeHtml() {

        def html = page {
            head = {
                title = "Test Page"
            }
            body = "This is a test"
        }

        assert "<html><head><title>Test Page</title></head><body>This is a test</body></html>" == html

    }

    class HtmlBuilder {
        def title
        def body
        def head

        def page(Closure closure) {
            "<html>${headTag()}${bodyTag()}</html>"
        }

        def headTag(){
            "<head>${titleTag()}</head>"
        }

        def bodyTag(){
            "<body>${body}</body>"
        }

        def titleTag(){
            "<title>${title}</title>"
        }
    }

}




