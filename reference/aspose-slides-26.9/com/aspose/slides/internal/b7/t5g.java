package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.NotImplementedException;

abstract class t5g extends m6n {
   private final v2s n5;
   private final w1n l6;
   private final f1c k5;
   private final p6t u3;
   private final u6p a6;

   protected t5g(v2s var1, f1c var2, p6t var3, u6p var4, w1n var5) {
      this.n5 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.l6 = var5;
   }

   public v2s n5() {
      return this.n5;
   }

   protected w1n l6() {
      w1n var1 = this.l6.c8();
      var1.n5(this.c8());
      var1.u3(this.t2());
      r6i var2 = this.s7();
      var1.k5(var2);
      var1.l6(var2);
      var1.n5(var2);
      var1.u3(var2);
      return var1;
   }

   private n9 c8() {
      n9 var1 = null;
      p6w var2 = this.k5 instanceof p6w ? (p6w)this.k5 : null;
      if (null != var2) {
         var1 = this.l6.l6().n5();
      } else {
         p4l var3 = this.k5 instanceof p4l ? (p4l)this.k5 : null;
         if (null == var3) {
            throw new NotImplementedException();
         }

         var1 = new d0(var3.l6());
      }

      return var1;
   }

   private double t2() {
      e3m var1 = this.u3 instanceof e3m ? (e3m)this.u3 : null;
      double var2;
      if (null != var1) {
         var2 = this.l6.h0();
      } else {
         k9m var4 = this.u3 instanceof k9m ? (k9m)this.u3 : null;
         if (null != var4) {
            var2 = this.l6.h0() * var4.l6() / 100000.0;
         } else {
            h3d var5 = this.u3 instanceof h3d ? (h3d)this.u3 : null;
            if (null == var5) {
               throw new NotImplementedException();
            }

            var2 = var5.l6();
         }
      }

      return var2;
   }

   private r6i s7() {
      o8m var1 = this.a6 instanceof o8m ? (o8m)this.a6 : null;
      r6i var2;
      if (null != var1) {
         var2 = this.l6.k5();
      } else {
         f3c var3 = this.a6 instanceof f3c ? (f3c)this.a6 : null;
         if (null == var3) {
            throw new NotImplementedException();
         }

         var2 = var3.l6();
      }

      return var2;
   }
}
