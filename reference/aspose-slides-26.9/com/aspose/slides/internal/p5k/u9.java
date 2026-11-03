package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.t1;
import com.aspose.slides.internal.e1x.v4;

public class u9 {
   private Dictionary<Integer, t1> n5;
   private int[] l6;
   private v4 k5;
   private i1 u3;

   public u9(i1 var1) {
      this.u3 = var1;
      this.k5 = new v4(var1, false);
   }

   public final void n5(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         int var3 = var1.charAt(var2);
         if (com.aspose.slides.ms.System.t9.a6(var1.charAt(var2))) {
            var3 = com.aspose.slides.ms.System.t9.n5(var1.charAt(var2), var1.charAt(var2 + 1));
            var2++;
         }

         this.k5.n5(var3);
      }
   }

   public final int n5(int var1) {
      int var2 = this.n5().length - 1;

      for (int var3 = 0; var3 < this.n5().length; var3++) {
         if (this.n5()[var3] == var1) {
            var2 = var3;
            break;
         }
      }

      return var2;
   }

   public final t1 l6(int var1) {
      return this.n5.get_Item(this.k5.n5(var1));
   }

   public final short k5(int var1) {
      return this.l6(this.u3.h0().l6(var1).k5(), 1024.0F);
   }

   public final short n5(int var1, float var2) {
      return this.l6(this.u3.h0().l6(var1).k5(), var2);
   }

   private short l6(int var1, float var2) {
      return (short)com.aspose.slides.internal.n2d.t2.t2(var1 * var2 / this.u3.t2());
   }

   private static void n5(int[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         for (int var2 = var1; var2 < var0.length; var2++) {
            if (var0[var2] < var0[var1]) {
               int var3 = var0[var1];
               var0[var1] = var0[var2];
               var0[var2] = var3;
            }
         }
      }
   }

   public final int[] n5() {
      if (this.l6 == null) {
         this.n5 = this.k5.n5();
         this.l6 = new int[this.n5.size()];

         for (int var1 = 0; var1 < this.n5.size(); var1++) {
            this.l6[var1] = this.k5.l6().u3(this.k5.l6().n5(Integer.valueOf(var1)));
         }

         n5(this.l6);
      }

      return this.l6;
   }

   public final short l6() {
      return this.l6(this.u3.s7(), 1024.0F);
   }

   public final short k5() {
      return this.l6(this.u3.x8(), 1024.0F);
   }

   public final short u3() {
      return this.k5();
   }
}
