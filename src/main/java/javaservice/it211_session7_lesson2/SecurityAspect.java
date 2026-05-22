package javaservice.it211_session7_lesson2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {

    private String currentUserRole = "VIP"; // Giả lập user chỉ là VIP

    @Before("execution(* javaservice.it211_session7_lesson2.service.ProductService.add*(..))")
    public void verifyUser(JoinPoint joinPoint) {
        if (!"ADMIN".equals(currentUserRole)) {
            throw new RuntimeException("!! TRUY CẬP BỊ TỪ CHỐI !! User không có quyền.");
            // Có thể thay bằng AccessDeniedException nếu muốn rõ nghĩa hơn
            // throw new AccessDeniedException("User không có quyền thực hiện hành động này");
        }
    }
}
