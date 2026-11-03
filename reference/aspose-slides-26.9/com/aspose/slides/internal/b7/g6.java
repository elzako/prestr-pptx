package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class g6 implements IGenericCloneable<g6> {
   private int n5 = -1;
   private int l6 = 1;
   private int k5 = -1;
   private double u3 = n5();
   private double a6 = l6();
   private int u9 = 0;
   private y7 h0 = new p0(0);
   private i7 c8 = new i7();
   private i7 t2 = new i7();
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "ctr", "in", "flat", "rnd", "sq", "dbl", "sng", "thickThin", "thinThick", "tri"
   );

   public static double n5() {
      return 800000.0;
   }

   public static int l6() {
      return 25400;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }

   public void l6(int var1) {
      this.l6 = var1;
   }

   public void k5(int var1) {
      this.k5 = var1;
   }

   public void n5(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.u3 = var1;
   }

   public void l6(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.a6 = var1;
      double var3 = 9525.0;
      if (this.a6 < var3) {
         this.a6 = var3;
      }
   }

   public void u3(int var1) {
      this.u9 = var1;
   }

   public void n5(y7 var1) {
      if (this.h0 != var1) {
         if (null == var1) {
            throw new ArgumentNullException("value");
         }

         this.h0 = var1.n5();
      }
   }

   public i7 k5() {
      return this.c8;
   }

   public i7 u3() {
      return this.t2;
   }

   public g6 a6() {
      g6 var1 = new g6();
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0.n5();
      var1.c8 = this.c8.n5();
      var1.t2 = this.t2.n5();
      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g6 cloneT() {
      return this.a6();
   }

}
