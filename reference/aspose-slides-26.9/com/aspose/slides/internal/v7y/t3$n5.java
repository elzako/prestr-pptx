package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.XPathException;

class t3$n5 extends com.aspose.slides.internal.k4s.h0 {
   private com.aspose.slides.ms.System.Xml.a3 n5;

   public t3$n5(com.aspose.slides.ms.System.Xml.a3 var1) {
      super(false);
      this.n5 = var1;
   }

   @Override
   public String l6() {
      return com.aspose.slides.ms.System.d1.n5;
   }

   @Override
   public String n5(String var1) {
      if (var1.length() == 0) {
         return com.aspose.slides.ms.System.d1.n5;
      } else {
         String var2 = this.n5.n5(var1);
         if (var2 == null) {
            throw XPathException.create("Namespace prefix '{0}' is not defined.", var1);
         } else {
            return var2;
         }
      }
   }

   @Override
   public com.aspose.slides.internal.k4s.l6 l6(String var1, String var2) {
      throw XPathException.create("XsltContext is needed for this query because of an unknown function.");
   }

   @Override
   public com.aspose.slides.internal.k4s.n5 n5(String var1, String var2, int[] var3) {
      throw XPathException.create("XsltContext is needed for this query because of an unknown function.");
   }

   @Override
   public boolean a6() {
      return false;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.x6s.a6 var1) {
      return false;
   }
}
