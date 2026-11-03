package com.aspose.slides.internal.y4;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class t2 extends com.aspose.slides.internal.k5.u9 {
   private String n5;
   private com.aspose.slides.internal.k5.u9[] l6;

   public t2(String var1, com.aspose.slides.internal.k5.u9... var2) {
      super((short)3);
      this.n5 = var1;
      this.l6 = var2;
   }

   public final String n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.k5.u9[] l6() {
      return this.l6;
   }

   @Override
   public String u9() {
      a5 var1 = new a5();
      var1.n5(this.n5).n5('(');
      if (this.l6.length != 0) {
         var1.n5(this.l6[0].u9());

         for (int var2 = 1; var2 < this.l6.length; var2++) {
            var1.n5(", ").n5(this.l6[1].u9());
         }
      }

      var1.n5(')');
      return var1.toString();
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)9);
   }

   @Override
   protected boolean n5(com.aspose.slides.internal.k5.u9 var1) {
      t2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, t2.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : d1.a6(this.n5, var2.n5);
      }
   }
}
