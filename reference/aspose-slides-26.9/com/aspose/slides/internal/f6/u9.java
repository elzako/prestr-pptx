package com.aspose.slides.internal.f6;

import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.w0.c8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z4.p8;
import com.aspose.slides.internal.z4.t4;

public class u9 extends p8 {
   private e2 n5;
   private y1 k5 = y1.n5.y4();
   private c8 u3;

   public u9(com.aspose.slides.internal.z4.c8 var1) {
      super(var1);
   }

   @Override
   public void l6(t4 var1) {
      super.l6(var1);
      var1.k5("/Type", "/XObject");
      var1.k5("/Subtype", "/Form");
      var1.n5("/FormType", 1);
      var1.n5("/BBox", this.k5.y4());
      if (this.u3 != null) {
         var1.n5("/Matrix", this.u3);
      }

      this.l6.t2().n5(var1, "/Resources");
   }

   @Override
   public void n5(t4 var1) {
      this.n5(this.n5.getBuffer(), 0, (int)this.n5.getLength());
      super.n5(var1);
   }

   public final y1 n5() {
      return this.k5;
   }

   public final void n5(y1 var1) {
      var1.a6(this.k5);
   }

   public final e2 l6() {
      return this.n5;
   }

   public final void n5(e2 var1) {
      this.n5 = var1;
   }
}
