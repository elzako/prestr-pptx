package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d5n extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "rPr",
      "alias",
      "lock",
      "placeholder",
      "showingPlcHdr",
      "dataBinding",
      "temporary",
      "id",
      "tag",
      "equation",
      "comboBox",
      "date",
      "docPartObj",
      "docPartList",
      "dropDownList",
      "picture",
      "richText",
      "text",
      "citation",
      "group",
      "bibliography"
   );

   public d5n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new d5n$1(this, var1));
   }

   public d5n() {
      this.l6();
   }

   private void l6() {
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
                  ((h5a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 1:
                  ((y4q)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 2:
                  ((y2k)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 3:
                  ((n6i)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 4:
                  ((a5j)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 5:
                  ((o9j)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 6:
                  ((a5j)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 7:
                  ((k4b)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 8:
                  ((y4q)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 9:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 10:
                  ((x5z)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 11:
                  ((a5e)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 12:
                  ((m9f)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 13:
                  ((m9f)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 14:
                  ((x5x)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 15:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 16:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 17:
                  ((s1d)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 18:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 19:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 20:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(d5n var0) {
      return var0.n5;
   }
}
