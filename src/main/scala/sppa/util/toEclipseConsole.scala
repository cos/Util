package sppa.util

object toEclipseConsole extends App {
  println(scala.io.Source.fromFile("/Users/cos/workspaces/iterace/target/results/coref/T_F_B_d-S_.races").mkString)
}