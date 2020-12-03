package com.revature.spms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.spms.entity.Editor;
@Repository
public interface EditorRepo extends JpaRepository<Editor, Long>{

}
