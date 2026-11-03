package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.List;

public class j4 {
   private List<v8> n5 = new List<>(16);

   public j4() {
      this.n5.addItem(new v8(0, new v3(0, Integer.MAX_VALUE, null)));
   }

   private int n5(int var1) {
      int var2 = 0;
      int var3 = this.n5.size();

      while (var3 - var2 > 1) {
         int var4 = var2 + var3 >> 1;
         v8 var5 = this.n5.get_Item(var4);
         if (var1 < var5.n5) {
            var3 = var4;
         } else {
            var2 = var4;
         }
      }

      return var2;
   }

   public final void n5(int var1, int var2) {
      int var3 = this.n5(var1);
      int var4 = var1 + var2;
      int var5 = this.n5(var1 + var2);
      v8 var6 = this.n5.get_Item(var3);
      if (var1 < var6.n5) {
         var2 -= var6.n5 - var1;
         var1 = var6.n5;
         if (var2 < 0) {
            return;
         }
      }

      if (var1 > var6.n5) {
         if (var6.l6.l6 > var1) {
            var6.l6.l6 = var1;
         }

         var3++;
      }

      if (var5 > var3) {
         this.n5.removeRange(var3, var5 - var3);
      }

      if (var3 == this.n5.size()) {
         this.n5.addItem(new v8(var4, new v3(var4, Integer.MAX_VALUE, null)));
      } else {
         v8 var7 = this.n5.get_Item(var3);
         int var8 = var4 - var7.n5;
         if (var8 > 0) {
            var7.n5 = var4;
            var7.l6.n5 += var8;
         }
      }
   }

   public final void n5(char[] var1, int var2) {
      this.n5(var1, 0, var1.length, var2);
   }

   public final void n5(char[] var1, int var2, int var3, int var4) {
      int var5 = this.n5(var4);
      v8 var6 = this.n5.get_Item(var5);
      if (var6.n5 < var4) {
         if (var4 < var6.n5 + var6.l6.n5()) {
            v3 var7 = var6.l6;
            v8 var8 = new v8(var4, new v3(var7.n5 + var4 - var6.n5, var7.l6, var7.k5));
            var7.l6 = var7.n5 + var4 - var6.n5;
            this.n5.insertItem(var5 + 1, var8);
         }

         var5++;
      }

      this.n5.insertItem(var5, new v8(var4, new v3(var2, var3, var1)));
   }

   final v3[] n5() {
      v3[] var1 = new v3[this.n5.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.n5.get_Item(var2).l6;
      }

      return var1;
   }
}
