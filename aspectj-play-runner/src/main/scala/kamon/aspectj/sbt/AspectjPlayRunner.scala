/*
 * =========================================================================================
 * Copyright © 2013-2015 the kamon project <http://kamon.io/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 * =========================================================================================
 */

package kamon.aspectj.sbt

import sbt._

object AspectjPlayRunner extends AutoPlugin {
  import AspectjRunner._
  import runner.PlayRunner._

  override def trigger = AllRequirements
  override def requires = play.sbt.Play && AspectjRunner

  override lazy val projectSettings: Seq[Setting[_]] =  inConfig(Runner)(playRunSettings())
}
