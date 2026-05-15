package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 変数の宣言と初期値の設定
		 */
		byte byteNum=1;//変数byteNumの初期値を設定
		
		short shortNum=1;//変数shortNumの初期値を設定
		
		int intNum=1;//変数intNumの初期値を設定
		
		long longNum=1;//変数longNumの初期値を設定
		
		float floatNum=1;//変数floattNumの初期値を設定
		
		double doubleNum=1;//変数doubletNumの初期値を設定
		
		char letter='a';//変数letterの初期値を設定
		
		String letters="あああ";//変数lettersの初期値を設定
		
		boolean isBoolean=false;//変数isBooleanの初期値を設定
		
		/*
		 * 変数の値を更新
		 */
		byteNum = 10;//変数byteNumに10を代入
		
		shortNum = 100;//変数shortNumに100を代入
		
		intNum = 1000;//変数intNumに1000を代入
		
		longNum = 10000;//変数longNumに10000を代入
		
		floatNum = 9.5f;//変数floatNumに9.5fを代入
		
		doubleNum = 10.5;//変数doubleNumに10.5を代入
		
		letter = 'a';//変数letterに'a'を代入
		
		letters = "ハロー";//変数lettersに"ハロー"を代入
		
		isBoolean = true;//変数isBooleanにtrueを代入
		
		/*
		 * Q3の回答
		 */
		System.out.println(longNum + intNum + shortNum + byteNum);//11110を出力
		
		System.out.println(byteNum + 10);//20を出力
		
		System.out.println(letter + letters + isBoolean);//a ハロー trueを出力
		
		System.out.println(byteNum * 3 + shortNum + intNum+longNum);//数字を全て足して出力
		
		System.out.println(longNum * intNum * shortNum * byteNum);//小数点以外の数字を全てかけて出力
		
		System.out.println(doubleNum / shortNum);//10.5割る100をして出力
		
		System.out.println(byteNum-shortNum);//10引く100をして出力
		
		/*
		 * Q4の回答
		 */
		String name = "山田太郎";//変数nameに"山田太郎"を代入
		System.out.println("こんにちは、" + name + "さん！");//name変数を使用してコンソールに こんにちは、山田太郎さん！ と表示
		
		/*
		 * Q5の回答
		 */
		int age;//変数ageを定義
		age = 25;//変数ageに25を代入
		System.out.println("年齢:" + age +"歳");//age変数を使用してコンソールに 年齢:25歳 と表示
		
		/*
		 * Q6の回答
		 */
		int num1 = 10;//変数num1に10を代入
		int num2 = 5;//変数num2に5を代入
		int sum = num1 + num2;//変数sumにnum1とnum2の和を代入
		System.out.println(sum);//変数sumの値をコンソールに表示
		
		/*
		 * Q7の回答
		 */
		int score = 80;//変数scoreに80を代入
		score = score + 20;//scoreに20を自己代入
		System.out.println("最終スコア:" + score);//scoreを使用してコンソールに表示
		
		/*
		 * Q8の回答
		 */
		double price = 99.99;//変数priceに99.99を代入
		System.out.println("整数価格:" + (int) price);//priceをdouble型からint型に変換してコンソールに表示
		
		/*
		 * Q9の回答
		 */
		String numStr = "123";//変数numStrに"123"を代入
		System.out.println("変換後の値:" + (Integer.parseInt(numStr) + 10));//numStrをString型からint型に変換して10を足しコンソールに表示
		
		/*
		 * Q10の回答
		 */
		int num = 50;//変数numに50を代入
		System.out.println("得点:" + String.valueOf(num) + "点");//numをString型に変換し、"得点:50点"の形でコンソールに表示
		
		/*
		 * Q11の回答
		 */
		int a = 10;//変数aに10を代入
		int b = 20;//変数bに20を代入
		boolean result = (a < b) ? true : false;//aがbより小さいかどうかをboolean変数resultに代入
		System.out.println(result);//resultの値をコンソールに表示
		
		/*
		 * Q12の回答
		 */
		int x = 15;//変数xに15を代入
		System.out.println(x >= 10 ? "OK" : "NG");//xが10以上なら"OK"、そうでなければ"NG"をコンソールに表示
		
		/*
		 * Q13の回答
		 */
		String text = "私はJavaが好きです。Javaは楽しい！";//変数textに文字列を代入
		System.out.println(text.replace("Java", "Python"));//文字列の中の"Java"を"Python"に置換してコンソールに表示
		
		

	}

}
