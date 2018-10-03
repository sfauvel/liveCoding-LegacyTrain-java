package trainTrain.api;

import com.traintrain.WebTicketManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ReservationsController {

    @RequestMapping(method = RequestMethod.POST, value = "api/reservations")
    public String update(@RequestBody RequestDto requestDto) throws IOException, InterruptedException {
        System.out.println(requestDto.getTrain_id());
        System.out.println(requestDto.getNumber_of_seats());
        WebTicketManager webTicketManager = new WebTicketManager();
        return webTicketManager.reserve(requestDto.getTrain_id(), requestDto.getNumber_of_seats());
    }

    @RequestMapping(method = RequestMethod.GET, value = "api/value")
    public String get() {
        return "Reservations";
    }
}
