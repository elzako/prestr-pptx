package com.aspose.slides.internal.x9;

import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;

public class b3 extends y1 {
   public b3(com.aspose.slides.internal.v4.f2 var1) {
      super(var1);
   }

   @Override
   public com.aspose.slides.internal.d2.c8 l6(t1 var1) {
      com.aspose.slides.internal.d2.c8 var2 = new com.aspose.slides.internal.d2.c8();
      if (this.k5.a0()) {
         p6.n5(var2, this.k5.y1());
      }

      return var2;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      if (this.k5.a0()) {
         this.c4();
         if (com.aspose.slides.internal.v6g.k5.l6(this.u3, com.aspose.slides.internal.p3.y4.class)
            && !com.aspose.slides.internal.v6g.k5.l6(this.u3, com.aspose.slides.internal.p3.x8.class)) {
            com.aspose.slides.internal.a0.t2 var4 = new com.aspose.slides.internal.a0.t2();
            p6.n5(var4, this.k5.y1());
            this.u3.l6(var4);
         } else {
            com.aspose.slides.internal.d2.c8 var3 = this.a0();
            this.u3.l6(var3);
         }
      }

      while (var1.l6()) {
         var1.k5();
      }
   }

   @Override
   public void c4() {
      this.z8().k5(this.k5.y1());
   }
}
