/*
 * Copyright (C) 2009-2016 Lightbend Inc. <https://www.lightbend.com>
 */
package controllers

import play.api.mvc._
import scala.collection.JavaConversions._
import javax.inject.Inject

class Application @Inject() (c: ControllerComponents) extends AbstractController(c) {
  def index = Action {
    Ok
  }
  def post = Action {
    Ok
  }
  def withParam(param: String) = Action {
    Ok(param)
  }
  def takeInt(i: Int) = Action {
    Ok(s"$i")
  }
  def takeBool(b: Boolean) = Action {
    Ok(s"$b")
  }
  def takeBool2(b: Boolean) = Action {
    Ok(s"$b")
  }
  def takeList(x: List[Int]) = Action {
    Ok(x.mkString(","))
  }
  def takeListTickedParam(`b[]`: List[Int]) = Action {
    Ok(`b[]`.mkString(","))
  }
  def takeTickedParams(`b[]`: List[Int], `b%%`: String) = Action {
    Ok(`b[]`mkString(",") + " " + `b%%`)
  }
  def takeJavaList(x: java.util.List[Integer]) = Action {
    Ok(x.mkString(","))
  }
  def urlcoding(dynamic: String, static: String, query: String) = Action {
    Ok(s"dynamic=$dynamic static=$static query=$query")
  }
  def route(parameter: String) = Action {
    Ok(parameter)
  }
  def routetest(parameter: String) = Action {
    Ok(parameter)
  }
  def routedefault(parameter: String) = Action {
    Ok(parameter)
  }
  def hello = Action {
    Ok("Hello world!")
  }
  def interpolatorWarning(parameter: String) = Action {
    Ok(parameter)
  }
}
