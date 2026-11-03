package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s0d extends b3 {
   private String n5;
   private List<h5w> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Id", "CommitmentTypeIndication");

   public s0d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      s0d$1 var2 = new s0d$1(this);
      n5(var1, var2);
      n5(var1, new s0d$2(this, var1));
   }

   public s0d() {
      this.k5();
   }

   private void k5() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            h5w var5 = (h5w)var4.next();
            var5.n5("xd", var2, "CommitmentTypeIndication");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final h5w n5() {
      h5w var1 = new h5w();
      this.l6.addItem(var1);
      return var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(s0d var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(s0d var0) {
      return var0.l6;
   }
}
