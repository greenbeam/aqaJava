package Complex;
/*
Двусуммный (Two Sum): Дан массив целых чисел nums и целое число target.
Найдите два числа в массиве так, чтобы их сумма была равна target.
Верните их индексы.
Вы можете предположить, что каждый вход будет иметь ровно одно решение,
и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.

Вход: nums = [2, 7, 11, 15], target = 9 Выход: [0, 1] Выход объяснение: nums[0] + nums[1] == 9, мы возвращаем [0, 1].
*/


import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // добавляем текущее значение и его индекс в хэш-таблицу
            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Индексы: [" + result[0] + ", " + result[1] + "]");
    }
}
