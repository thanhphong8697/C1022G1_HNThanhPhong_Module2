package congnhan.models.service.interfaceService;

import congnhan.models.model.Worker;

public interface InterSer {
    void display();

    void add(Worker worker);
    void search (String str);
}
