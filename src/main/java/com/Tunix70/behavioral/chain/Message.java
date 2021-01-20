package main.java.com.Tunix70.behavioral.chain;

public abstract class Message{
    private int levelChain;
    private Message nextMessage;

    public Message(int levelChain) {
        this.levelChain = levelChain;
    }

    public void setNextMessage(Message nextMessage) {
        this.nextMessage = nextMessage;
    }

    public void MessageManager(String problem, int level) {
        if (level >= levelChain){
            write(problem);
        }
        if(nextMessage != null){
            nextMessage.MessageManager(problem, level);
        }
    }

    public abstract void write(String problem);
}
