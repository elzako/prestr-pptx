package com.aspose.slides.internal.t1;

import com.aspose.slides.internal.o9b.y1;

public class n3 extends y4 {
   public n3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public y1 n5(com.aspose.slides.internal.f2.n5 var1) {
      com.aspose.slides.internal.f2.u9 var2 = this.a6(0);
      com.aspose.slides.internal.f2.u9 var3 = this.u9(0);
      new y1();
      y1 var4;
      com.aspose.slides.internal.f2.u9 var5;
      switch (this.u6().l6()) {
         case 79:
         case 121:
         default:
            var5 = var2;
            var4 = new y1(0.0F, var1.l6 - this.a5().l6(var3), var1.n5, this.a5().l6(var3));
            break;
         case 140:
         case 205:
            var5 = var3;
            var4 = new y1(0.0F, var1.l6 - this.a5().l6(var2), this.a5().l6(var2), var1.n5);
      }

      if (this.t1() == 48) {
         this.n5(var4.y4(), this.u9.u6(), var5);
      }

      return var4;
   }

   @Override
   public String i1() {
      return "xsl-region-after";
   }

   @Override
   public String z1() {
      return "region-after";
   }

   @Override
   public int z3() {
      return 56;
   }
}
