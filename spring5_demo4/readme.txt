Aop操作术语：
1.连接点
    类里面哪些方法可以被增强，这些方法统称为连接点
2.切入点
    实际被真正增强的方法，称为切入点
3.通知(增强)
    (1) 实际增强的逻辑部分(切入点内的代码)称为通知
    (2) 通知有多种类型
        前置通知
        后置通知
        环绕通知
        异常通知
        最终通知
4.切面
    是动作
    (1) 把通知应用到切入点的过程

切入点表达式:
execution([权限修饰符] [返回类型] [类全路径] [方法名称].([参数列表])

* 表示所有返回类型 权限修饰符可以省略不写 参数列表用..表示
对UserDao里的add方法进行增强
execution(* com.study.dao.UserDao.add(..))

对UserDao里的所有方法进行增强
execution(* com.study.dao.UserDao.*(..))

对dao包里的所有类以及所有方法进行增强
execution(* com.study.dao.*.*(..))


1.创建基本类
2.创建增强类
3.进行通知配置
    1) spring配置文件中(先创建名称空间context), 开启注释扫描
    <context:component-scan base-package="com.study.spring5.aopanno"></context:component-scan>
    2) 使用注解创建User和UserProxy对象
    3) 在增强类上添加注解@Aspect
    4) 在spring配置文件中开启生成代理对象(先创建名称空间aop)
    <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
4.配置不同类型的通知
    1) 在增强类里, 在作为通知方法上面添加通知类注释, 使用切入点表达式配置
5.相同切入点抽取(相当于公共方法调用)
    1) 创建一个方法, 在方法上面添加注释@Pointcut(value = "切入点表达式")
    2) 在之后的增强类里, 注释里只需要写value = "方法()"
6.有多个增强类同一个方法进行增强, 可以设置优先级
    1) 在增强类上面添加注解 @Order(数字类型值越小), 数字类型值越小优先级越高