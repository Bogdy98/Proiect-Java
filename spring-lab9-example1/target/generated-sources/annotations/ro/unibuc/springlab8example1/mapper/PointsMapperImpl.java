package ro.unibuc.springlab8example1.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.unibuc.springlab8example1.domain.Points;
import ro.unibuc.springlab8example1.dto.PointsDto;
import ro.unibuc.springlab8example1.dto.PointsDto.PointsDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-28T12:36:12+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class PointsMapperImpl implements PointsMapper {

    @Override
    public PointsDto mapToDto(Points points) {
        if ( points == null ) {
            return null;
        }

        PointsDtoBuilder pointsDto = PointsDto.builder();

        pointsDto.id( points.getId() );
        pointsDto.username( points.getUsername() );
        pointsDto.noPoints( points.getNoPoints() );
        pointsDto.pointsAddedDate( points.getPointsAddedDate() );

        return pointsDto.build();
    }
}
