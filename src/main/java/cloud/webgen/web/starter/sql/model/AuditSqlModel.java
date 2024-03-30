package cloud.webgen.web.starter.sql.model;


import cloud.webgen.web.starter.models.BaseAuditModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class AuditSqlModel extends BaseAuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @CreationTimestamp
    @Column(updatable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDateTime updatedAt;
}
