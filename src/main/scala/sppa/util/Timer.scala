package sppa.util

import java.util.TimerTask

object Timer {
  def apply(delay: Long, period: Long)(op: => Unit) = {
    val timer = new java.util.Timer()
    timer.schedule(new TimerTask() {
      def run() {
        op
      }
    }, delay, period)
    timer
  }
  def apply(delay: Long)(op: => Unit) = {
    val timer = new java.util.Timer()
    timer.schedule(new TimerTask() {
      def run() {
        op
      }
    }, delay)
    timer
  }
}

object Timeout extends Exception("Timeout")