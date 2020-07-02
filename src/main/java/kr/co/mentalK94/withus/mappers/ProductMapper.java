package kr.co.mentalK94.withus.mappers;

import kr.co.mentalK94.withus.domains.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    List<Product> selectProductList() throws Exception;

    Product selectProduct(Long id) throws Exception;

    void insertProduct(Product product);

    void updateProduct(@Param("product") Product product, @Param("id")Long id);

    void updateProductReview(@Param("reviewCount")int reviewCount, @Param("rating")double rating, @Param("id")Long id);

    void imageUpdate(String imageFileName, @Param("id")Long id);

    int deleteProduct(Long id);
}