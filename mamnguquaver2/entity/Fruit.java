package mamnguquaver2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fruit")
@NoArgsConstructor
@AllArgsConstructor
@Data

@Builder //viet cham  cham cham ...... build() tao ra object dang can
// ban chat . . . chinh la ham set cho cai object dang tao
//linh hoat tao object ma ko can dua tham so
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Name",nullable = false,columnDefinition = "NVARCHAR(255)")
    @NotBlank(message = "the fruit name is required")
    @Size(min = 2,max = 50,message = "the fruit name must be in 2...30 characters")
    private String name;
    @Column(name = "Description",nullable = false,columnDefinition = "NVARCHAR(100)")
    @NotBlank(message = "the description is required")
    @Size(min = 5,max = 100,message = "the description must be in 2...30 characters")
    private String description;
    @Positive(message = "price must be >0!")
    @Min(value = 5000,message = "the price must be >5000")
    @Max(value = 50000000,message = "the price must be <50000000")
    private double price;
    @Column(name = "Type",nullable = false,columnDefinition = "NVARCHAR(30)")
    @Pattern(regexp = "Trai cay tuoi|Che Bien San|Trai Cay Kho" ,message = "the type must match template Trai cay tuoi|Che Bien San|Trai Cay Kho")
    @Builder.Default
    private String type="Trai cay tuoi"; //tach bang chua khoa ngoai day se la FK tro toi bang type
                        //dung Enum
                        //regEx ep cach thuc nhap cho type

}
