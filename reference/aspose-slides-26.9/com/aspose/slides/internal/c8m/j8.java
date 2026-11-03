package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;

public class j8 extends y4 {
   private i4 n5 = null;
   private a2 l6;

   public i4 y4() {
      return this.n5;
   }

   public a2 e2() {
      return this.l6;
   }

   public z6 t9() {
      return (z6)super.x8();
   }

   j8(z6 var1, String var2, i4 var3, byte[] var4) {
      super(var1, var2, var4);
      this.l6(var3);
   }

   j8(z6 var1, com.aspose.slides.internal.e5a.y2 var2) {
      super(var1, var2);
   }

   public j8[] n5(w4 var1) {
      List var2 = new List();
      r7[] var3 = this.e2().n5(var1);

      for (r7 var7 : var3) {
         if (var7.h0() != 1) {
            j8 var8 = this.t9().u9(var7.n5());
            if (var8 != null) {
               var2.addItem(var8);
            }
         }
      }

      return (j8[])var2.toArray(new j8[0]);
   }

   public j8[] n5(i4 var1) {
      return this.n5(var1.l6());
   }

   public j8 z1() {
      if (this.e2() != null) {
         throw new Exception("Relationships is already exists.");
      }

      String var1 = z6.a6(this.l6());
      j8 var2 = new j8(this.t9(), var1, new h1(), null);
      var2.n5(new a2(this.t9()));
      this.t9().l6(var2);
      this.n5(var2.e2());
      return var2;
   }

   void l6(i4 var1) {
      this.n5 = var1;
   }

   public void n5(a2 var1) {
      this.l6 = var1;
   }
}
