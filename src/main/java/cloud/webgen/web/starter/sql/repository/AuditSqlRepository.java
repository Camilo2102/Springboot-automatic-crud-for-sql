package cloud.webgen.web.starter.sql.repository;

import cloud.webgen.web.starter.sql.model.AuditSqlModel;
import cloud.webgen.web.starter.repository.AuditRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AuditSqlRepository<T extends AuditSqlModel> extends AuditRepository<T> {
}
