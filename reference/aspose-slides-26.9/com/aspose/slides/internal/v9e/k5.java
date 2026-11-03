package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.k6;

public class k5 extends t9 {
   private k6 n5;
   private j8 l6;

   public void l6(z1 var1) {
      this.a6(var1);
      if (!var1.y4()) {
         throw XsltException.create(
            "The 'Xsl:apply-imports' instruction cannot be included within the content of an 'Xsl:for-each' instruction or within an 'Xsl:template' instruction without the 'match' attribute."
         );
      }

      this.n5 = var1.j5();
      this.l6 = var1.c8();
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            var1.n5(var2.u9(), this.n5, this.l6);
            var2.n5(2);
            break;
         case 2:
            var2.s7();
      }
   }
}
