package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class f0w extends b3 {
   private String n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("number", "p", "h", "list", "soft-page-break");

   public f0w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new f0w$1(this, var1));
   }

   public f0w() {
      this.k5();
   }

   private void k5() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5("text", var2, "number", this.n5, false);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 2:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 3:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (k5.n5(var1)) {
         case 1:
            var2 = new g7("p", new u1x());
            break;
         case 2:
            var2 = new g7("h", new m2v());
            break;
         case 3:
            var2 = new g7("list", new u0y());
            break;
         case 4:
            var2 = new g7("soft-page-break", new j0v());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.l6.addItem(var2);
      return var2;
   }

   public final List<g7> n5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(f0w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(f0w var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static List l6(f0w var0) {
      return var0.l6;
   }
}
