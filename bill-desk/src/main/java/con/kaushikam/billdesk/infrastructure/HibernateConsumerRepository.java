package con.kaushikam.billdesk.infrastructure;

import com.kaushikam.billdesk.domain.model.Consumer;
import com.kaushikam.billdesk.domain.model.IConsumerRepository;
import org.springframework.data.repository.Repository;

public interface HibernateConsumerRepository extends Repository<Consumer, String>, IConsumerRepository {
}
