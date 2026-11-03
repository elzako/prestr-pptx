package com.aspose.slides.internal.b5x;

import com.aspose.slides.exceptions.ArgumentException;

public class u3 extends com.aspose.slides.internal.i2i.a6 {
   private u9 u3;

   public u3() {
      this.n5 = "2.5.29.17";
      this.u3 = new u9();
   }

   public u3(com.aspose.slides.internal.i2i.a6 var1) {
      super(var1);
   }

   @Override
   protected void n5() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.k5.u3());
      if (com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 6) != 48) {
         throw new ArgumentException("Invalid SubjectAltName extension");
      }

      this.u3 = new u9(var1);
   }

   public String[] u9() {
      return this.u3.n5();
   }

   public String[] h0() {
      return this.u3.l6();
   }

   @Override
   public String toString() {
      return this.u3.toString();
   }
}
