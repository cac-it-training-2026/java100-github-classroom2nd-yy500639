package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		boolean[] overlapCheck = new boolean[stations.length];
		int count = 0;
		boolean loopFlag = true;
		boolean enemyLoopFlag = true;

		for (int i = 0; i < overlapCheck.length; i++) {
			overlapCheck[i] = true;
		}

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！\n");

		do {
			loopFlag = true;
			enemyLoopFlag = true;
			String str = br.readLine();
			for (int i = 0; i < stations.length; i++) {
				if (str.equals(stations[i]) && overlapCheck[i] == true) {
					overlapCheck[i] = false;
					count++;
					break;
				} else if ((str == stations[i] && overlapCheck[i] == false) || i == stations.length - 1) {
					loopFlag = false;
					break;
				}
			}

			if (loopFlag == true) {
				do {
					int num = (int) (Math.random() * 30);
					if (overlapCheck[num] == true) {
						System.out.println(stations[num]);
						overlapCheck[num] = false;
						enemyLoopFlag = false;
						count++;
					}
				} while (enemyLoopFlag == true);
			}

			if (count == 30) {
				loopFlag = false;
			}

		} while (loopFlag == true);

		if (count == 30) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
