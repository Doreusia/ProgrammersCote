-- 코드를 입력하세요
SELECT 
    A.PRODUCT_CODE
,   SUM(A.PRICE * B.SALES_AMOUNT) AS SALES
FROM PRODUCT A
INNER JOIN OFFLINE_SALE B ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_CODE
ORDER BY SALES DESC, A.PRODUCT_CODE ASC

# SELECT p.product_code, SUM(p.price * o.sales_amount) sales
# FROM product p
# JOIN offline_sale o
# ON (p.product_id = o.product_id)
# GROUP BY p.product_id
# ORDER BY sales DESC, p.product_code;