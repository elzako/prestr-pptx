package com.aspose.slides.internal.a8;

import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.l7h.u6;
import com.aspose.slides.ms.System.Xml.y7;

public class n3 {
   private j5 n5 = j5.z3();
   private boolean l6;
   private String k5 = "\t";
   private boolean u3;

   public final j5 n5() {
      return this.n5;
   }

   public final void n5(j5 var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public static n3 a6() {
      n3 var0 = new n3();
      var0.n5(true);
      var0.n5("\t");
      var0.l6(true);
      var0.n5(new u6(false));
      return var0;
   }

   final y7 u9() {
      y7 var1 = new y7();
      var1.l6(this.l6());
      var1.n5(this.k5());
      var1.n5(this.u3());
      var1.n5(this.n5());
      return var1;
   }
}
