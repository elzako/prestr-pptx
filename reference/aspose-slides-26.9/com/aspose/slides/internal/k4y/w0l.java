package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w0l extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "name", "charset", "family", "b", "i", "strike", "outline", "shadow", "condense", "extend", "color", "sz", "u", "vertAlign", "scheme"
   );

   public w0l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new w0l$1(this, var1));
   }

   public w0l() {
      this.k5();
   }

   private void k5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((q2z)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 1:
                  ((p2k)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 2:
                  ((p2k)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 3:
                  ((w7c)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 4:
                  ((w7c)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 5:
                  ((w7c)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 6:
                  ((w7c)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 7:
                  ((w7c)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 8:
                  ((w7c)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 9:
                  ((w7c)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 10:
                  ((v6p)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 11:
                  ((o4f)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 12:
                  ((y5v)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 13:
                  ((q0b)var5.k5()).n5("ssml", var2, var5.n5());
                  break;
               case 14:
                  ((a8v)var5.k5()).n5("ssml", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(w0l var0) {
      return var0.n5;
   }
}
