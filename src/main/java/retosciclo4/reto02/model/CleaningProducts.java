package retosciclo4.reto02.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cleaningproducts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CleaningProducts {

    @Id
    private Integer id;
    private String brand;
    private String category;
    private String presentation;
    private String description;
    private double price;
    private boolean availability = true;
    private int quantity;
    private String photography;

}
