package Cona.ConaApp.dto;


import Cona.ConaApp.ApplicationToken;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationTokenRequestDto {
    private String value;

    public ApplicationToken toApplicationToken() {
        System.out.println("ApplicationToken = " + value);
        return ApplicationToken.builder()
                .value(value)
                .build();
    }
}
