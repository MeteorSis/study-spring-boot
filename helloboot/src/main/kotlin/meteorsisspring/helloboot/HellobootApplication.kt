package meteorsisspring.helloboot

import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.tomcat.servlet.TomcatServletWebServerFactory
import org.springframework.boot.web.server.servlet.ServletWebServerFactory
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType

@SpringBootApplication
class HellobootApplication

fun main(args: Array<String>) {
    // runApplication<HellobootApplication>(*args)
    val serverFactory: ServletWebServerFactory = TomcatServletWebServerFactory()
    val webServer =
        serverFactory.getWebServer({
            val helloController = HelloController()

            it
                .addServlet(
                    "frontcontroller",
                    object : HttpServlet() {
                        @Override
                        override fun service(
                            req: HttpServletRequest?,
                            resp: HttpServletResponse?,
                        ) {
                            // 인증, 보안, 다국어, 공통 기능
                            if (req?.requestURI == "/hello" && req.method == HttpMethod.GET.name()) {
                                val name = req.getParameter("name")

                                val ret = helloController.hello(name)

                                resp?.status = HttpStatus.OK.value()
                                resp?.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_PLAIN_VALUE)
                                resp?.writer?.println(ret)
                            } else {
                                resp?.status = HttpStatus.NOT_FOUND.value()
                            }
                        }
                    },
                ).addMapping("/*")
        })
    webServer.start()
}
