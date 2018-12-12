package us.team7pro.EventTicketsApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import us.team7pro.EventTicketsApp.Models.Trasaction;
import us.team7pro.EventTicketsApp.Repositories.TransactionRepository;
import java.util.ArrayList;
import java.util.List;




@Component
public class TransactionSeeder implements CommandLineRunner {
    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionSeeder(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
        List<Trasaction> trasactions =  new ArrayList<>();


        trasactions.add(new Trasaction(5, "test1", 1, "Kygo Music"));
        trasactions.add(new Trasaction(6, "test2", 1, "Kygo Music"));
        trasactions.add(new Trasaction(5, "test3", 2, "Ultra Music Festival"));
        trasactions.add(new Trasaction(7, "test1", 2, "Ultra Music Festival"));

        transactionRepository.saveAll(trasactions);

    }

    
}
