package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class w7 extends h8 {
   private final f1 n5;
   private final v7u l6;

   public final f1 n5() {
      return this.n5;
   }

   public final v7u l6() {
      return this.l6;
   }

   public w7(n4 var1, t0 var2, f1 var3) {
      super(var1, var2);
      if (null == var1) {
         throw new ArgumentNullException("slide");
      }

      if (null == var3) {
         throw new ArgumentNullException("geometry");
      }

      this.n5 = var3;
      this.l6 = new v7u(this);
   }

   final z6e k5() {
      c2 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, c2.class);
      z6e var2;
      if (var1 == null) {
         var1 = ((x2)this.n5).n5();
         var2 = var1.u9().a6();
         var2.n5(new w9(var1.u9().n5().n5() + var1.n5().n5().n5(), var1.u9().n5().l6() + var1.n5().n5().l6()));
      } else {
         var2 = var1.u9().a6();
         var2.n5(var1.n5().n5());
      }

      var2.n5(var1.n5().l6());
      return var2;
   }
}
