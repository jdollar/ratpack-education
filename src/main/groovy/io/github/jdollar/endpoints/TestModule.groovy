package io.github.jdollar.endpoints

import com.google.inject.AbstractModule

class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TestEndpoints).toInstance(new TestEndpoints())
    }
}
