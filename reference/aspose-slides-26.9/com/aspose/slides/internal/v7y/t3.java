package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.ms.System.Xml.s2;

public class t3 extends com.aspose.slides.internal.x6s.k5 {
   private j9 n5;
   private String l6;
   private boolean k5;

   public t3(j9 var1, String var2, boolean var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final j9 l6() {
      if (this.k5) {
         throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
      } else {
         return this.n5;
      }
   }

   public String k5() {
      return this.l6;
   }

   public void n5() {
   }

   @Override
   public void n5(s2 var1) {
      this.n5((com.aspose.slides.ms.System.Xml.a3)var1);
   }

   public void n5(com.aspose.slides.ms.System.Xml.a3 var1) {
      com.aspose.slides.internal.k4s.h0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k4s.h0.class);
      if (var2 == null) {
         if (var1 == null) {
            var1 = new s2(new com.aspose.slides.ms.System.Xml.j9());
         }

         var2 = new t3$n5(var1);
      }

      this.n5.n5(var2);
      this.k5 = false;
   }
}
