package com.aspose.slides.internal.v0;

public class n5 {
   private String n5;
   private char[] l6;
   private char[] k5;
   private char[] u3;
   private char[] a6;
   private String[] u9;
   private char h0 = 0;

   public n5(String var1, int[] var2, String[] var3) {
      this.n5 = var1;
      this.n5(var2);
      if (var3 != null) {
         this.u9 = new String[256];

         for (int var4 = 0; var4 < 256; var4++) {
            String var5 = var3[var4];
            if (var5 == null) {
               this.u9[var4] = ".notdef";
            } else {
               this.u9[var4] = var5;
            }
         }
      }
   }

   protected final void n5(int[] var1) {
      int var2 = 0;
      this.l6 = new char[256];
      this.a6 = new char[256];

      for (int var3 = 0; var3 < this.a6.length; var3++) {
         this.a6[var3] = '\uffff';
      }

      for (int var7 = 0; var7 < var1.length; var7 += 2) {
         char var4 = (char)var1[var7 + 1];
         if (var4 < 256) {
            if (this.l6[var4] == 0) {
               this.l6[var4] = (char)var1[var7];
            }
         } else {
            var2++;
         }

         if (this.a6[var1[var7]] == '\uffff') {
            this.a6[var1[var7]] = var4;
         }
      }

      this.k5 = new char[var2];
      this.u3 = new char[var2];
      int var8 = 0;

      for (int var9 = 0; var9 < var1.length; var9 += 2) {
         char var5 = (char)var1[var9 + 1];
         if (var5 >= 256) {
            var8++;

            for (int var6 = var8 - 1; var6 >= 0; var6--) {
               if (var6 <= 0 || this.k5[var6 - 1] < var5) {
                  this.k5[var6] = var5;
                  this.u3[var6] = (char)var1[var9];
                  break;
               }

               this.k5[var6] = this.k5[var6 - 1];
               this.u3[var6] = this.u3[var6 - 1];
            }
         }
      }
   }

   public final String n5() {
      return this.n5;
   }

   public final int n5(int var1) {
      if (var1 < 256) {
         char var2 = this.l6[var1];
         if (var2 > 0) {
            return var2;
         }
      }

      int var6 = 0;
      int var3 = this.k5.length - 1;

      while (var3 >= var6) {
         int var4 = (var6 + var3) / 2;
         char var5 = this.k5[var4];
         if (var1 == var5) {
            return this.u3[var4];
         }

         if (var1 < var5) {
            var3 = var4 - 1;
         } else {
            var6 = var4 + 1;
         }
      }

      return this.h0;
   }

   @Override
   public String toString() {
      return this.n5();
   }
}
