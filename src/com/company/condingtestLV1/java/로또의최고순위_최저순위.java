package com.company.condingtestLV1.java;

import java.util.Arrays;

/**
 * 순위	당첨 내용
 * 1	6개 번호가 모두 일치
 * 2	5개 번호가 일치
 * 3	4개 번호가 일치
 * 4	3개 번호가 일치
 * 5	2개 번호가 일치
 * 6(낙첨)	그 외
 *
 *
 * lottos는 길이 6인 정수 배열입니다.
 * lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
 * 0은 알아볼 수 없는 숫자를 의미합니다.
 * 0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
 * lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
 * win_nums은 길이 6인 정수 배열입니다.
 * win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.
 * win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.
 * win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.
 */
public class 로또의최고순위_최저순위 {

    public static void main(String[] args) {
        Solution.solution(new int[]{0, 0, 0, 0, 0, 0},new int[]{38, 19, 20, 40, 15, 25});
    }
    public static class Solution{
        public static int[] solution(int[] lottos, int[] win_nums) {
            int[] result = new int[2];
            int correctCnt = 0;
            int zeroCnt = 0;
            for (int num : lottos) {
                if(num == 0) zeroCnt++;
                for (int num2 : win_nums){
                    if(num == num2){
                        correctCnt++;
                        continue;
                    }
                }
            }

            result[0] = getGrade(correctCnt+zeroCnt);
            result[1] = getGrade(correctCnt);

            System.out.println(Arrays.toString(result));

            return null;
        }

        public static int getGrade(int correctCnt) {
            int grade = 0;
            switch (correctCnt) {
                case 6:
                    grade = 1;
                    break;
                case 5:
                    grade = 2;
                    break;
                case 4:
                    grade = 3;
                    break;
                case 3:
                    grade = 4;
                    break;
                case 2:
                    grade = 5;
                    break;
                default:
                    grade = 6;
                    break;
            }
            return grade;
        }
    }
}
