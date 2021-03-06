package com.tts.TechTalentBlog.repo;

import com.tts.TechTalentBlog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Long is a type
// its a wrapper class that represents your id
// anything in the diamond is known as a generic type, type parameters.

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long>{


}

