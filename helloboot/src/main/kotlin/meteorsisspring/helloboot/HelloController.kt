package meteorsisspring.helloboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
//@RequestMapping("/hello")
class HelloController(private val helloService: HelloService) {

    @GetMapping("/hello")
    //fun hello(name: String): String = "Hello $name"
    //@GetMapping
    //@ResponseBody
    fun hello(name: String): String {
        //val simpleHelloService = SimpleHelloService()

        //return simpleHelloService.sayHello(name)
        return helloService.sayHello(name)
    }
}
