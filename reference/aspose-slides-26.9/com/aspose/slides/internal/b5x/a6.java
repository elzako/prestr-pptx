package com.aspose.slides.internal.b5x;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.p8;

public class a6 extends com.aspose.slides.internal.i2i.a6 {
   private boolean u3;
   private int a6;

   public a6() {
      this.n5 = "2.5.29.19";
      this.a6 = -1;
   }

   public a6(com.aspose.slides.internal.i2i.a6 var1) {
      super(var1);
   }

   @Override
   protected void n5() {
      this.u3 = false;
      this.a6 = -1;
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.k5.u3());
      if (var1.l6() != 48) {
         throw new ArgumentException("Invalid BasicConstraints extension");
      }

      int var2 = 0;
      com.aspose.slides.internal.x8w.l6 var3 = var1.n5(var2++);
      if (var3 != null && var3.l6() == 1) {
         this.u3 = var3.u3()[0] == 255;
         var3 = var1.n5(var2++);
      }

      if (var3 != null && var3.l6() == 2) {
         this.a6 = com.aspose.slides.internal.x8w.k5.n5(var3);
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6((byte)48);
      if (this.u3) {
         var1.n5(new com.aspose.slides.internal.x8w.l6((byte)1, new byte[]{-1}));
      }

      if (this.u3 && this.a6 >= 0) {
         var1.n5(com.aspose.slides.internal.x8w.k5.n5(this.a6));
      }

      this.k5 = new com.aspose.slides.internal.x8w.l6((byte)4);
      this.k5.n5(var1);
   }

   public boolean u9() {
      return this.u3;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("Subject Type=");
      var1.n5(this.u3 ? "CA" : "End Entity");
      var1.n5(p8.n5);
      var1.n5("Path Length Constraint=");
      if (this.a6 == -1) {
         var1.n5("None");
      } else {
         var1.n5(a3.n5(this.a6, com.aspose.slides.internal.x7n.l6.k5()));
      }

      var1.n5(p8.n5);
      return var1.toString();
   }
}
