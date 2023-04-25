package kz.bagdat.springboot_tables_bunch.db;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    private Long id;
    private String name;
    private int price;
    private int amount;

}
