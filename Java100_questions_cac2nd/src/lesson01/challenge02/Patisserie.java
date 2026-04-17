/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題2 商品の展示
 *
 * [問題1]の表示を行った後で
 * 以下の実行例と同じものを表示してください。
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250
 * ショコラ      \280
 * ピスターシュ  \320
 *
 */

package lesson01.challenge02;

public class Patisserie {
	public static void main(String[] args) {
		// たいへんお待たせしましたを出力
		System.out.println("たいへんお待たせしました。");
		// 【ポエール・ネルメ】を出力
		System.out.println("【ポエール・ネルメ】");
		// ただいまより開店です！！を出力
		System.out.println("ただいまより開店です！！");

		// 本日のおすすめ商品です。を出力し、改行を行う
		System.out.println("本日のおすすめ商品です。\n");
		// シトロン　\250を出力
		System.out.println("シトロン      \\250");
		// ショコラ　\280を出力
		System.out.println("ショコラ      \\280");
		// ピスターシュ　\320を出力
		System.out.println("ピスターシュ  \\320");
	}

}
