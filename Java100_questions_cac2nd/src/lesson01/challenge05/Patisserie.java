/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		// たいへんお待たせしましたを出力
		System.out.println("たいへんお待たせしました。");
		// 【ポエール・ネルメ】を出力
		System.out.println("【ポエール・ネルメ】");
		// ただいまより開店です！！を出力
		System.out.println("ただいまより開店です！！");

		// シトロンの残り個数を変数citronにて宣言
		int citronStock = 30;
		// ショコラの残り個数を変数chocolateにて宣言
		int chocolateStock = 30;
		// ピスターシュの残り個数を変数pistachioにて宣言
		int pistachioStock = 30;

		// 本日のおすすめ商品です。を出力し、改行を行う
		System.out.println("本日のおすすめ商品です。\n");
		// シトロン      \\250 ・・・ 残り（整数型 citronStockの値）個を出力
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		// ショコラ      \\250 ・・・ 残り（整数型 chocolateStockの値）個を出力
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolateStock + "個");
		// ピスターシュ  \\250 ・・・ 残り（整数型 pistachioStockの値）個を出力
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachioStock + "個");

		// それぞれ何個ずつ買いますか？（最大30個まで）を出力し、改行を行う
		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");
		System.out.print("シトロン     >");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// シトロンの購入数を入力し、入力された値を整数型に変換した上でcitronBuyCountNumに代入する
		String citronBuyCountStr = reader.readLine();
		int citronBuyCountNum = Integer.parseInt(citronBuyCountStr);

		// ショコラの購入数を入力し、入力された値を整数型に変換した上でchocolateBuyCountNumに代入する
		System.out.print("ショコラ     >");
		String chocolateBuyCountStr = reader.readLine();
		int chocolateBuyCountNum = Integer.parseInt(chocolateBuyCountStr);

		// ピスターシュの購入数を入力し、入力された値を整数型に変換した上でpistachioBuyCountNumに代入する
		System.out.print("ピスターシュ >");
		String pistachioBuyCountStr = reader.readLine();
		int pistachioBuyCountNum = Integer.parseInt(pistachioBuyCountStr);

		//入力された値を基に合計個数と合計金額を計算する
		int citronPriceBuySum = 250 * citronBuyCountNum;
		int chocolatePriceBuySum = 280 * chocolateBuyCountNum;
		int pistachioPriceBuySum = 320 * pistachioBuyCountNum;
		int itemBuyCountSum = citronBuyCountNum + chocolateBuyCountNum + pistachioBuyCountNum;
		int priceBuySum = citronPriceBuySum + chocolatePriceBuySum + pistachioPriceBuySum;

		// 入力された値を出力する
		System.out.println("シトロン     " + citronBuyCountNum + "個");
		System.out.println("ショコラ     " + chocolateBuyCountNum + "個");
		System.out.println("ピスターシュ " + pistachioBuyCountNum + "個\n");

		// 合計個数と合計金額を出力する
		System.out.println("合計個数    " + itemBuyCountSum + "個");
		System.out.println("合計金額  " + priceBuySum + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		// 

	}
}
