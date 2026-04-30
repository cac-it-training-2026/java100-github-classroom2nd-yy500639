/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		// それぞれの購入割合を計算
		int citronPercentage = (int) (citronPriceBuySum * 100 / priceBuySum);
		int chocolatePercentage = (int) (chocolatePriceBuySum * 100 / priceBuySum);
		int pistachioPercentage = (int) (pistachioPriceBuySum * 100 / priceBuySum);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) citronPriceBuySum + "・・・ "
				+ citronPercentage + "%");
		System.out.println(
				"ショコラ      \\" + (int) chocolatePriceBuySum + "・・・ " + chocolatePercentage
						+ "%");
		System.out.println(
				"ピスターシュ  \\" + (int) pistachioPriceBuySum + "・・・ " + pistachioPercentage
						+ "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("シトロンの味    ・・・ " + citronPercentage + "%");
		System.out.println("ショコラの味    ・・・ " + chocolatePercentage + "%");
		System.out.println("ピスターシュの味・・・ " + pistachioPercentage + "%");
		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\"
				+ ((250 * citronPercentage + 280 * chocolatePercentage + 320 * pistachioPercentage) / 1000 * 10)
				+ "です");

	}

}
