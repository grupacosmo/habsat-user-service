package pl.edu.pk.cosmo.habsatbackend.userservice.entity.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import pl.edu.pk.cosmo.habsatbackend.userservice.utils.validators.annotations.Email;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ChangeRoleRequest {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String role;
}
