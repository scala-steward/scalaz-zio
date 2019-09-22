resolvers += Resolver.bintrayRepo("ktosopl", "sbt-plugins/sbt-jcstress")

addSbtPlugin("pl.project13.scala"                % "sbt-jmh"                   % "0.3.7")
addSbtPlugin("pl.project13.scala"                % "sbt-jcstress"              % "0.2.0")
addSbtPlugin("org.scala-js"                      % "sbt-scalajs"               % "0.6.29")
addSbtPlugin("org.portable-scala"                % "sbt-scalajs-crossproject"  % "0.6.1")
addSbtPlugin("org.scalameta"                     % "sbt-scalafmt"              % "2.0.5")
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"             % "0.9.0")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"          % "3.0.0")
addSbtPlugin("com.github.cb372"                  % "sbt-explicit-dependencies" % "0.2.10")
addSbtPlugin("de.heikoseeberger"                 % "sbt-header"                % "5.2.0")
addSbtPlugin("ch.epfl.lamp"                      % "sbt-dotty"                 % "0.3.4")
addSbtPlugin("org.scalameta"                     % "sbt-mdoc"                  % "1.3.2")
addSbtPlugin("ch.epfl.scala"                     % "sbt-bloop"                 % "1.3.2")
addSbtPlugin("com.dwijnand"                      % "sbt-dynver"                % "4.0.0")
addSbtPlugin("com.jsuereth"                      % "sbt-pgp"                   % "1.1.2")
addSbtPlugin("org.xerial.sbt"                    % "sbt-sonatype"              % "3.7")
