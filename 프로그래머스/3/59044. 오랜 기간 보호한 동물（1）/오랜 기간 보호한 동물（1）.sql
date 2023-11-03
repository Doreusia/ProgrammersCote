-- 코드를 입력하세요
SELECT
    A.NAME
,   A.DATETIME
FROM ANIMAL_INS A
LEFT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.ANIMAL_ID IS NULL
ORDER BY DATETIME
LIMIT 3