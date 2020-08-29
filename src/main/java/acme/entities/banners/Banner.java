
package acme.entities.banners;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Banner extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@URL
	@Column(length = 2048)
	@Length(max = 2048)
	private String				picture;

	@NotBlank
	@Column(length = 256)
	@Length(max = 256)
	private String				slogan;

	@NotBlank
	@URL
	@Column(length = 2048)
	@Length(max = 2048)
	private String				url;

	//Credit Card
	@Column(length = 60)
	@Length(max = 60)
	private String				holderName;

	@Column(length = 16)
	@Length(max = 16)
	private String				number;

	@Column(length = 60)
	@Length(max = 60)
	private String				brand;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				expirationDate;

	@Column(length = 4)
	@Max(9999)
	@Min(0)
	private Integer				CVV;
}
