package com.aspose.slides.internal.d2n;

import java.awt.Font;

public class u3 {
   int n5;
   int l6;
   int k5;
   int u3;
   int a6;
   byte u9;
   byte h0;
   byte c8;
   byte t2;
   byte s7;
   byte x8;
   byte n3;
   byte y4;
   String e2;
   byte[] t9;

   public u3() {
   }

   public u3(Font var1) {
      this.n5 = -var1.getSize();
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = (var1.getStyle() & 1) != 0 ? 700 : 0;
      this.u9 = (byte)((var1.getStyle() & 2) != 0 ? 1 : 0);
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = 0;
      this.y4 = 0;
      this.e2 = var1.getFamily();
      this.t9 = null;
   }

   int n5(byte[] var1, int var2) {
      int var3 = var2;
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u9 = var1[var2++];
      this.h0 = var1[var2++];
      this.c8 = var1[var2++];
      this.t2 = var1[var2++];
      this.s7 = var1[var2++];
      this.x8 = var1[var2++];
      this.n3 = var1[var2++];
      this.y4 = var1[var2++];
      char[] var4 = new char[32];

      for (int var5 = 0; var5 < 32; var2 += 2) {
         var4[var5] = com.aspose.slides.internal.l1b.k5.y4(var1, var2);
         var5++;
      }

      int var20 = 0;

      while (var20 < 32 && var4[var20] != 0) {
         var20++;
      }

      if (var20 < 32) {
         char[] var6 = new char[var20];
         System.arraycopy(var4, 0, var6, 0, var20);
         var4 = var6;
      }

      this.e2 = new String(var4);
      return var2 - var3;
   }

   public int l6(byte[] var1, int var2) {
      int var3 = var2;
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.k5 = this.u3 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 4;
      this.a6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.u9 = var1[var2++];
      this.h0 = var1[var2++];
      this.c8 = var1[var2++];
      this.t2 = var1[var2++];
      this.s7 = var1[var2++];
      this.x8 = var1[var2++];
      this.n3 = var1[var2++];
      this.y4 = var1[var2++];
      char[] var4 = new char[32];
      int var5 = var2;

      for (int var6 = 0; var6 < 32; var6++) {
         if (var1[var2] < 0) {
            var4 = null;
            break;
         }

         var4[var6] = (char)var1[var2++];
         if (var4[var6] == 0) {
            break;
         }
      }

      if (var4 != null) {
         int var20 = 0;

         while (var20 < 32 && var4[var20] != 0) {
            var20++;
         }

         if (var20 < 32) {
            char[] var7 = new char[var20];
            System.arraycopy(var4, 0, var7, 0, var20);
            var4 = var7;
         }

         this.e2 = new String(var4);
      } else {
         int var21 = 0;

         while (var21 < 32 && var1[var5 + var21] != 0) {
            var21++;
         }

         this.t9 = new byte[var21];

         for (int var22 = 0; var22 < this.t9.length; var22++) {
            this.t9[var22] = var1[var5 + var22];
         }
      }

      return var2 - var3;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj != null && obj instanceof u3) {
         u3 var2 = (u3)obj;
         if (this.n5 == var2.n5
            && this.l6 == var2.l6
            && this.k5 == var2.k5
            && this.u3 == var2.u3
            && this.a6 == var2.a6
            && this.u9 == var2.u9
            && this.h0 == var2.h0
            && this.c8 == var2.c8
            && this.t2 == var2.t2
            && this.s7 == var2.s7
            && this.x8 == var2.x8
            && this.n3 == var2.n3
            && this.y4 == var2.y4) {
            if (this.e2 == var2.e2 || this.e2 != null && var2.e2 != null && this.e2.equals(var2.e2)) {
               if (this.t9 != var2.t9) {
                  if (this.t9 == null || var2.t9 == null || this.t9.length != var2.t9.length) {
                     return false;
                  }

                  for (int var3 = 0; var3 < this.t9.length; var3++) {
                     if (this.t9[var3] != var2.t9[var3]) {
                        return false;
                     }
                  }
               }

               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 11 + this.l6;
      var1 = var1 * 13 + this.k5;
      var1 = var1 * 17 + this.u3;
      var1 = var1 * 19 + this.a6;
      var1 = var1 * 23 + this.u9;
      var1 = var1 * 29 + this.h0;
      var1 = var1 * 31 + this.c8;
      var1 = var1 * 39 + this.t2;
      var1 = var1 * 41 + this.s7;
      var1 = var1 * 43 + this.x8;
      var1 = var1 * 53 + this.n3;
      var1 = var1 * 11 + this.y4;
      if (this.e2 != null) {
         var1 = var1 * 11 + this.e2.hashCode();
      }

      if (this.t9 != null) {
         for (int var2 = 0; var2 < this.t9.length; var2++) {
            var1 = var1 * 31 + this.t9[var2];
         }
      }

      return var1;
   }
}
