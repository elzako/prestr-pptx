package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public class y4 extends t4 {
   @Override
   public void l6(z1 var1) {
      this.u3(var1);
      if (var1.u9()) {
         this.e2(var1);
         var1.h0();
      }
   }

   private void e2(z1 var1) {
      z7 var2 = var1.u3();
      boolean var3 = false;
      boolean var4 = false;

      while (true) {
         switch (var2.n3()) {
            case 1:
               var1.t4();
               String var5 = var2.t9();
               String var6 = var2.e2();
               if (!com.aspose.slides.ms.System.Xml.v8.n5(var5, var2.k5().y6)) {
                  throw var1.x9();
               }

               n5 var7 = null;
               if (com.aspose.slides.ms.System.Xml.v8.n5(var6, var2.k5().b9)) {
                  if (var4) {
                     throw XsltException.create("'Xsl:when' must precede the 'Xsl:otherwise' element.");
                  }

                  var7 = var1.l6(1);
                  var3 = true;
               } else {
                  if (!com.aspose.slides.ms.System.Xml.v8.n5(var6, var2.k5().y8)) {
                     throw var1.x9();
                  }

                  if (var4) {
                     throw XsltException.create("An 'Xsl:choose' element can have only one 'Xsl:otherwise' child.");
                  }

                  var7 = var1.l6(2);
                  var4 = true;
               }

               this.n5(var7);
               var1.q0();
            case 5:
            case 6:
            case 7:
            case 8:
               if (!var1.a6()) {
                  if (!var3) {
                     throw XsltException.create("An 'Xsl:choose' element must have at least one 'Xsl:when' child.");
                  }

                  return;
               }
               break;
            case 2:
            case 3:
            case 4:
            default:
               throw XsltException.create("The contents of '{0}' are invalid.", "choose");
         }
      }
   }
}
