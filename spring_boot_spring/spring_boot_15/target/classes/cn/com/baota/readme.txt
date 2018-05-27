3.7测试
        测试时开发工作中不可缺少的部分。单元测试只针对当前开发的类和方法进行测试，可以简单通过模拟依赖来实现，
    对运行环境没有依赖；但是仅仅进行单元测试时不够的，它只能验证当前类或方法能否正常工作，而我们想知道系统
    的各部分组合在一起是否能正常工作，这就是集成测试存在的意义。
        集成测试一般需要来自不同层的不同对象的交互，如数据库、网络连接、IOC容器等。其实我们也经常通过运行程序，
    然后通过自己操作来完成类似于集成测试的流程。集成测试为我们提供了一种无须部署或运行来完成验证系统各部分
    是否能正常协同工作的能力。
    Spring通过Spring TestContext Framework对集成测试提供顶级支持。它不依赖于特定的测试框架，既可以使用Junit，
    也可以使用TestNG.
        基于Maven构建的项目结构默认有关于测试的目录：src/test/java（测试代码）、src/test/resorces（测试资源），
    区别于src/main/java（项目源码）、src/main/resorces（项目资源）。
        Spring提供了一个SpringJUnit4ClassRunner类，它提供了Spring TestContext Framework的功能。通过@ContextConfiguration
    来配置Application Context,通过@ActiveProfiles确定活动的profile。在使用了Spring测试后，我们前面的例子的运行部分都可以
    用Spring测试来验证功能是否正常运作。
    集成测试设计程序中的各个分层，本节自对简单配置的Application Context和在测试中注入Bean做演示。
