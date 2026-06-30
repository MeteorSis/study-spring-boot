package meteorsisspring.helloboot

import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.tomcat.servlet.TomcatServletWebServerFactory
import org.springframework.boot.web.server.servlet.ServletWebServerFactory
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.registerBean
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.context.support.GenericWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet

@SpringBootApplication
class HellobootApplication

fun main(args: Array<String>) {
    runApplication<HellobootApplication>(*args)
    //val appCtx = GenericApplicationContext()
    //val appCtx = GenericWebApplicationContext()
//    val appCtx = object : GenericWebApplicationContext() {
//        override fun onRefresh() {
//            super.onRefresh()
//
//            val serverFactory: ServletWebServerFactory = TomcatServletWebServerFactory()
//            val webServer =
//                serverFactory.getWebServer({
//                    it
//                        .addServlet(
//                            "dispatcherServlet",
//                            DispatcherServlet(this)
//                        ).addMapping("/*")
//                })
//            webServer.start()
//        }
//    }
//    appCtx.registerBean<HelloController>()
//    appCtx.registerBean<SimpleHelloService>()
//    appCtx.refresh()

//    val serverFactory: ServletWebServerFactory = TomcatServletWebServerFactory()
//    val webServer =
//        serverFactory.getWebServer({
//            it
//                .addServlet(
//                    *//*"frontcontroller",
//                    object : HttpServlet() {
//                        @Override
//                        override fun service(
//                            req: HttpServletRequest?,
//                            resp: HttpServletResponse?,
//                        ) {
//                            // 인증, 보안, 다국어, 공통 기능
//                            if (req?.requestURI == "/hello" && req.method == HttpMethod.GET.name()) {
//                                val name = req.getParameter("name")
//
//                                val helloController = appCtx.getBean<HelloController>()
//                                val ret = helloController.hello(name)
//
//                                //resp?.status = HttpStatus.OK.value() // 생략 가능
//                                //resp?.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_PLAIN_VALUE)
//                                resp?.contentType = MediaType.TEXT_PLAIN_VALUE
//                                resp?.writer?.println(ret)
//                            } else {
//                                resp?.status = HttpStatus.NOT_FOUND.value()
//                            }
//                        }
//                    },*//*
//                    "dispatcherServlet",
//                    DispatcherServlet(appCtx)
//                ).addMapping("/*")
//        })
//    webServer.start()
}
