------------------------------------------------ 숫자 ------------------------------------------------
-- ROUND : 반올림
-- CEIL : 올림
-- FLOOR : 내림
SELECT ROUND(0.5),
		CEIL(0.8),
        FLOOR(0.4);

-- ABS : 절대값
SELECT ABS(-1);

-- GREATEST : 괄호안에서 가장 큰 값
-- LEAST : 괄호안에서 가장 작은
SELECT
  GREATEST(1, 2, 3),
  LEAST(1, 2, 3, 4, 5);


-- MAX : 가장 큰 값
-- MIN : 가장 작은 값
-- COUNT : 개수
-- SUM : 합
-- AVG : 평균
SELECT
  MAX(Quantity),
  MIN(Quantity),
  COUNT(Quantity),
  SUM(Quantity),
  AVG(Quantity)
FROM OrderDetails
WHERE OrderDetailID BETWEEN 20 AND 30;

-- POW , POWER : x를 y번 만큼 제곱
-- SQRT : 제곱근
SELECT
  POW(2, 3),
  POWER(5, 2),
  SQRT(15);


-- TRUNCATE : x를 소수점 y 자리만큼까지 선택
SE택ECT
  TRUNCATE(1234.5678, 1),
  TRUNCATE(1234.5678, 2),
  TRUNCATE(1234.5678, 3),
  TRUNCATE(1234.5678, -1),
  TRUNCATE(1234.5678, -2),
  TRUNCATE(1234.5678, -3);


------------------------------------------------ 문자 ------------------------------------------------

-- UPPER : 모두 대문자로
-- LOWER : 모두 소문자로
SELECT
  UPPER('abcDEF'),
  LOWER('abcDEF');

-- CONCAT : 괄호안의 문자 이어붙힘
SELECT CONCAT('HELLO', ' ', 'THIS IS ', 2021)

-- CONCAT_WS(S,...) : 괄호안의 문자 S로 이어붙힘
SELECT CONCAT_WS('-', 2021, 8, 15, 'AM')

-- SUBSTR, SUBSTRING : 주어진 값에 따라 문자열 자름
-- LEFT : 왼쪽부터 N글자
-- RIGHT : 오른쪽부터 N글자
SELECT
  SUBSTR('ABCDEFG', 3),
  SUBSTR('ABCDEFG', 3, 2),
  SUBSTR('ABCDEFG', -4),
  SUBSTR('ABCDEFG', -4, 2);

-- LENGTH : 문자열의 바이트 길이
-- CHAR_LENGTH, CHARACTER_LEGNTH : 문자열의 문자 길이
SELECT
  LENGTH('ABCDE'), -- euc-kr : 1바이트씩 , -- utf-8 : 1바이트씩
  LENGTH('가나다'), -- euc-kr : 2바이트씩 , -- utf-8 : 3바이트씩
  CHAR_LENGTH('ABCDE'),
  CHARACTER_LENGTH('ABCDE');

-- TRIM : 양쪽 공백 제거
-- LTRIM : 왼쪽 공백 제거
-- RTRIM : 오른쪽 공백 제거
SELECT
  CONCAT('|', ' HELLO ', '|'),
  CONCAT('|', LTRIM(' HELLO '), '|'),
  CONCAT('|', RTRIM(' HELLO '), '|'),
  CONCAT('|', TRIM(' HELLO '), '|');

-- REPLACE(S, A, B) : S중 A를 B로 변경
SELECT
  REPLACE('맥도날드에서 맥도날드 햄버거를 먹었다.', '맥도날드', '버거킹');

