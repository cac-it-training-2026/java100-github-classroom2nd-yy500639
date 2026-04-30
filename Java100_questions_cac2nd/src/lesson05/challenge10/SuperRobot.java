package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperRobot {
	void menuInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("メニュー名を入力してください＞");
		String menuName = br.readLine();

		System.out.print("必要な材料の種類は何種類ですか？＞");
		String str = br.readLine();
		int ingredientNum = Integer.parseInt(str);

		String[] ingredientName = new String[ingredientNum];
		String[] ingredientAmount = new String[ingredientNum];

		for (int i = 0; i < ingredientNum; i++) {
			System.out.print(i + 1 + "つ目の材料名を入力してください＞");
			ingredientName[i] = br.readLine();

			System.out.print(ingredientName[i] + "の必要量を入力してください(単位も記述してください)＞");
			ingredientAmount[i] = br.readLine();
		}

		System.out.println("下記の材料で" + menuName + "を作成します。");

		for (int i = 0; i < ingredientNum; i++) {
			System.out.println(ingredientName[i] + '：' + ingredientAmount[i]);
		}

		System.out.println("\n" + menuName + "ができました！");

	}
}
