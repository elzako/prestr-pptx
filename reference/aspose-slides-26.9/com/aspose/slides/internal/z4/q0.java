package com.aspose.slides.internal.z4;

import com.aspose.slides.ms.System.d1;

public class q0 extends z1 {
   public q0(c8 var1) {
      super(var1);
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this.e2());
      var1.n5(this);
      var1.c8();
      com.aspose.slides.internal.b8.u9 var2 = this.l6.c8();
      if (d1.n5(var2.l6()) && (this.l6.e2() || this.l6.l6().x8() == 9)) {
         var2.l6("Untitled Document");
         if (this.l6.l6().m3() != null) {
            this.l6.l6().m3().n5(new com.aspose.slides.internal.g3.u3("The presentation has no title. It has been saved as \"Untitled Document\""));
         }
      }

      var1.u3("/Title", var2.l6());
      var1.u3("/Author", var2.k5());
      var1.u3("/Subject", var2.u3());
      var1.u3("/Keywords", var2.u9());
      var1.u3("/Creator", var2.a6());
      var1.u3("/Producer", var2.n5());
      var1.n5("/CreationDate", var2.n3().m3());
      var1.n5("/ModDate", var2.y4().m3());
      var1.t2();
      var1.l6();
   }
}
