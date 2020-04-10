name := "cs455-spark"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
	"org.apache.commons" % "commons-csv" % "1.1",
	"org.apache.spark" %% "spark-sql" % "2.3.0",
	"org.apache.spark" %% "spark-mllib" % "2.3.0"
)	
