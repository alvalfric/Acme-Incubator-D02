
package acme.entities.alferezBulletins;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AlferezBulletin extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Column(length = 256)
	@Length(max = 256)
	private String				author;

	@NotBlank
	@Column(length = 256)
	@Length(max = 256)
	private String				type;

	@NotBlank
	@URL
	@Column(length = 4096)
	@Length(max = 4096)
	private String				url;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;
}
