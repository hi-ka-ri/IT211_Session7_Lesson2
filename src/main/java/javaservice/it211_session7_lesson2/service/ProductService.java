package javaservice.it211_session7_lesson2.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void addProduct(String name) {
        System.out.println("SERVICE: Đang thêm sản phẩm " + name);
        // Logic thêm sản phẩm giả lập
    }

    public void addCategory(String category) {
        System.out.println("SERVICE: Đang thêm danh mục " + category);
        // Logic thêm danh mục giả lập
    }
}
