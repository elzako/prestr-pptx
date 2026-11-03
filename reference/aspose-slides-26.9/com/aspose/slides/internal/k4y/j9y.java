package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j9y extends x8 {
   private boolean n5;
   private List<b2l> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("mod", "ext");

   public j9y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      j9y$1 var2 = new j9y$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (k5.n5(var1.n3())) {
                  case 1:
                     b2l var5 = new b2l(var1);
                     this.l6.addItem(var5);
                     var4 = true;
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public j9y() {
      this.u9();
   }

   private void u9() {
      this.n5 = false;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("mod", this.n5 ? "1" : "0");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            b2l var5 = (b2l)var4.next();
            var5.n5("p", var2, "ext");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   @Override
   protected x8 k5() {
      return new j9y();
   }

   @Override
   public d3 l6() {
      b2l var1 = new b2l();
      this.l6.addItem(var1);
      return var1;
   }

   @Override
   public d3[] n5() {
      return this.l6.toArray(new b2l[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(j9y var0, boolean var1) {
      return var0.n5 = var1;
   }
}
