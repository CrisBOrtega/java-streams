package util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BasicVideoGame {

    private String name;
    private Double price;
    private Console console;
}