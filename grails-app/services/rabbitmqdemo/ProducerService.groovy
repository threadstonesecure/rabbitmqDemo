package rabbitmqdemo

class ProducerService {
    void sendPersonMessage(String name, int age) {
        rabbitSend "personTestQueue", new PersonMessage(name, age)
    }
}