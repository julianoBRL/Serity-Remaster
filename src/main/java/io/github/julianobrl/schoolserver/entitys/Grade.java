package io.github.julianobrl.schoolserver.entitys;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Grade")
@EqualsAndHashCode
public class Grade{
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	private String description;
	
	@NotNull
	@Min(value = 0)
	@Max(value = 10)
	private float grade;
	
	@Builder.Default
	@JsonProperty(access = Access.WRITE_ONLY)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	private LocalDateTime createdAt = LocalDateTime.now();
	
	@Builder.Default
	@JsonProperty(access = Access.WRITE_ONLY)
	private boolean active = true;
		
}
