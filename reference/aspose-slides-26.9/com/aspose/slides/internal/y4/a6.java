package com.aspose.slides.internal.y4;

import com.aspose.slides.internal.l7h.a5;

public class a6 extends n5 {
   private com.aspose.slides.internal.k5.u3 n5;
   private com.aspose.slides.internal.k5.u3 l6;
   private com.aspose.slides.internal.k5.u3 k5;

   public a6(com.aspose.slides.internal.k5.u3 var1, com.aspose.slides.internal.k5.u3 var2, com.aspose.slides.internal.k5.u3 var3) {
      super((short)23);
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public String u9() {
      a5 var1 = new a5();
      var1.n5("counters(");
      var1.n5(this.n5.l6());
      var1.n5(", ");
      var1.n5(this.k5.l6());
      if (this.l6 != null) {
         var1.n5(", ");
         var1.n5(this.l6.l6());
      }

      var1.n5(")");
      return var1.toString();
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public com.aspose.slides.internal.k5.t2 k5() {
      return new com.aspose.slides.internal.k5.t2(this.n5.l6(), this.l6 != null ? this.l6.l6() : null, this.k5.l6());
   }
}
