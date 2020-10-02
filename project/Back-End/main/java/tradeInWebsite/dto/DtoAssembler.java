package tradeInWebsite.dto;

import tradeInWebsite.models.AbstractModel;
import java.util.List;
import java.util.stream.Collectors;


public interface DtoAssembler <T extends AbstractModel, S extends Dto> {

    public S convertToDto(T Model);

    default List<S> convertToListOfDto(List<T> model) {
        return model.stream().map(this::convertToDto).collect(Collectors.toList());
    }


    public T convertToModel(S dto);

    default List<T> convertToListOfModel(List<S> dto) {

        return dto.stream().map(this::convertToModel).collect(Collectors.toList());
    }

}

