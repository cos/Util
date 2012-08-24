package evaluator

import java.lang.management.ManagementFactory

trait ExternalKillable {
  System.err.println(ManagementFactory.getRuntimeMXBean().getName().split('@').head)
}