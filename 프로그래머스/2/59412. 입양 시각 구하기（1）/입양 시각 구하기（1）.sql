-- 코드를 입력하세요
SELECT 
    SUBSTRING(DATETIME, 12, 2) AS HOUR
,   COUNT(*)
FROM ANIMAL_OUTS
WHERE SUBSTRING(DATETIME, 12, 2) BETWEEN 9 AND 20
GROUP BY HOUR
ORDER BY HOUR;