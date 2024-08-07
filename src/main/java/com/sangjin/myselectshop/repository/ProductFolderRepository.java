package com.sangjin.myselectshop.repository;

import com.sangjin.myselectshop.entity.Folder;
import com.sangjin.myselectshop.entity.Product;
import com.sangjin.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
