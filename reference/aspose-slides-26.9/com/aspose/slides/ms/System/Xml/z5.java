package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;

public class z5 extends i0 {
   private l0 n5;

   public z5(l0 var1) {
      this.n5 = var1;
   }

   @Override
   public l0 n5(int var1) {
      if (var1 < 0) {
         return null;
      }

      for (l0 var2 = this.n5.getFirstChild(); var2 != null; var1--) {
         if (var1 == 0) {
            return var2;
         }

         var2 = var2.getNextSibling();
      }

      return null;
   }

   @Override
   public int n5() {
      int var1 = 0;

      for (l0 var2 = this.n5.getFirstChild(); var2 != null; var2 = var2.getNextSibling()) {
         var1++;
      }

      return var1;
   }

   @Override
   public IEnumerator iterator() {
      return this.n5.getFirstChild() == null ? XmlDocument.EmptyEnumerator : new p7(this.n5);
   }
}
