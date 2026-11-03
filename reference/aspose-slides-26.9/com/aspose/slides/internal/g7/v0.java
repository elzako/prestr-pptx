package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class v0 extends i2 {
   private String n5;
   private y8 l6;
   private y8[] k5;
   private int u3;
   private y0 a6;
   private h6 u9;
   private i1 h0;
   private n2 c8;
   private List<Integer> t2;
   private Object s7 = new Object();
   private Object x8 = new Object();

   public v0(n2 var1) {
      this.a6 = new y0(this);
      this.u9 = new h6();
      this.h0 = new i1(this);
      this.c8 = var1;
      this.u3 = 0;
      this.t2 = new List<>();
   }

   public final h6 n5() {
      return this.u9;
   }

   public final y8[] l6() {
      return this.k5;
   }

   public final void n5(y8[] var1) {
      this.k5 = var1;
   }

   public final y8 k5() {
      return this.l6;
   }

   public final void n5(y8 var1) {
      this.l6 = var1;
   }

   public final List<Integer> u3() {
      return this.t2;
   }

   @Override
   public int a6() {
      return 2;
   }

   @Override
   public String u9() {
      return this.n5;
   }

   public final boolean h0() {
      return this.k5().n5().n5;
   }

   public int c8() {
      return this.n5().h0().k5();
   }

   @Override
   public t7 t2() {
      return this.a6;
   }

   @Override
   public v7 s7() {
      return this.h0;
   }

   @Override
   public n2 x8() {
      return this.c8;
   }

   @Override
   public d3 n3() {
      return new e9(this);
   }

   @Override
   public k6 n5(r9 var1) {
      k2 var2;
      if ((var2 = com.aspose.slides.internal.v6g.k5.n5(var1, k2.class)) != null) {
         return this.n5(var2.n5());
      } else {
         k3 var3;
         if ((var3 = com.aspose.slides.internal.v6g.k5.n5(var1, k3.class)) != null) {
            return this.n5(var3.n5());
         } else {
            throw new z0("string name Glyph ID is not supported for this font type.");
         }
      }
   }

   public final k6 n5(String var1) {
      int var2 = this.l6(var1);
      return var2 != -1 ? this.n5(var2) : null;
   }

   public final int l6(String var1) {
      i1 var2 = com.aspose.slides.internal.v6g.k5.n5(this.s7(), i1.class);
      if (var2 != null) {
         s1 var3 = var2.l6();
         if (var3.l6(var1)) {
            k2 var4 = (k2)this.s7().l6((char)var3.n5(var1));
            return var4.n5();
         }
      }

      return -1;
   }

   public final k6 n5(int var1) {
      int var2 = 0;
      int var3 = 0;
      double var4 = 0.0;
      y8 var6 = this.k5();
      if (this.k5 != null && this.k5.length != 0) {
         byte var7 = this.n5().l6().n5(var1);
         if ((var7 & 255) < this.k5.length) {
            var6 = this.k5[var7 & 0xFF];
         }
      }

      var4 = var6.l6().n5;
      int[] var15 = new int[]{0};
      int[] var8 = new int[]{0};
      this.u9.h0().n5(var1, var15, var8);
      var2 = var15[0];
      var3 = var8[0];
      y1 var9 = new y1(this.k5().n5().y4);
      k6 var10 = new k6();
      y2 var11 = new y2(var9, this, var6, var10);
      var9.n5(var11);
      var11.n5().k5(var4);
      var9.l6(new m1(this.u9.h0().u9(), var2, var3));
      return var10;
   }
}
