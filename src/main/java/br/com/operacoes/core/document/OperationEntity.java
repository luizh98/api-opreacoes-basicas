package br.com.operacoes.core.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "operation")
public class OperationEntity {

    @Id
    private String id;
    private Double firstNumber;
    private Double secondNumber;
    private OperationsEntity operations;
}