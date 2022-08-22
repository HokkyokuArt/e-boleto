package br.com.hjv.eboleto.core.crud;

public interface CrudConverter<T, D> {

    D entidadeParaDto(T entidade);

    T dtoParaEntidade(D dto);

}
