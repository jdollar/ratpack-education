package io.github.jdollar.endpoints

import ratpack.func.Action
import ratpack.groovy.Groovy
import ratpack.handling.Chain

class TestEndpoints implements Action<Chain> {
    @Override
    void execute(Chain chain) throws Exception {
        Groovy.chain(chain) {
            prefix(':id') {
                get {
                    render "GET TEST"
                }
            }
        }
    }
}
