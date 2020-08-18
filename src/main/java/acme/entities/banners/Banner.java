
package acme.entities.banners;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				picture;

	@NotBlank
	private String				slogan;

	@NotBlank
	private String				url;

	//Credit Card
	private String				holderName;

	private int					number;

	private String				brand;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				expirationDate;

	private int					CVV;
}
