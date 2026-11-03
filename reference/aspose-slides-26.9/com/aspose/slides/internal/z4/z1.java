package com.aspose.slides.internal.z4;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.d1;

public abstract class z1 {
   protected c8 l6;
   private String n5;
   private final int k5;

   protected z1(c8 var1) {
      this.l6 = var1;
      this.k5 = var1.n5();
   }

   public final c8 h0() {
      return this.l6;
   }

   public final int c8() {
      return this.k5;
   }

   public final String t2() {
      return d1.n5("{0} 0 R", new Object[]{this.k5});
   }

   public final boolean s7() {
      return this.n3() != 0;
   }

   public final String x8() {
      if (this.n5 == null && this.s7()) {
         this.n5 = this.y4();
      }

      return this.n5;
   }

   public int n3() {
      return 0;
   }

   public abstract void n5(t4 var1);

   protected String y4() {
      if (!this.s7()) {
         throw new InvalidOperationException("Tried to generate a resource name not being a resource.");
      } else {
         return d1.n5("{0}{1}",new Object[]{ y1.k5(this.n3()), this.l6.k5().n5(this.n3()) + 1});
      }
   }

   protected final com.aspose.slides.internal.d0.k5 e2() {
      return this.l6.l6().z1() ? this.l6.s7().n5(this.c8(), 0) : null;
   }
}
