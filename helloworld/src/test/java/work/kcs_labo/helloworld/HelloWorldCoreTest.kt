package work.kcs_labo.helloworld

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class HelloWorldCoreTest {
  private val core = HelloWorldCore()

  @Before
  fun setUp() {
  }

  @After
  fun tearDown() {
  }

  @Test
  fun getHello() {
    var message = "KC"
    assertEquals("Hello, KC!", core.getHello(message))
    message = "Mizuki"
    assertEquals("Hello, Mizuki!", core.getHello(message))
  }
}