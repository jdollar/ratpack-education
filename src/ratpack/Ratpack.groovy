import io.github.jdollar.endpoints.TestEndpoints
import io.github.jdollar.endpoints.TestModule
import ratpack.groovy.template.MarkupTemplateModule

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
  bindings {
    module MarkupTemplateModule
    module TestModule
  }

  handlers {
    get {
      render groovyMarkupTemplate("index.gtpl", title: "My Ratpack App")
    }

    prefix('test') {
      all chain(registry.get(TestEndpoints))
    }

    files { dir "public" }
  }
}
