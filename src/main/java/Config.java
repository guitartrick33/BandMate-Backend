import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${queue.name}")
    private String queueName;

    @Value("${xchange.name}")
    private String directXchangeName;

    @Bean
    @Qualifier("queue")
    public Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    @Qualifier("queueTest")
    public Queue queueTest() {
        return new Queue("queueTest");
    }

    @Bean
    @Qualifier("directExchange")
    public DirectExchange directExchange() {
        return new DirectExchange(directXchangeName);
    }


    @Bean
    public Binding binding(@Qualifier("directExchange") DirectExchange exchange, @Qualifier("queue")Queue queue) {
        return BindingBuilder.bind(queue).to(exchange).with("roytuts");
    }

    @Bean
    public Binding bindingTest(@Qualifier("directExchange") DirectExchange exchangeTest, @Qualifier("queueTest")Queue queueTest) {
        return BindingBuilder.bind(queueTest).to(exchangeTest).with("test");
    }

    @Bean
    public Server server() {
        return new Server();
    }

}