package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public class z6 {
   private int n5;
   private int l6;
   private int k5;
   private boolean u3;
   private final List<x9> a6 = new List<>();
   private int u9 = -1;
   private int h0 = -1;
   private int c8 = -1;
   private int t2 = -1;
   private com.aspose.slides.internal.a0.a6 s7;
   private com.aspose.slides.internal.t1.t2 x8;

   public z6(com.aspose.slides.internal.a0.a6 var1, com.aspose.slides.internal.t1.t2 var2) {
      this.s7 = var1;
      this.x8 = var2;
      this.n5 = var2.e5();
   }

   public final void n5(int var1, int var2, boolean var3) {
      this.l6 = var1 - this.n5 + 1;
      this.k5 = var2;
      this.u3 = var3;
      this.c8 = -1;
      this.t2 = -1;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final int l6(int var1) {
      if (this.c8 == var1) {
         return this.t2;
      }

      int var2 = var1;
      int var3 = 0;
      int var4 = this.k5;
      x9 var5 = this.n5(false, var3, 1);

      while (var2 > 0) {
         if (++var4 >= var5.l6().x8().m1()) {
            var4 = 0;
            var5 = this.n5(false, ++var3, 1);
         }

         var2--;
      }

      this.c8 = var1;
      this.t2 = var5.l6().s7().c4();
      return this.t2;
   }

   private int[] u9(int var1) {
      int var2 = 0;
      int var3 = this.k5 + var1;
      int var4 = -1;

      do {
         var3 -= var2;
         x9 var5 = this.n5(false, ++var4, 1);
         var2 = var5.l6().x8().m1();
      } while (var3 >= var2);

      return new int[]{var3, var2};
   }

   public final int k5(int var1) {
      int var2 = 0;
      int var3 = this.k5 + var1;
      int var4 = -1;

      x9 var5;
      do {
         var3 -= var2;
         var5 = this.n5(false, ++var4, 1);
         var2 = var5.l6().x8().m1();
      } while (var3 >= var2);

      if (var3 + 1 < var2) {
         return 0;
      }

      x9 var6 = this.n5(false, var4 + 1, 1);
      return var5.l6().s7().l6() - var6.l6().s7().l6();
   }

   public final boolean u3(int var1) {
      int[] var2 = this.u9(var1);
      return var2[0] == var2[1] - 1;
   }

   public final int a6(int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = this.k5;
      x9 var6 = this.n5(false, var4, 1);

      while (var3 < var1) {
         if (var5 >= var6.l6().x8().m1()) {
            var5 = 0;
            var6 = this.n5(false, ++var4, 1);
            var2 = var3;
         }

         var5++;
         var3++;
      }

      return var2;
   }

   public final x9 n5(boolean var1, int var2, int var3) {
      if (var3 == 0) {
         return this.n5(var1, var2);
      } else if (var3 == 1) {
         int var4 = this.l6 + var2;
         var4 += this.n5 - 1;
         return this.n5(var1, var4);
      } else {
         throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5(new String[]{"Illegal value for relativeTo: ", com.aspose.slides.ms.System.a3.l6(var3)}));
      }
   }

   public final x9 n5(boolean var1, int var2) {
      boolean var3 = this.u9 >= 0 && var2 == this.u9;
      int var4 = var2 - this.n5;

      while (var4 >= this.a6.size()) {
         this.n5(var2, var1, var3, this.u3);
      }

      x9 var5 = this.a6.get_Item(var4);
      boolean var6 = false;
      if (var5.l6().t2() != var1) {
         var6 = true;
      }

      if (var3 && this.h0 != var4 || !var3 && this.h0 >= 0) {
         var6 = true;
         this.h0 = var3 ? var4 : -1;
      }

      if (var6) {
         this.h0(var4);
         var5 = this.n5(var2, var1, var3, this.u3);
      }

      return var5;
   }

   private void h0(int var1) {
      while (var1 < this.a6.size()) {
         this.a6.removeAt(this.a6.size() - 1);
         if (!this.x8.t1()) {
         }
      }
   }

   private x9 n5(int var1, boolean var2, boolean var3, boolean var4) {
      String var5 = this.x8.a6(var1);
      boolean var6 = this.n5 == var1;
      com.aspose.slides.internal.t1.z8 var7 = this.x8.n5(var1, var6, var3, var2);
      x9 var8 = new x9(var7, var1, var5, var2, var4);
      var8.l6().n5(this.s7.h0());
      var8.l6().l6(var7.f2());
      var8.l6().n5(this.x8);
      this.a6.addItem(var8);
      return var8;
   }
}
