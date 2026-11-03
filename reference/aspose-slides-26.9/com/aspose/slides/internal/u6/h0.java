package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e5.d5;

public class h0 extends e2 {
   private int l6;
   private y1 k5 = null;
   private int u3;
   private List<List<c8>> a6;
   private boolean u9 = true;
   private List<c8> h0;
   private t2 c8;

   public h0(z1 var1) {
      super(var1);
      this.l6 = var1.v4();
      if (var1.s0()) {
         this.c8 = new t9();
      } else {
         this.c8 = new l6(var1);
      }

      this.u3();
   }

   private void u3() {
      this.a6 = new List<>();
      this.u3 = 0;
   }

   @Override
   public void n5(m1 var1) {
      for (int var2 = this.a6.size(); var2 < this.u3 + var1.v4(); var2++) {
         List var3 = new List(this.l6);

         for (int var4 = 0; var4 < this.l6; var4++) {
            var3.addItem(null);
         }

         this.a6.addItem(var3);
      }

      int var9 = var1.b3() - 1;
      y4 var10 = new y4(var1, var9);
      List var11 = this.a6.get_Item(this.u3);
      if (var11.size() > var9) {
         var11.set_Item(var9, var10);
      }

      if (var1.z7() + var9 > var11.size()) {
         var1.a6(var11.size() - var9);
      }

      c8[] var5 = new c8[var1.z7()];
      var5[0] = var10;

      for (int var6 = 1; var6 < var1.z7(); var6++) {
         c8 var7 = new c8(var10, var6, 0);
         var11.set_Item(var9 + var6, var7);
         var5[var6] = var7;
      }

      var10.n5(var5);

      for (int var14 = 1; var14 < var1.v4(); var14++) {
         var11 = this.a6.get_Item(this.u3 + var14);
         var5 = new c8[var1.z7()];

         for (int var15 = 0; var15 < var1.z7(); var15++) {
            c8 var8 = new c8(var10, var15, var14);
            var11.set_Item(var9 + var15, var8);
            var5[var15] = var8;
         }

         var10.n5(var5);
      }
   }

   private static void n5(int var0, List<c8> var1) {
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var1);

      while (var2.l6()) {
         ((c8)var2.k5()).u3(var0);
      }
   }

   @Override
   public void n5(y1 var1) {
      this.k5 = var1;
   }

   @Override
   public void n5() {
      if (this.u3 > 0 && this.k5.t1() != 9) {
         x8 var1 = j5.n5(this.k5.q_().m1());
         var1.n5(this, this.k5.t9(), true, this.k5.m_());
      }

      if (this.u3 < this.a6.size() - 1 && this.k5.u6() != 9) {
         x8 var3 = j5.n5(this.k5.q_().m1());
         var3.n5(this, this.k5.t9(), false, this.k5.m_());
      }

      if (this.a6.size() != 0) {
         com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3<>(this.a6.get_Item(this.u3));

         while (var4.l6()) {
            c8 var2 = (c8)var4.k5();
            if (var2 != null) {
               var2.n5(this.k5);
            }
         }

         this.n5((k7)this.k5);
      }
   }

   @Override
   public void n5(y2 var1) {
      this.n5((k7)var1);
   }

   private void n5(k7 var1) {
      List var2 = this.a6.get_Item(this.u3);
      this.h0 = var2;

      for (int var3 = 0; var3 < this.l6; var3++) {
         if (var2.get_Item(var3) == null) {
            var2.set_Item(var3, new u9(this.n5, this.k5, var3));
         }
      }

      this.c8.n5(var2, var1);
      if (this.u9) {
         n5(0, var2);
         this.u9 = false;
      }

      if (this.u3 == this.a6.size() - 1) {
         var1.b3().n5(this.a6);
         this.u3();
      } else {
         this.u3++;
      }

      this.k5 = null;
   }

   @Override
   public void l6(y2 var1) {
      this.u9 = true;
      this.c8.n5(var1);
   }

   @Override
   public void l6() {
      if (this.a6.size() > 0) {
         throw new d5("A table-cell is spanning more rows than available in its parent element.");
      }

      n5(1, this.h0);
      this.c8.n5();
   }

   @Override
   public void k5() {
      this.c8.l6();
   }
}
