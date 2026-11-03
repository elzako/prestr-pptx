package com.aspose.slides.internal.x7i;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class u3 {
   private static final int[] n5 = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
   private static final String l6 = d1.n5("あいうえおかきくけこ", "さしすせそたちつてと", "なにぬねのはひふへほ", "まみむめもやゆよらり", "るれろわをん");
   private static final String k5 = d1.n5("いろはにほへとちりぬ", "るをわかよたれそつね", "ならむうゐのおくやま", "けふこえてあさきゆめ", "みしゑひもせす");
   private static final String u3 = d1.n5("アイウエオカキクケコ", "サシスセソタチツテト", "ナニヌネノハヒフヘホ", "マミムメモヤユヨラリ", "ルレロワヲン");
   private static final String a6 = d1.n5("イロハニホヘトチリヌ", "ルヲワカヨタレソツネ", "ナラムウヰノオクヤマ", "ケフコエテアサキユメ", "ミシヱヒモセスン");
   private static final String u9 = d1.n5("ｱｲｳｴｵｶｷｸｹｺ", "ｻｼｽｾｿﾀﾁﾂﾃﾄ", "ﾅﾆﾇﾈﾉﾊﾋﾌﾍﾎ", "ﾏﾐﾑﾒﾓﾔﾕﾖﾗﾘ", "ﾙﾚﾛﾜｦﾝ");
   private static final String h0 = d1.n5("ｲﾛﾊﾆﾎﾍﾄﾁﾘﾇ", "ﾙｦﾜｶﾖﾀﾚｿﾂﾈ", "ﾅﾗﾑｳヰﾉｵｸﾔﾏ", "ｹﾌｺｴﾃｱｻｷﾕﾒ", "ﾐｼヱﾋﾓｾｽﾝ");

   public static void n5(a5 var0, double var1, char var3, int var4) {
      char[] var5 = new char[7];
      int var6 = 7;
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);

      while (var7 > var4) {
         var7--;
         int var8 = var7 / var4;
         var5[--var6] = (char)(var3 + (var7 - var8 * var4));
         var7 = var8;
      }

      var5[--var6] = (char)(var3 + --var7);
      var0.n5(var5, var6, 7 - var6);
   }

   public static void n5(a5 var0, double var1, boolean var3) {
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);
      String var5 = var3 ? "IIVIXXLXCCDCM" : "iivixxlxccdcm";
      int var6 = n5.length;

      while (var6-- != 0) {
         while (var4 >= n5[var6]) {
            var4 -= n5[var6];
            var0.n5(var5, var6, 1 + (var6 & 1));
         }
      }
   }
}
