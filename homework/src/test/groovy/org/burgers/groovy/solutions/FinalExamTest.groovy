package org.burgers.groovy.solutions

import org.junit.Test

class FinalExamTest {
//    you can use this
//    @Delegate
//    HtmlBuilder builder = new HtmlBuilder()

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

//  or this
    def methodMissing(String name, args){
        if (name == "page"){
            new HtmlBuilder().invokeMethod(name, args)
        }
    }

    // here are some hints...
    class HtmlBuilder {
        def title
        def body
        def head

        def page(Closure closure) {
            // you need this
            closure.delegate = this
            closure()
            "<html>${headTag()}${bodyTag()}</html>"
        }

        def headTag(){
            // you need this
            head.delegate = this
            head()
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




