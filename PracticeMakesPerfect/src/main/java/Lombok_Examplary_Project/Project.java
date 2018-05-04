package Lombok_Examplary_Project;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@AllArgsConstructor
@Builder
@Getter
@EqualsAndHashCode
@ToString

public class Project {

    private String name;

    private LocalDate deadline;

    private String author;

    private BigDecimal budget;

    private String company;

    private boolean closed;

}
