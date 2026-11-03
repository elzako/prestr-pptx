package com.aspose.slides.internal.b1m;

import com.aspose.slides.ms.System.t9;

public abstract class n5 implements com.aspose.slides.internal.o6x.a6 {
   private com.aspose.slides.internal.o6x.u3 k5;
   protected com.aspose.slides.internal.o6x.k5 n5;
   protected float l6 = -1.0F;

   protected n5(com.aspose.slides.internal.o6x.u3 var1, com.aspose.slides.internal.o6x.k5 var2) {
      this.k5 = var1;
      this.n5 = var2;
      this.l6 = this.a6(var2);
   }

   protected int n5(com.aspose.slides.internal.o6x.k5 var1) {
      int var2 = this.l6(var1);
      int var3 = var2;
      if (var3 >= var1.n5.length()) {
         return var3;
      }

      if (!this.k5.n5(true)) {
         return var3;
      }

      if (!this.u3() && !t9.t9(var1.n5.charAt(var3))) {
         while (var3 > var1.s7 && this.n5(var1.n5, var3 - 1)) {
            var3--;
         }

         if (this.l6(var1.n5, var3 - 1)) {
            var3--;
         }
      }

      if (var3 <= var1.s7) {
         var3 = var2;
      }

      if (t9.t9(var1.n5.charAt(var3))) {
         var3++;
      }

      return var3;
   }

   protected abstract int l6(com.aspose.slides.internal.o6x.k5 var1);

   protected int k5(com.aspose.slides.internal.o6x.k5 var1) {
      float var2 = this.l6;
      return this.k5.n5(var1.s7, var2);
   }

   protected int u3(com.aspose.slides.internal.o6x.k5 var1) {
      int var2 = var1.n5.indexOf(var1.t2, var1.s7);
      if (var2 == -1) {
         var2 = var1.n5.length();
      }

      float var3 = this.l6;
      float var4 = 0.0F;
      int var5 = 0;
      int var6 = var1.s7;

      while (true) {
         int var7 = var1.n5.indexOf("\t", var6);
         if (var7 == -1 || var7 >= var2) {
            return this.n5(var6, var4, var3);
         }

         if (var7 == var6) {
            var4 = Math.max(var4, this.n5(var1, var5++));
         } else {
            float var8 = this.k5.n5(var6, var7);
            if (var4 + var8 > var3) {
               return this.n5(var6, var4, var3);
            }

            var4 = Math.max(var4 + var8, this.n5(var1, var5++));
         }

         if (var4 > var3) {
            return var7 + 1;
         }

         var6 = var7 + 1;
      }
   }

   private int n5(int var1, float var2, float var3) {
      return this.k5.n5(var1, var3 - var2);
   }

   protected float n5(com.aspose.slides.internal.o6x.k5 var1, int var2) {
      float var3 = var1.h0;

      for (int var4 = 0; var4 <= var2; var4++) {
         if (var4 >= var1.c8.length) {
            var3 += var1.c8[var1.c8.length - 1];
         } else {
            var3 += var1.c8[var4];
         }
      }

      return var3;
   }

   protected void n5(int var1) {
      int var2 = this.n5.s7;
      float var3 = 0.0F;
      int var4 = 0;

      for (int var5 = this.n5.n5.indexOf("\t", this.n5.s7); var5 != -1 && var5 < var1; var4++) {
         if (var2 < var5) {
            this.n5.n5(var2, var5, var3);
            var3 = Math.max(this.n5(this.n5, var4), var3 + this.k5.n5(var2, var5));
         } else {
            var3 = Math.max(this.n5(this.n5, var4), var3);
         }

         var2 = var5 + 1;
         var5 = this.n5.n5.indexOf("\t", var2);
      }

      if (var2 < var1) {
         this.n5.n5(var2, var1, var3);
      }
   }

   private float a6(com.aspose.slides.internal.o6x.k5 var1) {
      if (this.l6()) {
         return 2.1474836E9F;
      }

      float var2 = this.k5.u3(var1.u3);
      float var3 = this.u9(var1);
      return Math.max(var2, var3);
   }

   private float u9(com.aspose.slides.internal.o6x.k5 var1) {
      float var2 = 0.0F;

      for (int var3 = 0; var3 < var1.n5.length(); var3++) {
         var2 = Math.max(var2, this.k5.n5(var3, var3 + 1));
      }

      return var2;
   }

   protected boolean l6() {
      return this.n5.u3 == 0.0F || Float.isNaN(this.n5.u3) || Float.isInfinite(this.n5.u3) || this.n5.u3 == 2.1474836E9F;
   }

   private boolean n5(String var1, int var2) {
      char var3 = var1.charAt(var2);
      return !t9.t9(var3) && !this.n5(var3);
   }

   private boolean l6(String var1, int var2) {
      if (var2 <= 0) {
         return false;
      }

      char var3 = var1.charAt(var2);
      return '(' == var3 || '[' == var3 || '{' == var3;
   }

   private boolean n5(char var1) {
      return '-' == var1 || '!' == var1 || '%' == var1 || '(' == var1 || ')' == var1 || '?' == var1 || '[' == var1 || ']' == var1 || '{' == var1 || '}' == var1;
   }

   protected boolean k5() {
      return this.n5.k5 != null && this.n5.k5.e2();
   }

   protected boolean u3() {
      return this.n5.k5 != null && this.n5.k5.s7();
   }
}
