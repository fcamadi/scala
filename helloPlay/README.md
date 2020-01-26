
0) Create folder:

> mkdir HelloPlay

and go inside

> cd HelloPlay


1)  Create project using sbt and a gitter8 template:

> sbt new playframework/play-scala-seed.g8


2) Then

> sbt run

after a while, when all the necessary libraries were downloaded, the app can accessed at

http://localhost:9000/


the last lines ... 


> --- (Running the application, auto-reloading is enabled) ---

> [info] p.c.s.AkkaHttpServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000

> (Server started, use Enter to stop and go back to the console...)

> [info] Compiling 7 Scala sources and 1 Java source to /home/francd/workspaceScala/HelloPlay/helloplay/target/scala-2.13/classes ...
> [info] Non-compiled module 'compiler-bridge_2.13' for Scala 2.13.1. Compiling...
8 warnings found
> [info]   Compilation completed in 45.083s.
> [info] p.a.h.EnabledFilters - Enabled Filters (see <https://www.playframework.com/documentation/latest/Filters>):

    play.filters.csrf.CSRFFilter
    play.filters.headers.SecurityHeadersFilter
    play.filters.hosts.AllowedHostsFilter

> [info] play.api.Play - Application started (Dev) (no global state)


(You will see a simple "Welcome to Play!")
