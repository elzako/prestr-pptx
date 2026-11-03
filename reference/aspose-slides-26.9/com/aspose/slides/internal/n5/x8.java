package com.aspose.slides.internal.n5;

public class x8 {
   protected short[] n5;
   protected short[] l6;
   protected char[] k5;
   protected char[] u3;
   protected short[] a6;
   protected short[] u9;
   protected short[][] h0;
   protected int c8;
   protected u3 t2;

   public int n5(e2 var1) throws w1 {
      int var2 = var1.u3();
      int var3 = 0;

      try {
         while (true) {
            short var4 = this.u9[var3];
            if (var4 >= 0) {
               var3 = this.l6(var4, var1);
               if (var3 == -1) {
                  this.n5(var3, var1);
                  return 0;
               }

               var1.n5();
            } else {
               if (this.a6[var3] >= 1) {
                  return this.a6[var3];
               }

               char var5 = (char)var1.n5(1);
               if (var5 >= this.k5[var3] && var5 <= this.u3[var3]) {
                  short var6 = this.h0[var3][var5 - this.k5[var3]];
                  if (var6 < 0) {
                     if (this.n5[var3] < 0) {
                        this.n5(var3, var1);
                        return 0;
                     }

                     var3 = this.n5[var3];
                     var1.n5();
                  } else {
                     var3 = var6;
                     var1.n5();
                  }
               } else {
                  if (this.n5[var3] < 0) {
                     if (var5 == '\uffff' && this.l6[var3] >= 0) {
                        return this.a6[this.l6[var3]];
                     }

                     this.n5(var3, var1);
                     return 0;
                  }

                  var3 = this.n5[var3];
                  var1.n5();
               }
            }
         }
      } finally {
         var1.l6(var2);
      }
   }

   protected void n5(int var1, e2 var2) throws m3 {
      if (this.t2.n5.h0 > 0) {
         this.t2.n5.a6 = true;
      } else {
         m3 var3 = new m3(this.n5(), this.c8, var1, var2);
         this.n5(var3);
         throw var3;
      }
   }

   protected void n5(m3 var1) {
   }

   public int l6(int var1, e2 var2) throws m3 {
      return -1;
   }

   public String n5() {
      return "n/a";
   }

   public static short[] n5(String var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length(); var2 += 2) {
         var1 += var0.charAt(var2);
      }

      short[] var8 = new short[var1];
      int var3 = 0;

      for (int var4 = 0; var4 < var0.length(); var4 += 2) {
         char var5 = var0.charAt(var4);
         char var6 = var0.charAt(var4 + 1);

         for (int var7 = 1; var7 <= var5; var7++) {
            var8[var3++] = (short)var6;
         }
      }

      return var8;
   }

   public static char[] l6(String var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length(); var2 += 2) {
         var1 += var0.charAt(var2);
      }

      char[] var8 = new char[var1];
      int var3 = 0;

      for (int var4 = 0; var4 < var0.length(); var4 += 2) {
         char var5 = var0.charAt(var4);
         char var6 = var0.charAt(var4 + 1);

         for (int var7 = 1; var7 <= var5; var7++) {
            var8[var3++] = var6;
         }
      }

      return var8;
   }
}
