package br.com.hjv.eboleto.core;

public interface CrudConverter<T, D> {

    D entidadeParaDto(T entidade);

    T dtoParaEntidade(D dto);

}
