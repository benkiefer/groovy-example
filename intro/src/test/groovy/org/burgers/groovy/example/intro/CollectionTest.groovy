package org.burgers.groovy.example.intro

import org.junit.Test

class CollectionTest {
    @Test
    void each(){
        [1, 2, 3].each {
            println it
        }
    }

    @Test
    void each_with_index(){
        [1, 2, 3].eachWithIndex {it, index ->
            assert it - 1 == index
        }
    }

    @Test
    void collect(){
        def result = [1, 2, 3].collect() { it * 2}

        assert result == [2, 4, 6]
    }

    @Test
    void collate(){
        assert [1, 2, 3, 4, 5].collate(2) == [[1, 2], [3, 4], [5]]
    }

    @Test
    void find(){
        assert [1, 2, 3, 4, 5].find { it % 2 == 0 } == 2
    }

    @Test
    void findAll(){
        assert [1, 2, 3, 4, 5].findAll { it % 2 == 0 } == [2, 4]
    }




}
