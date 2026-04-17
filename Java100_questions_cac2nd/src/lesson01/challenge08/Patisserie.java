/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		// シトロンの購入数を入力し、入力された値を小数型に変換した上でcitronBuyCountNumに代入する
		String citronBuyCountStr = reader.readLine();
		double citronBuyCountNum = Double.parseDouble(citronBuyCountStr);

		// ショコラの購入数を入力し、入力された値を小数型に変換した上でchocolateBuyCountNumに代入する
		System.out.print("ショコラ     >");
		String chocolateBuyCountStr = reader.readLine();
		double chocolateBuyCountNum = Double.parseDouble(chocolateBuyCountStr);

		// ピスターシュの購入数を入力し、入力された値を小数型に変換した上でpistachioBuyCountNumに代入する
		System.out.print("ピスターシュ >");
		String pistachioBuyCountStr = reader.readLine();
		double pistachioBuyCountNum = Double.parseDouble(pistachioBuyCountStr);

		// 入力された値を基に合計個数と合計金額を計算する
		// 合計金額は整数型に変換する
		double citronPriceBuySum = 250 * citronBuyCountNum;
		double chocolatePriceBuySum = 280 * chocolateBuyCountNum;
		double pistachioPriceBuySum = 320 * pistachioBuyCountNum;
		double itemsBuyCountSum = citronBuyCountNum + chocolateBuyCountNum + pistachioBuyCountNum;
		int priceBuySum = (int) (citronPriceBuySum + chocolatePriceBuySum + pistachioPriceBuySum);

		// 合計金額を整数型に変換する
		priceBuySum = (int) priceBuySum;

		// 入力された値を基に在庫を減らし、整数型に変換する
		citronStock = (int) (citronStock - citronBuyCountNum);
		chocolateStock = (int) (chocolateStock - chocolateBuyCountNum);
		pistachioStock = (int) (pistachioStock - pistachioBuyCountNum);

		// 入力された値を出力する
		System.out.println("シトロン     " + citronBuyCountNum + "個");
		System.out.println("ショコラ     " + chocolateBuyCountNum + "個");
		System.out.println("ピスターシュ " + pistachioBuyCountNum + "個\n");

		// 合計個数と合計金額を出力する
		System.out.println("合計個数    " + itemsBuyCountSum + "個");
		System.out.println("合計金額  " + priceBuySum + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。\n");

		// それぞれの在庫数を表示しなおす
		System.out.println("本日のおすすめ商品です。\n");
		// シトロン      \\250 ・・・ 残り（整数型 citronStockの値）個を出力
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		// ショコラ      \\250 ・・・ 残り（整数型 chocolateStockの値）個を出力
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolateStock + "個");
		// ピスターシュ  \\250 ・・・ 残り（整数型 pistachioStockの値）個を出力
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistachioStock + "個");

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + priceBuySum);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) citronPriceBuySum + "・・・ "
				+ (int) (citronPriceBuySum * 100 / priceBuySum) + "%");
		System.out.println(
				"ショコラ      \\" + (int) chocolatePriceBuySum + "・・・ " + (int) (chocolatePriceBuySum * 100 / priceBuySum)
						+ "%");
		System.out.println(
				"ピスターシュ  \\" + (int) pistachioPriceBuySum + "・・・ " + (int) (pistachioPriceBuySum * 100 / priceBuySum)
						+ "%");

	}
}
