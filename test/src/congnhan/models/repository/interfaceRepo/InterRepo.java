package congnhan.models.repository.interfaceRepo;

import congnhan.models.model.Worker;

public interface InterRepo {
    void display();

    void add(Worker worker);
    void search (String str);
}
