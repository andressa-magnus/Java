package me.dio.sacola.service.Impl;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.repository.SacolaRepository;
import me.dio.sacola.resource.SacolaResource;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SacolaServiceImpl implements SacolaService {
    private final SacolaRepository sacolaRepository;
    @Override
    public Item incluirItemNaSacola(ItemDto itemDto) {
        return null;
    }

    @Override
    public Sacola verSacola(Long id) {
        return sacolaRepository.findById(id).orElseThrow(
                () -> {
                    throw new RuntimeException("Essa sacola não Existe!");
                }
        );
    }

    @Override
    public Sacola fecharSacola(Long id, int formaPagamento) {
        Sacola sacola = verSacola(id);
        if(sacola.getItens().isEmpty()){
            throw new RuntimeException("Inclua itens na sacola!");
        }
        return null;
    }
}
