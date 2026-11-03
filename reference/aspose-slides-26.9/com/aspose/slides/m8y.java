package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

class m8y {
   private static final Dictionary<Character, String> n5;
   private static final Dictionary<Character, String> l6;
   private static final Dictionary<Character, String> k5;
   private static final Dictionary<String, Character> u3;
   private static final Dictionary<String, String> a6 = new Dictionary<>(3);

   public static String n5(String var0, int var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(var0);
      if (1 != var1) {
         Dictionary var3 = null;
         var2 = new com.aspose.slides.internal.l7h.a5();
         int var4 = 0;

         while (var4 < var0.length()) {
            int var5 = com.aspose.slides.ms.System.t9.a6(var0.charAt(var4)) ? 2 : 1;
            char var6 = '\u0000';
            Character[] var7 = new Character[]{var6};
            boolean var8 = u3.tryGetValue(com.aspose.slides.ms.System.d1.l6(var0, var4, var5), var7);
            var6 = var7[0];
            if (var8) {
               var2.n5(var6);
            } else {
               var2.n5(var0, var4, var5);
            }

            var4 += var5;
         }

         switch (var1) {
            case 0:
            case 3:
               var3 = n5;
               break;
            case 1:
            default:
               throw new NotSupportedException(
                  com.aspose.slides.ms.System.d1.n5(
                     "The '{0}' font style is not supported by the ConvertMathSymbols function.",
                     new Object[]{com.aspose.slides.ms.System.s3.n5(f1n.class, var1)}
                  )
               );
            case 2:
               var3 = l6;
               break;
            case 4:
               var3 = k5;
         }

         String var16 = var2.toString();
         var2 = new com.aspose.slides.internal.l7h.a5();
         int var18 = 0;

         while (var18 < var16.length()) {
            int var20 = com.aspose.slides.ms.System.t9.a6(var16.charAt(var18)) ? 2 : 1;
            if (var20 > 1) {
               var2.n5(com.aspose.slides.ms.System.d1.l6(var16, var18, var20));
            } else {
               String var21 = null;
               String[] var23 = new String[]{var21};
               boolean var9 = var3.tryGetValue(var16.charAt(var18), var23);
               var21 = var23[0];
               if (var9) {
                  var2.n5(var21);
               } else {
                  var2.n5(var16.charAt(var18));
               }
            }

            var18 += var20;
         }
      }

      Dictionary$Enumerator var15 = a6.iterator();

      try {
         while (var15.hasNext()) {
            KeyValuePair var17 = (KeyValuePair)var15.next();
            var2.n5((String)var17.getKey(), (String)var17.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }

      return var2.toString();
   }

   private static void n5(String var0, Dictionary<Character, String> var1) {
      int var2 = 0;

      for (int var3 = 0;
         var3 < "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρςστυφϕχψωϵ".length();
         var3++
      ) {
         char var4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρςστυφϕχψωϵ".charAt(var3);
         int var5 = com.aspose.slides.ms.System.t9.a6(var0.charAt(var2)) ? 2 : 1;
         String var6 = com.aspose.slides.ms.System.d1.l6(var0, var2, var5);
         var1.set_Item(var4, var6);
         u3.set_Item(var6, var4);
         var2 += var5;
      }
   }

   private static void n5() {
      int var0 = 0;

      for (int var1 = 0; var1 < "-*'".length(); var1++) {
         char var2 = "-*'".charAt(var1);
         int var3 = com.aspose.slides.ms.System.t9.a6("−∗′".charAt(var0)) ? 2 : 1;
         String var4 = com.aspose.slides.ms.System.d1.l6("−∗′", var0, var3);
         a6.set_Item(com.aspose.slides.ms.System.d1.n5(var2, 1), var4);
         var0 += var3;
      }
   }

   static {
      int var0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩαβγδεζηθικλμνξοπρςστυφϕχψωϵ".length();
      n5 = new Dictionary<>(var0);
      l6 = new Dictionary<>(var0);
      k5 = new Dictionary<>(var0);
      u3 = new Dictionary<>(var0 * 3);
      n5(
         "\ud835\udc4e\ud835\udc4f\ud835\udc50\ud835\udc51\ud835\udc52\ud835\udc53\ud835\udc54ℎ\ud835\udc56\ud835\udc57\ud835\udc58\ud835\udc59\ud835\udc5a\ud835\udc5b\ud835\udc5c\ud835\udc5d\ud835\udc5e\ud835\udc5f\ud835\udc60\ud835\udc61\ud835\udc62\ud835\udc63\ud835\udc64\ud835\udc65\ud835\udc66\ud835\udc67\ud835\udc34\ud835\udc35\ud835\udc36\ud835\udc37\ud835\udc38\ud835\udc39\ud835\udc3a\ud835\udc3b\ud835\udc3c\ud835\udc3d\ud835\udc3e\ud835\udc3f\ud835\udc40\ud835\udc41\ud835\udc42\ud835\udc43\ud835\udc44\ud835\udc45\ud835\udc46\ud835\udc47\ud835\udc48\ud835\udc49\ud835\udc4a\ud835\udc4b\ud835\udc4c\ud835\udc4d0123456789\ud835\udee2\ud835\udee3\ud835\udee4\ud835\udee5\ud835\udee6\ud835\udee7\ud835\udee8\ud835\udee9\ud835\udeea\ud835\udeeb\ud835\udeec\ud835\udeed\ud835\udeee\ud835\udeef\ud835\udef0\ud835\udef1\ud835\udef2\ud835\udef4\ud835\udef5\ud835\udef6\ud835\udef7\ud835\udef8\ud835\udef9\ud835\udefa\ud835\udefc\ud835\udefd\ud835\udefe\ud835\udeff\ud835\udf00\ud835\udf01\ud835\udf02\ud835\udf03\ud835\udf04\ud835\udf05\ud835\udf06\ud835\udf07\ud835\udf08\ud835\udf09\ud835\udf0a\ud835\udf0b\ud835\udf0c\ud835\udf0d\ud835\udf0e\ud835\udf0f\ud835\udf10\ud835\udf19\ud835\udf11\ud835\udf12\ud835\udf13\ud835\udf14\ud835\udf16",
         n5
      );
      n5(
         "\ud835\udc1a\ud835\udc1b\ud835\udc1c\ud835\udc1d\ud835\udc1e\ud835\udc1f\ud835\udc20\ud835\udc21\ud835\udc22\ud835\udc23\ud835\udc24\ud835\udc25\ud835\udc26\ud835\udc27\ud835\udc28\ud835\udc29\ud835\udc2a\ud835\udc2b\ud835\udc2c\ud835\udc2d\ud835\udc2e\ud835\udc2f\ud835\udc30\ud835\udc31\ud835\udc32\ud835\udc33\ud835\udc00\ud835\udc01\ud835\udc02\ud835\udc03\ud835\udc04\ud835\udc05\ud835\udc06\ud835\udc07\ud835\udc08\ud835\udc09\ud835\udc0a\ud835\udc0b\ud835\udc0c\ud835\udc0d\ud835\udc0e\ud835\udc0f\ud835\udc10\ud835\udc11\ud835\udc12\ud835\udc13\ud835\udc14\ud835\udc15\ud835\udc16\ud835\udc17\ud835\udc18\ud835\udc19\ud835\udfce\ud835\udfcf\ud835\udfd0\ud835\udfd1\ud835\udfd2\ud835\udfd3\ud835\udfd4\ud835\udfd5\ud835\udfd6\ud835\udfd7\ud835\udea8\ud835\udea9\ud835\udeaa\ud835\udeab\ud835\udeac\ud835\udead\ud835\udeae\ud835\udeaf\ud835\udeb0\ud835\udeb1\ud835\udeb2\ud835\udeb3\ud835\udeb4\ud835\udeb5\ud835\udeb6\ud835\udeb7\ud835\udeb8\ud835\udeba\ud835\udebb\ud835\udebc\ud835\udebd\ud835\udebe\ud835\udebf\ud835\udec0\ud835\udec2\ud835\udec3\ud835\udec4\ud835\udec5\ud835\udec6\ud835\udec7\ud835\udec8\ud835\udec9\ud835\udeca\ud835\udecb\ud835\udecc\ud835\udecd\ud835\udece\ud835\udecf\ud835\uded0\ud835\uded1\ud835\uded2\ud835\uded3\ud835\uded4\ud835\uded5\ud835\uded6\ud835\udedf\ud835\uded7\ud835\uded8\ud835\uded9\ud835\udeda\ud835\udedc",
         l6
      );
      n5(
         "\ud835\udc82\ud835\udc83\ud835\udc84\ud835\udc85\ud835\udc86\ud835\udc87\ud835\udc88\ud835\udc89\ud835\udc8a\ud835\udc8b\ud835\udc8c\ud835\udc8d\ud835\udc8e\ud835\udc8f\ud835\udc90\ud835\udc91\ud835\udc92\ud835\udc93\ud835\udc94\ud835\udc95\ud835\udc96\ud835\udc97\ud835\udc98\ud835\udc99\ud835\udc9a\ud835\udc9b\ud835\udc68\ud835\udc69\ud835\udc6a\ud835\udc6b\ud835\udc6c\ud835\udc6d\ud835\udc6e\ud835\udc6f\ud835\udc70\ud835\udc71\ud835\udc72\ud835\udc73\ud835\udc74\ud835\udc75\ud835\udc76\ud835\udc77\ud835\udc78\ud835\udc79\ud835\udc7a\ud835\udc7b\ud835\udc7c\ud835\udc7d\ud835\udc7e\ud835\udc7f\ud835\udc80\ud835\udc81\ud835\udfce\ud835\udfcf\ud835\udfd0\ud835\udfd1\ud835\udfd2\ud835\udfd3\ud835\udfd4\ud835\udfd5\ud835\udfd6\ud835\udfd7\ud835\udf1c\ud835\udf1d\ud835\udf1e\ud835\udf1f\ud835\udf20\ud835\udf21\ud835\udf22\ud835\udf23\ud835\udf24\ud835\udf25\ud835\udf26\ud835\udf27\ud835\udf28\ud835\udf29\ud835\udf2a\ud835\udf2b\ud835\udf2c\ud835\udf2e\ud835\udf2f\ud835\udf30\ud835\udf31\ud835\udf32\ud835\udf33\ud835\udf34\ud835\udf36\ud835\udf37\ud835\udf38\ud835\udf39\ud835\udf3a\ud835\udf3b\ud835\udf3c\ud835\udf3d\ud835\udf3e\ud835\udf3f\ud835\udf40\ud835\udf41\ud835\udf42\ud835\udf43\ud835\udf44\ud835\udf45\ud835\udf46\ud835\udf47\ud835\udf48\ud835\udf49\ud835\udf4a\ud835\udf53\ud835\udf4b\ud835\udf4c\ud835\udf4d\ud835\udf4e\ud835\udf50",
         k5
      );
      n5();
   }
}
