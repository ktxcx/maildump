package fr.dopse.maildump.dao;

import fr.dopse.maildump.model.AttachmentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fr27a86n on 11/04/2017.
 */

public interface IAttachmentDAO extends JpaRepository<AttachmentEntity, Long> {

}
