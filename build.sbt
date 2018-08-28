name := "playblog"
 
version := "1.0" 
      
lazy val `playblog` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  jdbc ,
//  "org.playframework.anorm" %% "anorm" % "2.6.1" ,
  anorm ,
  ehcache ,
  ws ,
  specs2 % Test ,
  guice ,
  "mysql" % "mysql-connector-java" % "8.0.11"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      