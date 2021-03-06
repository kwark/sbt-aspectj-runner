name := "kamon-play"

version := "1.0"

scalaVersion := "2.11.7"

val kamonVersion = "0.6.2-bda51ea175d734025bf36abb0f8678a5d1c0959d"

val resolutionRepos = Seq("Kamon Repository Snapshots" at "http://snapshots.kamon.io")

val dependencies = Seq(
  "io.kamon"    %% "kamon-core"           % kamonVersion,
  //"io.kamon"    %% "kamon-akka"           % kamonVersion,
  "io.kamon"    %% "kamon-play-25"        % kamonVersion,
  "io.kamon"    %% "kamon-log-reporter"   % kamonVersion
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
                                      .settings(resolvers ++= resolutionRepos)
                                      .settings(libraryDependencies ++= dependencies)

//In order to run the example:
//1 - sbt
//2 - aspectj-runner:run -Dconfig.file=conf/application.conf
//3 - enjoy!!!
