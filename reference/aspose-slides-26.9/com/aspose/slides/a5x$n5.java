package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a5x$n5 {
   private final String n5;
   private final String l6;

   public final String n5() {
      return this.l6;
   }

   public a5x$n5(String var1, String var2) {
      this.l6 = com.aspose.slides.ms.System.d1.u9(var1);
      this.n5 = var2;
   }

   public static boolean n5(char var0) {
      return var0 == 'm' || var0 == 'l' || var0 == 'c' || var0 == 'x' || var0 == 'e' || var0 == 't' || var0 == 'r' || var0 == 'v';
   }

   public static boolean l6(char var0) {
      return var0 >= 'a' && var0 <= 'z';
   }

   public final void n5(List<Byte> var1, List<Long> var2) {
      long[] var3 = this.l6();
      switch (a5x.n5().n5(this.l6)) {
         case 0:
            var1.addItem((byte)1);
            var2.addItem(var3[0]);
            var2.addItem(var3[1]);
            break;
         case 1:
            for (int var5 = 0; var5 < var3.length; var5 += 6) {
               var1.addItem((byte)5);
               var2.addItem(var3[var5]);
               var2.addItem(var3[var5 + 1]);
               var2.addItem(var3[var5 + 2]);
               var2.addItem(var3[var5 + 3]);
               var2.addItem(var3[var5 + 4]);
               var2.addItem(var3[var5 + 5]);
            }
            break;
         case 3:
            for (int var4 = 0; var4 < var3.length; var4 += 2) {
               var1.addItem((byte)2);
               var2.addItem(var3[var4]);
               var2.addItem(var3[var4 + 1]);
            }
            break;
         case 25:
            var1.addItem((byte)0);
      }
   }

   private long[] l6() {
      List var1 = new List();
      int var2 = 0;
      boolean var3 = false;

      for (int var4 = 0; var4 < this.n5.length(); var4++) {
         char var5 = this.n5.charAt(var4);
         if (var5 == '@') {
            if (var4 > 0) {
               var1.addItem(this.n5(var2, var4, var3));
            }

            var3 = true;
            var2 = var4 + 1;
         } else if (var5 == ',' || var5 == ' ') {
            var1.addItem(this.n5(var2, var4, var3));
            var3 = false;
            var2 = var4 + 1;
         }
      }

      var1.addItem(this.n5(var2, this.n5.length(), var3));
      return com.aspose.slides.internal.n8e.v4.u9(var1);
   }

   private long n5(int var1, int var2, boolean var3) {
      int var4 = var2 - var1;
      if (var4 == 0) {
         return 0L;
      }

      long var5 = com.aspose.slides.ms.System.Xml.f4.t9(com.aspose.slides.ms.System.d1.l6(this.n5, var1, var2 - var1));
      return var3 ? -27273042329612L - var5 : var5;
   }
}
