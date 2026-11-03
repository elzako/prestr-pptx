package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class r1x extends b3 {
   private y4u n5;
   private List<g7> l6;
   private m0l k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("pPr", "r", "br", "fld", "m", "endParaRPr");

   public r1x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n5(var1, new r1x$1(this, var1));
   }

   public r1x() {
      this.h0();
   }

   private void h0() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != null) {
         this.n5.n5("a", var2, "pPr");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 1:
                  ((r6a)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 2:
                  ((t1h)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((a1g)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((j0)var5.k5()).n5("a14", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "endParaRPr");
      }

      var2.s7();
   }

   public final y4u n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <pPr> element can be added.");
      }

      this.n5 = new y4u();
      return this.n5;
   }

   public final m0l l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <endParaRPr> element can be added.");
      }

      this.k5 = new m0l();
      return this.k5;
   }

   public final void n5(m0l var1) {
      this.k5 = var1;
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (u3.n5(var1)) {
         case 1:
            var2 = new g7("r", new r6a());
            break;
         case 2:
            var2 = new g7("br", new t1h());
            break;
         case 3:
            var2 = new g7("fld", new a1g());
            break;
         case 4:
            var2 = new g7("m", new j0());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.l6.addItem(var2);
      return var2;
   }

   public final y4u k5() {
      return this.n5;
   }

   public final List<g7> u3() {
      return this.l6;
   }

   public final m0l a6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static y4u n5(r1x var0, y4u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(r1x var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static m0l n5(r1x var0, m0l var1) {
      return var0.k5 = var1;
   }
}
