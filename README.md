# test_protobuf
Showing an error with scala protobuf generation
If you run

  `sbt compile`

You will get the following error:

    [error] /Users/scott/Development/projects/adamatic/squbes/protobuf_scala_test/target/src_managed/main/compiled_protobuf/test/ContentCategory.scala:11: method isIab11 is defined twice
    [error]   conflicting symbols both originated in file '/Users/scott/Development/projects/adamatic/squbes/protobuf_scala_test/target/src_managed/main/compiled_protobuf/test/ContentCategory.scala'
    [error]   def isIab11: Boolean = false
    [error]       ^
    [error] one error found
    [error] (compile:compileIncremental) Compilation failed


Because the scala it generates is like so:

````scala
// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!

package test


import com.trueaccord.scalapb.Descriptors

sealed trait ContentCategory extends com.trueaccord.scalapb.GeneratedEnum {
  def isIab11: Boolean = false
  def isIab11: Boolean = false
}

object ContentCategory extends com.trueaccord.scalapb.GeneratedEnumCompanion[ContentCategory] {
  @SerialVersionUID(0L)
  case object IAB1_1 extends ContentCategory {
    val id = 2
    val name = "IAB1_1"
    override def isIab11: Boolean = true
  }

  @SerialVersionUID(0L)
  case object IAB11 extends ContentCategory {
    val id = 191
    val name = "IAB11"
    override def isIab11: Boolean = true
  }

  lazy val values = Seq(IAB1_1, IAB11)
  def fromValue(value: Int): ContentCategory = value match {
    case 2 => IAB1_1
    case 191 => IAB11
  }
  lazy val descriptor = new Descriptors.EnumDescriptor(0, "ContentCategory", this)
}
```