
package acme.entities.inquiries;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inquirie extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Column(length = 256)
	@Length(max = 256)
	private String				title;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	private Date				creation;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	//@FutureOrPresent
	private Date				deadline;

	@NotBlank
	@Column(length = 4096)
	@Length(max = 4096)
	private String				body;

	@NotNull
	@Valid
	private Money				minMoney;

	@NotNull
	@Valid
	private Money				maxMoney;

	@NotNull
	@Email
	@Column(length = 320)
	@Length(max = 320)
	private String				contactEmail;

}
