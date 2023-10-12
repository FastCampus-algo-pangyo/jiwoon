package group_study;

import java.io.*;
import java.util.*;

/*
프로그래머스 연속된 부분 수열 
*/

public class P_178870 {
    public int[] solution(int[] sequence, int k) {

        int[] answer = new int[2];
        int len = 1000001;
        int st = 0, en = st;
        int sum = sequence[st];

        while (st <= en && en <= sequence.length) {
            if (sum < k) {
                en++;
                if (en >= sequence.length) break;
                sum += sequence[en];

            } else if (sum > k) {
                sum -= sequence[st++];
            } else if (sum == k) {

                if (en-st+1 < len) {
                    answe디r[0] = st;
                    answer[1] = en;
                    len = en - st + 1;
                    if (len == 1) break;
                }
                sum -= sequence[st];
                st++;
                en++;

                if (en >= sequence.length) break;
                sum += sequence[en];
            }
        }

        return answer;
    }
}
