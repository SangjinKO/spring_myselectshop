package com.sangjin.myselectshop.repository;

import com.sangjin.myselectshop.entity.Folder;
import com.sangjin.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {

    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    List<Folder> findAllByUser(User user);

}
