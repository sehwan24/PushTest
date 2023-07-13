package Cona.ConaApp.sevice;


import Cona.ConaApp.ApplicationToken;
import Cona.ConaApp.ApplicationTokenRepository;
import Cona.ConaApp.dto.ApplicationTokenRequestDto;
import Cona.ConaApp.dto.ApplicationTokenResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ApplicationTokenService {
    private final ApplicationTokenRepository applicationTokenRepository;

    @Transactional
    public ApplicationTokenResponseDto saveToken(ApplicationTokenRequestDto applicationTokenRequestDto) {
        ApplicationToken applicationToken = applicationTokenRequestDto.toApplicationToken();
        return ApplicationTokenResponseDto.of(applicationTokenRepository.save(applicationToken));
    }
}
