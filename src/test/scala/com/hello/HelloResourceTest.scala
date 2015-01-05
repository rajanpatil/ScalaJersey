package com.hello

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class HelloResourceTest extends FunSuite with ShouldMatchers{

  test("it should get hello msg"){
    val hello = new HelloResource
    hello.doGet should be("<html><body><h1>hello jersey/scala world!</h1></body></html>")
  }

}
