-- 코드를 입력하세요
WITH TMP AS (
    SELECT
    B.USER_ID
,   B.NICKNAME
,   CONCAT(B.CITY, ' ', B.STREET_ADDRESS1, ' ', STREET_ADDRESS2	) AS 전체주소
,   CONCAT(SUBSTR(B.TLNO, 1, 3), '-', SUBSTR(B.TLNO, 4, 4), '-', SUBSTR(B.TLNO, 8, 4)) AS 전화번호   
,   COUNT(*) AS WRITING
FROM USED_GOODS_BOARD A
JOIN USED_GOODS_USER B ON A.WRITER_ID = B.USER_ID
GROUP BY A.WRITER_ID
HAVING WRITING >= 3)


SELECT
    USER_ID
,   NICKNAME
,   전체주소
,   전화번호
FROM TMP
ORDER BY USER_ID DESC

