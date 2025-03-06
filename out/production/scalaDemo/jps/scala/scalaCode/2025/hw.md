# Homework (2022)

# 实践作业04
1.IDEA中关联查看Scala源代码

问题1：idea中怎样关联查看Scala源代码
解决方法：https://blog.csdn.net/Zp_insist/article/details/125160333

2.命令行方式，编译并执行scala代码
编译非脚本文件
非脚本文件一定是以定义结尾的，
例如：定义的class、object、package等等。
新建一个Scala文件，输入以下代码并保存：

 `class He {
 val dh = "Hello, Dong Hui"
 def show() = println(dh)
 }`

这样，就完成了一个非脚本文件的编写。
在这个文件的路径下打开CMD、PowerShell或者终端(不需要进入解释器)，
并运行“scalac 文件名.scala”，就会在当前目录下得到一个名为“He.class”的文件。

注意“scala”和“scalac”命令的区别，前者用于运行脚本文件，后者则是启动Scala编译器来编译非脚本文件。

此外，"fsc 文件名.scala"命令也可以用来编译文件，
只不过“scalac”在完成后会自动关闭编译器，而“fsc”会保持编译器在后台运行，下次编译时就无需再次启动。

接着，要使用刚才编译好的文件，
然后使用"scala"命令进入解释器。
在解释器里，就可以通过关键字“new”来创建He类的对象，并执行相应的操作。
例如：

scala> val he = new He

he: He = He@74075134

scala> he.show()

Hello, Dong Hui

scala> he.dh

res1: String = Hello, Dong Hui

# 实践作业03
- 1.登录gitee.com官网，未注册账号的请先注册，已经注册的请登录
- 2.新建仓库jps,仓库名越短越方便，尽量控制在4个字母左右，名称和空间地址也是越短越好
例如：https://gitee.com/ahst/jps
- 3.在D盘创建类似的文件夹，D:\gitee\ahst\jps
- 4.在D:\gitee\ahst\jps文件夹中，分别创建java、python、scala等子文件夹
- 5.通过IDEA创建scalaCode项目，保存到scala文件夹中
- 6.创建第一个Hello.scala

`例如：
object Hello {
def main(args: Array[String]): Unit = {
println("Hello Scala!")
}
}`

- 7.关联代码托管平台jps，使用git上传代码

# 实践作业02
- 1.idea中安装scala插件
- 2.使用idea开发scala程序，输出 Hello, Scala!

# 实践作业01
- 1.登录scala语言官方（www.scala-lang.org），简单浏览其内容
- 2.下载安装包（Windows系统使用的scala-2.12.8.zip，Linux系统使用的scala-2.12.8.tgz）
- 3.下载源码包（scala-sources-2.12.8.tar.gz）
- 4.在D盘创建文件夹（D:\software\scala-all），用于存放scala的安装包及源码包
- 5.分别在Windows系统和Linux系统安装scala，输入"scala -version"命令，验证scala是否安装成功。
