package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class c3u extends e2 {
   private a5x n5;
   private n5u l6;
   private List<g7> k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "nvGrpSpPr", "grpSpPr", "sp", "grpSp", "AlternateContent", "extLst"
   );

   public c3u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      n5(var1, new c3u$1(this, var1));
   }

   public c3u() {
      this.u9();
      this.n5 = new a5x();
      this.l6 = new n5u();
   }

   private void u9() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("dsp", var2, "nvGrpSpPr");
      this.l6.n5("dsp", var2, "grpSpPr");
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (a6.n5(var5.n5())) {
               case 2:
                  ((f6w)var5.k5()).n5("dsp", var2, var5.n5());
                  break;
               case 3:
                  ((c3u)var5.k5()).n5("dsp", var2, var5.n5());
                  break;
               case 4:
                  ((j9u)var5.k5()).n5("mc", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("dsp", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public void n5(x8 var1) {
      this.u3 = (l8r)var1;
   }

   @Override
   public g7 n5(String var1) {
      g7 var2;
      switch (a6.n5(var1)) {
         case 2:
            var2 = new g7("sp", new f6w());
            break;
         case 3:
            var2 = new g7("grpSp", new c3u());
            break;
         case 4:
            var2 = new g7("AlternateContent", new j9u());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.k5.addItem(var2);
      return var2;
   }

   @Override
   public t9 n5() {
      return this.n5;
   }

   @Override
   public n5u l6() {
      return this.l6;
   }

   @Override
   public List<g7> k5() {
      return this.k5;
   }

   @Override
   public x8 u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static a5x n5(c3u var0, a5x var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static n5u n5(c3u var0, n5u var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(c3u var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static l8r n5(c3u var0, l8r var1) {
      return var0.u3 = var1;
   }
}
