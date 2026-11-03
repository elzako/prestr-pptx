package com.aspose.slides.internal.w0;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public class h0 extends u3 {
   private double n5;
   private com.aspose.slides.internal.p1s.n5 l6;
   private boolean k5;
   private y1 u3 = y1.n5.y4();
   private com.aspose.slides.internal.p1s.n5 a6;
   private w1 u9 = w1.n5.u3();
   private w1 h0 = w1.n5.u3();

   public h0(y1 var1, com.aspose.slides.internal.p1s.n5 var2, com.aspose.slides.internal.p1s.n5 var3) {
      super(3);
      this.n5(var1.y4());
      this.n5(var2);
      this.l6(var3);
   }

   public h0(y1 var1, double var2, boolean var4) {
      this(var1.y4(), com.aspose.slides.internal.p1s.n5.b2, com.aspose.slides.internal.p1s.n5.b2);
      this.n5 = var2;
      this.k5 = var4;
   }

   public h0(w1 var1, w1 var2, com.aspose.slides.internal.p1s.n5 var3, com.aspose.slides.internal.p1s.n5 var4) {
      super(3);
      this.n5(var3);
      this.l6(var4);
      var1.n5(this.u9);
      var2.n5(this.h0);
   }

   public final y1 a6() {
      return this.u3;
   }

   public final void n5(y1 var1) {
      var1.a6(this.u3);
   }

   public final com.aspose.slides.internal.p1s.n5 u9() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.a6 = var1;
   }

   public final com.aspose.slides.internal.p1s.n5 h0() {
      return this.l6;
   }

   public final void l6(com.aspose.slides.internal.p1s.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.l6 = var1;
   }

   public final boolean c8() {
      return this.k5;
   }

   public final double t2() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final w1 s7() {
      return this.u9;
   }

   public final w1 x8() {
      return this.h0;
   }
}
