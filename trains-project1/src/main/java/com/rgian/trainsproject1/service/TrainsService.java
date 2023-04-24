package com.rgian.trainsproject1.service;

import com.rgian.trainsproject1.DTO.TrainsDTO;
import com.rgian.trainsproject1.entity.TrainsEntity;
import com.rgian.trainsproject1.model.TrainsModel;
import com.rgian.trainsproject1.repository.TrainsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TrainsService {

    private final TrainsRepository trainsRepository;
    public List<TrainsDTO> getAllTrains() {
        List<TrainsEntity> trainsEntities = trainsRepository.findAll();
        List<TrainsDTO> trainsDTOList = new ArrayList<>();

        trainsEntities.forEach(trainsEntity -> trainsDTOList.add(TrainsDTO.builder()
                        .passId(trainsEntity.getPassId())
                        .survived(trainsEntity.getSurvived())
                        .pclass(trainsEntity.getPclass())
                        .passName(trainsEntity.getPassName())
                        .sex(trainsEntity.getSex())
                        .age(trainsEntity.getAge())
                        .sibsp(trainsEntity.getSibsp())
                        .parch(trainsEntity.getParch())
                        .ticket(trainsEntity.getTicket())
                        .fare(trainsEntity.getFare())
                        .cabin(trainsEntity.getCabin())
                        .embarked(trainsEntity.getEmbarked())
                .build()));

        return trainsDTOList;
    }

    public List<TrainsDTO> addTrain(TrainsModel trainsModel) {
        trainsRepository.save(TrainsEntity.builder()
                        .passId(UUID.randomUUID())
                        .survived(trainsModel.getSurvived())
                        .pclass(trainsModel.getPclass())
                        .passName(trainsModel.getPassName())
                        .sex(trainsModel.getSex())
                        .age(trainsModel.getAge())
                        .sibsp(trainsModel.getSibsp())
                        .parch(trainsModel.getParch())
                        .ticket(trainsModel.getTicket())
                        .fare(trainsModel.getFare())
                        .cabin(trainsModel.getCabin())
                        .embarked(trainsModel.getEmbarked())
                .build());
        return getAllTrains();
    }
}
