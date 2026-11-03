package com.aspose.slides.internal.v1y;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;

public class x8 extends l6<s7> {
   public x8(com.aspose.slides.internal.t9z.h0 var1, com.aspose.slides.internal.x4g.u9 var2) {
      super(var1, var2);
   }

   @Override
   protected com.aspose.slides.internal.x4g.s7 k5() {
      return this.u3.y4();
   }

   protected s7 h0() {
      return new s7();
   }

   protected s7 c8() {
      s7 var1 = (s7)super.a6();
      float var2 = this.l6();
      if (2.0F * var2 < this.n5.u3()) {
         var1.z3 = true;
      }

      return var1;
   }

   @Override
   protected float u9() {
      float var1 = super.u9();
      if (this.n5.l6() >= 0.0F && var1 * this.n5.l6() < this.n5.u3()) {
         var1 /= 2.0F;
      }

      return var1;
   }

   protected boolean n5(s7 var1) {
      return !var1.z3 || !(this.n5.l6() >= 0.0F);
   }

   protected void l6(s7 var1) {
      float var2 = var1.h0[0];
      float var3 = var1.h0[1];
      float var4 = var1.a6;
      float var5 = var1.u9;
      double var6 = com.aspose.slides.internal.e3j.u9.k5(var1.k5, var1.u3, var2, var3);
      if (var1.z3) {
         if (!(this.n5.l6() < 0.0F) || !(var6 < var1.l6)) {
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
            var1.x8 = true;
         }
      } else {
         float var8 = this.u3.t2() * this.l6.q0();
         if (!(var6 < var8)) {
            if (var6 == var1.l6) {
               if (var1.z1) {
                  var1.t2.l6();
                  var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
                  var1.x8 = true;
               }
            } else if (var6 > var1.l6) {
               if (var1.z1) {
                  w1 var9 = new w1(0.0F, var1.n5);
                  w1 var10 = this.n5(var1, var2, var3, var9);
                  var1.t2.l6();
                  if (!com.aspose.slides.internal.e3j.u9.n5(var10, new w1(var1.a6, var1.u9), 0.01F)) {
                     var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var10.l6(), var10.k5()));
                  }

                  var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
                  var1.x8 = true;
               } else {
                  var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
                  var1.x8 = true;
                  if (var1.k5 != var4 || var1.u3 != var5) {
                     float var11 = this.n5(var1, var4, var5, var2, var3);
                     if (var11 != 0.0F) {
                        m1 var12 = new m1();
                        var12.n5((float)Math.toDegrees(var11));
                        this.u3.y4().l6(var12);
                        var1.s7 = this.u3;
                     }
                  }
               }
            }
         }
      }

      this.n5(var1, var2, var3);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected void k5(s7 bridgeArg0) {
      this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected s7 a6() {
      return this.c8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected s7 u3() {
      return this.h0();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected s7 n5() {
      return this.c8();
   }

}
