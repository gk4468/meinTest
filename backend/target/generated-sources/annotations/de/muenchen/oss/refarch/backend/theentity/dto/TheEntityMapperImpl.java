package de.muenchen.oss.refarch.backend.theentity.dto;

import de.muenchen.oss.refarch.backend.theentity.TheEntity;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-16T11:02:10+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class TheEntityMapperImpl implements TheEntityMapper {

    @Override
    public TheEntityResponseDTO toDTO(TheEntity theEntity) {
        if ( theEntity == null ) {
            return null;
        }

        UUID id = null;
        String textAttribute = null;

        id = theEntity.getId();
        textAttribute = theEntity.getTextAttribute();

        TheEntityResponseDTO theEntityResponseDTO = new TheEntityResponseDTO( id, textAttribute );

        return theEntityResponseDTO;
    }

    @Override
    public TheEntity toEntity(TheEntityRequestDTO theEntityRequestDTO) {
        if ( theEntityRequestDTO == null ) {
            return null;
        }

        TheEntity theEntity = new TheEntity();

        theEntity.setTextAttribute( theEntityRequestDTO.textAttribute() );

        return theEntity;
    }
}
