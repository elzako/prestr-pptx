package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;

public class n3 extends y2 {
   private c8 t2;
   private z8 s7;
   private z1 x8;
   private int n3;
   private int y4;
   private d2 e2;

   public final d2 m1() {
      if (this.e2 == null) {
         this.e2 = new d2();
      }

      return this.e2;
   }

   public n3(com.aspose.slides.internal.t1.t9 var1, y1 var2) {
      this(var1.z3(), var1.b3(), var2, var1.t1(), var1.a5());
   }

   public n3(int var1, String var2, y1 var3, int var4, int var5) {
      super(var1, var2, var3);
      this.y4 = var4;
      this.n3 = var5;
      this.s7 = new z8(this);
   }

   public final int k7() {
      return this.y4;
   }

   public final int m3() {
      return this.n3;
   }

   public final z8 z8() {
      return this.s7;
   }

   public final boolean j5() {
      return (this.s7 == null || this.s7.m3()) && (this.x8 == null || this.x8.y2()) && (this.t2 == null || this.t2.y2());
   }

   public final c8 w1() {
      if (this.t2 == null) {
         this.t2 = new c8();
      }

      return this.t2;
   }

   public final z1 r4() {
      if (this.x8 == null) {
         this.x8 = new z1();
      }

      return this.x8;
   }

   public final int c4() {
      int var1 = 0;
      List var2 = this.z8().m1();
      int var3 = var2.size() - 1;

      for (int var4 = 0; var4 < var3; var4++) {
         var1 += ((d5)var2.get_Item(var4)).m3();
      }

      return this.e_() - var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.v8.u3 var1) {
      if (this.z8() != null) {
         this.z8().n5(var1);
      }
   }

   @Override
   public Object clone() {
      n3 var1 = (n3)super.clone();
      var1.s7 = new z8(var1);
      return var1;
   }
}
