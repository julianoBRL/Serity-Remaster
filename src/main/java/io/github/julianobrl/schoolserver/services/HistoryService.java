package io.github.julianobrl.schoolserver.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import io.github.julianobrl.schoolserver.entitys.Bimester;
import io.github.julianobrl.schoolserver.entitys.History;
import io.github.julianobrl.schoolserver.repositorys.HistoryRepository;
import io.github.julianobrl.schoolserver.utils.PropertyFilter;

@Service
public class HistoryService {
	
	@Autowired
	@SuppressWarnings("unused")
	private HistoryRepository repository;
	
	public Iterable<History> list() {
		return repository.findAll(PageRequest.of(0, 10));
	}
	
	public History getByID(Long iD){
		return repository.findById(iD).get();
	}
	
	public History save(History model) {
		return repository.save(model);
	}
	
	public void delete(Long iD) {
		repository.deleteById(iD);
	}
	
	public History edit(Long iD, History model) {
		History savedData = getByID(iD);
		BeanUtils.copyProperties(model, savedData, PropertyFilter.getNullPropertyNames(model));
		return repository.save(savedData);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Iterable<Bimester> list(History params, Specification spec) {
		return repository.findAll(spec,PageRequest.of(0, 10));
	}
	
}
