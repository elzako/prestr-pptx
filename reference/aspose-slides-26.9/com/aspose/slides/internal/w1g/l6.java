package com.aspose.slides.internal.w1g;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.t6q.h0;
import com.aspose.slides.internal.v6g.u9;

public final class l6 extends h0 {
   private static final u9 u3 = new u9("xmpMM:DerivedFrom", "xmpMM:DocumentID", "xmpMM:InstanceID", "xmpMM:OriginalDocumentID");

   public l6() {
      super("xmpMM", "http://ns.adobe.com/xap/1.0/mm/");
   }

   @Override
   public void n5(String var1, String var2) {
      switch (u3.n5(var1)) {
         case 0:
            throw new NotSupportedException("Use index operator to assign the value.");
         case 1:
            this.k5(var2);
            break;
         case 2:
            this.u3(var2);
            break;
         case 3:
            this.a6(var2);
            break;
         default:
            super.n5(var1, var2);
      }
   }

   public final void k5(String var1) {
      this.l6(com.aspose.slides.internal.w1g.n5.l6, var1);
   }

   public final void u3(String var1) {
      this.l6(com.aspose.slides.internal.w1g.n5.k5, var1);
   }

   public final void a6(String var1) {
      this.l6(com.aspose.slides.internal.w1g.n5.u3, var1);
   }
}
