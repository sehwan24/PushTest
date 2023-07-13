package Cona.ConaApp.dto;


import Cona.ConaApp.ApplicationToken;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationTokenResponseDto {
    private String value;

    public static ApplicationTokenResponseDto of(ApplicationToken applicationToken) {
        return new ApplicationTokenResponseDto(applicationToken.getValue());
    }
}
