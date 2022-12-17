package pl.edu.pk.cosmo.habsatbackend.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import pl.edu.pk.cosmo.habsatbackend.userservice.utils.validators.annotations.Email;

@Data
@Accessors(chain = true)
@Document("users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @MongoId
    @Field("_id")
    private Long id;

    @Email
    @Indexed(unique = true)
    private String email;
    private String name;
    private String surname;
    private String roles;
    private String password;
    private boolean isFirstLogin;
}
