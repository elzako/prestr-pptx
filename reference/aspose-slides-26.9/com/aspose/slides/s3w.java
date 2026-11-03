package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class s3w {
   public final void n5(IMathBlock var1, com.aspose.slides.internal.z0k.t4 var2) {
      c8r var3 = new c8r();
      var3.n5(1);
      com.aspose.slides.ms.System.Xml.y7 var4 = new com.aspose.slides.ms.System.Xml.y7();
      var4.l6(true);
      var4.n5("\t");
      var4.n5(com.aspose.slides.internal.l7h.j5.z3());
      com.aspose.slides.ms.System.Xml.l1 var5 = com.aspose.slides.ms.System.Xml.l1.n5(var2, var4);

      try {
         var5.k5("math", "http://www.w3.org/1998/Math/MathML");
         var5.u3("display", var3.n5() == 1 ? "block" : "inline");
         var3.n5(true);

         try {
            g3g var6 = new g3g(var5, var3);
            var6.n5(var1);
            var5.s7();
            var5.u9();
         } finally {
            var3.k5();
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   public final void n5(IMathParagraph var1, com.aspose.slides.internal.z0k.t4 var2) {
      c8r var3 = new c8r();
      var3.n5(1);
      com.aspose.slides.ms.System.Xml.y7 var4 = new com.aspose.slides.ms.System.Xml.y7();
      var4.l6(true);
      var4.n5("\t");
      var4.n5(com.aspose.slides.internal.l7h.j5.z3());
      com.aspose.slides.ms.System.Xml.l1 var5 = com.aspose.slides.ms.System.Xml.l1.n5(var2, var4);

      try {
         var5.k5("math", "http://www.w3.org/1998/Math/MathML");
         var5.u3("display", var3.n5() == 1 ? "block" : "inline");
         this.n5(var5, var1);
         if (var1.getCount() > 0) {
            String var6 = null;
            switch (var1.getJustification()) {
               case 1:
                  var6 = "left";
                  break;
               case 2:
                  var6 = "right";
                  break;
               case 3:
               case 4:
                  var6 = "center";
            }

            var3.n5(var1.getCount() == 1);

            try {
               g3g var7 = new g3g(var5, var3);
               if (var1.getCount() <= 1) {
                  var7.n5(var1.get_Item(0));
               } else {
                  var5.y4("mtable");
                  var5.u3("columnalign", var6);
                  IGenericEnumerator var8 = var1.iterator();

                  try {
                     while (var8.hasNext()) {
                        IMathBlock var9 = (IMathBlock)var8.next();
                        var5.y4("mtr");
                        var5.y4("mtd");
                        var7.n5(var9);
                        var5.s7();
                        var5.s7();
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                        var8.dispose();
                     }
                  }

                  var5.s7();
               }
            } finally {
               var3.k5();
            }
         }

         var5.s7();
         var5.u9();
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.ms.System.Xml.l1 var1, IMathParagraph var2) {
      float var3 = this.n5(var2);
      if (!com.aspose.slides.ms.System.n1.k5(var3)) {
         var1.u3("mathsize", this.n5(var3));
      }
   }

   private String n5(float var1) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.n1.n5(var1, com.aspose.slides.internal.x7n.l6.k5()), "px"});
   }

   private float n5(IMathParagraph var1) {
      if (var1 != null && var1.getCount() != 0) {
         List var2 = new List();
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               IMathElement var4 = (IMathElement)var3.next();
               this.n5(var4, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         List$Enumerator var15 = var2.iterator();

         try {
            while (var15.hasNext()) {
               IMathElement var5 = (IMathElement)var15.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var5, MathematicalText.class)) {
                  return ((MathematicalText)var5).getFormat().getFontHeight();
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var5, q8r.class)) {
                  q8r var6 = (q8r)var5;
                  if (var6.getControlCharacterProperties() != null && var6.getControlCharacterProperties().l6() != null) {
                     return var6.getControlCharacterProperties().l6().getFontHeight();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
               var15.dispose();
            }
         }

         return Float.NaN;
      } else {
         return Float.NaN;
      }
   }

   private void n5(IMathElement var1, List<IMathElement> var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, MathBlock.class)) {
         IGenericEnumerator var3 = ((MathBlock)var1).iterator();

         try {
            while (var3.hasNext()) {
               IMathElement var4 = (IMathElement)var3.next();
               this.n5(var4, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      } else {
         var2.addItem(var1);
      }
   }
}
